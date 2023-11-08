package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class Version(
    val name: String,
    val url: String
)