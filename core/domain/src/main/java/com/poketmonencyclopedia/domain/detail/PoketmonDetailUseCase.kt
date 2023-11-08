package com.poketmonencyclopedia.domain.detail

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PoketmonDetailUseCase @Inject constructor(private val poketmonDetailRepository: PoketmonDetailRepository) {
    suspend fun getPoketmonDetail(): Flow<DetailResponse> = flow {
        poketmonDetailRepository.getPoketmonDetail()
    }
}