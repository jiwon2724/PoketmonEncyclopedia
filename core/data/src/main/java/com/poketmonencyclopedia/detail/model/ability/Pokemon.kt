package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(
    val is_hidden: Boolean,
    val pokemon: PokemonX,
    val slot: Int
)