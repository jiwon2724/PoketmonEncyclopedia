package com.poketmonencyclopedia.domain.detail

import kotlinx.coroutines.flow.Flow

interface PoketmonDetailRepository {
    // TODO : getPoketmonDetail ResponseType 설계, Mapper구현
    suspend fun getPoketmonInformation(): Flow<Int>
    suspend fun getPoketmonAbility(): Flow<Int>
    suspend fun getPoketmonSpecies(): Flow<Int>
    suspend fun getPoketmonDetail(): Flow<Int>
}