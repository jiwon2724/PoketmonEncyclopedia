package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.Serializable

@Serializable
data class VersionDetail(
    val rarity: Int,
    val version: VersionX
)