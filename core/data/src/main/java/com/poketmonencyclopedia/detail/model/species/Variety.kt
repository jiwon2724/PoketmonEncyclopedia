package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class Variety(
    val is_default: Boolean,
    val pokemon: Pokemon
)