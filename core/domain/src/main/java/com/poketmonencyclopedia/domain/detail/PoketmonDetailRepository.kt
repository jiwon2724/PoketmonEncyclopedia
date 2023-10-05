package com.poketmonencyclopedia.domain.detail

import kotlinx.coroutines.flow.Flow

interface PoketmonDetailRepository {
    // TODO : getPoketmonDetail ResponseType 설계, Mapper구현
    suspend fun getPoketmonDetail(): Flow<DetailResponse>
}