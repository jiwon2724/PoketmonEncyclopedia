package com.poketmonencyclopedia.detail

import com.poketmonencyclopedia.detail.model.ability.AbilityResponse
import com.poketmonencyclopedia.detail.model.information.InformationResponse
import com.poketmonencyclopedia.detail.model.species.SpeciesResponse
import retrofit2.Response

interface PoketmonDetailApi {
    suspend fun getPoketmonInformation(): Result<InformationResponse>
    suspend fun getPoketmonSpecies(): Result<SpeciesResponse>
    suspend fun getPoketmonAbility(): Response<AbilityResponse>
}