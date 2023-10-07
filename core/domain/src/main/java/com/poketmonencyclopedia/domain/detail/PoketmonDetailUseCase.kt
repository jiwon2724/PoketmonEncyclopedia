package com.poketmonencyclopedia.domain.detail

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PoketmonDetailUseCase @Inject constructor(private val poketmonDetailRepository: PoketmonDetailRepository) {
    suspend fun getPoketmonDetail(): Flow<DetailResponse> = poketmonDetailRepository.getPoketmonDetail()
}