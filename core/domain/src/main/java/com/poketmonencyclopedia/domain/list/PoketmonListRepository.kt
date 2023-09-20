package com.poketmonencyclopedia.domain.list

import kotlinx.coroutines.flow.Flow

interface PoketmonListRepository {
    suspend fun getPoketmonList(): Flow<Int>
}