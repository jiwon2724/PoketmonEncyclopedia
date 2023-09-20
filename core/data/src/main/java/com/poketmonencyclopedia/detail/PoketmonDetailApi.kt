package com.poketmonencyclopedia.detail

interface PoketmonDetailApi {
    suspend fun getPoketmonDetail()
    suspend fun getPoketmonSpecies()
    suspend fun getPoketmonAbility()
}