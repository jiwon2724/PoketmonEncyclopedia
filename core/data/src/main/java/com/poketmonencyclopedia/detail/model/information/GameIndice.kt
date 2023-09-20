package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.Serializable

@Serializable
data class GameIndice(
    val game_index: Int,
    val version: Version
)