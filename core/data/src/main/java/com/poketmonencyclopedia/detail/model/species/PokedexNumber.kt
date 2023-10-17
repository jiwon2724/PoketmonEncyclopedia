package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class PokedexNumber(
    val entry_number: Int,
    val pokedex: Pokedex
)