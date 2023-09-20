package com.poketmonencyclopedia.detail

interface PoketmonDetailApi {
    suspend fun getPoketmon()
    suspend fun getPoketmonSpecies()
    suspend fun getPoketmonAbility()
}