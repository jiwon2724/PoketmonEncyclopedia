package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class Color(
    val name: String,
    val url: String
)