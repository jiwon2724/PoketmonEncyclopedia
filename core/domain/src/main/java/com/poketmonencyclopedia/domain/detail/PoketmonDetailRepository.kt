package com.poketmonencyclopedia.domain.detail

import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

interface PoketmonDetailRepository {
    suspend fun getPoketmonDetail(): Flow<DetailResponse>
}