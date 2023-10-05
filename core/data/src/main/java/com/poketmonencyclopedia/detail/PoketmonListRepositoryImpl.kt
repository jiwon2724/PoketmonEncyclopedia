package com.poketmonencyclopedia.detail

import com.poketmonencyclopedia.detail.model.ability.AbilityResponse
import com.poketmonencyclopedia.domain.detail.DetailResponse
import com.poketmonencyclopedia.detail.model.information.InformationResponse
import com.poketmonencyclopedia.detail.model.species.SpeciesResponse
import com.poketmonencyclopedia.domain.detail.PoketmonDetailRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.zip
import javax.inject.Inject

class PoketmonListRepositoryImpl @Inject constructor(private val poketmonDetailApi: PoketmonDetailApi) : PoketmonDetailRepository {
    private suspend fun getPoketmonInformation(): Flow<InformationResponse> = flow {
        poketmonDetailApi.getPoketmonInformation()
    }

    private suspend fun getPoketmonAbility(): Flow<AbilityResponse> = flow {
        poketmonDetailApi.getPoketmonAbility()
    }

    private suspend fun getPoketmonSpecies(): Flow<SpeciesResponse> = flow {
        poketmonDetailApi.getPoketmonSpecies()
    }

    override suspend fun getPoketmonDetail(): Flow<DetailResponse> {
        val detailResponse = DetailResponse()
        val mergeResult = getPoketmonAbility().zip(getPoketmonSpecies()) { abilityResponse, speciesResponse ->
            detailResponse.copy(
                name = speciesResponse.name,
                description = speciesResponse.form_descriptions.toString(),
                type = speciesResponse.gender_rate.toString(),
                ability = abilityResponse.name
            )
        }.zip(getPoketmonInformation()) { _, informationResponse ->
            detailResponse.copy(information = informationResponse.name)
        }
        return mergeResult
    }
}