package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class GrowthRate(
    val name: String,
    val url: String
)