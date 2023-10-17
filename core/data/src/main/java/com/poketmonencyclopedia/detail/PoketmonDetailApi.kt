package com.poketmonencyclopedia.detail

import com.poketmonencyclopedia.detail.model.ability.AbilityResponse
import com.poketmonencyclopedia.detail.model.information.InformationResponse
import com.poketmonencyclopedia.detail.model.species.SpeciesResponse
import retrofit2.Response
import retrofit2.http.GET

interface PoketmonDetailApi {
    @GET("pokemon/1")
    suspend fun getPoketmonInformation(): Response<InformationResponse>

    @GET("pokemon-species/1")
    suspend fun getPoketmonSpecies(): Response<SpeciesResponse>

    @GET("ability/65")
    suspend fun getPoketmonAbility(): Response<AbilityResponse>
}