package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class Habitat(
    val name: String,
    val url: String
)