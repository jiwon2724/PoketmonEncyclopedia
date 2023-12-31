package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class PalParkEncounter(
    val area: Area,
    val base_score: Int,
    val rate: Int
)