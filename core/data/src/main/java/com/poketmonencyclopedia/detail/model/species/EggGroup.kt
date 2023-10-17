package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class EggGroup(
    val name: String,
    val url: String
)