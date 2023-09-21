package com.poketmonencyclopedia.domain.detail

import javax.inject.Inject

class PoketmonDetailUseCase @Inject constructor(
    private val poketmonListRepository: PoketmonDetailRepository
) {
    suspend fun getPoketmonDetail() = poketmonListRepository.getPoketmonDetail()
}