package com.poketmonencyclopedia.detail

import com.poketmonencyclopedia.domain.detail.PoketmonDetailRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PoketmonListRepositoryImpl @Inject constructor(
    poketmonDetailApi: PoketmonDetailApi
) : PoketmonDetailRepository {
    override suspend fun getPoketmonInformation(): Flow<Int> {
        TODO("Not yet implemented")
    }

    override suspend fun getPoketmonAbility(): Flow<Int> {
        TODO("Not yet implemented")
    }

    override suspend fun getPoketmonSpecies(): Flow<Int> {
        TODO("Not yet implemented")
    }

    override suspend fun getPoketmonDetail(): Flow<Int> {
        TODO("Not yet implemented")
    }
}