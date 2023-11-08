package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class Area(
    val name: String,
    val url: String
)