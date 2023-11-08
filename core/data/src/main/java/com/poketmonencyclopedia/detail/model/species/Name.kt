package com.poketmonencyclopedia.detail.model.species

import kotlinx.serialization.Serializable

@Serializable
data class Name(
    val language: Language,
    val name: String
)