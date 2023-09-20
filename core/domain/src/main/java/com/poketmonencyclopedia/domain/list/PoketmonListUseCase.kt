package com.poketmonencyclopedia.domain.list

import javax.inject.Inject

class PoketmonListUseCase @Inject constructor(
    private val poketmonListRepository: PoketmonListRepository
) {
    suspend fun getPoketmonList() = poketmonListRepository.getPoketmonList()
}