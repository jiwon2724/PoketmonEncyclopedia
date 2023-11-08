package com.poketmonencyclopedia.detail

import android.util.Log
import com.poketmonencyclopedia.detail.model.ability.AbilityResponse
import com.poketmonencyclopedia.domain.detail.DetailResponse
import com.poketmonencyclopedia.detail.model.information.InformationResponse
import com.poketmonencyclopedia.detail.model.species.SpeciesResponse
import com.poketmonencyclopedia.domain.detail.PoketmonDetailRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onEmpty
import kotlinx.coroutines.flow.zip
import retrofit2.Response
import javax.inject.Inject

class PoketmonDetailRepositoryImpl @Inject constructor(private val poketmonDetailApi: PoketmonDetailApi) : PoketmonDetailRepository {
    private suspend fun getPoketmonInformation(): Flow<InformationResponse> = flow {
        poketmonDetailApi.getPoketmonInformation()
    }

    private suspend fun getPoketmonAbility(): Flow<Response<AbilityResponse>> = flow {
        emit(poketmonDetailApi.getPoketmonAbility())
    }

    private suspend fun getPoketmonSpecies(): Flow<Response<SpeciesResponse>> = flow {
        emit(poketmonDetailApi.getPoketmonSpecies())
    }

    override suspend fun getPoketmonDetail(): Flow<DetailResponse> {
        // TODO : 리팩토링
        val detailResponse = DetailResponse()
        val mergeResult = getPoketmonAbility().zip(getPoketmonSpecies()) { abilityResponse, speciesResponse ->
            detailResponse.copy(
                name = speciesResponse.body()?.name,
                description = speciesResponse.body()?.name.toString(),
                type = speciesResponse.body()?.gender_rate.toString(),
                ability = abilityResponse.body()?.name
            )
        }.onEmpty { emit(detailResponse) }


        mergeResult.zip(getPoketmonInformation()) { _, informationResponse ->
            detailResponse.copy(information = informationResponse.name)
        }.onEmpty { emit(detailResponse) }

        return mergeResult
    }
}