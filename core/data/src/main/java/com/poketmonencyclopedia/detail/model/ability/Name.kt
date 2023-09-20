package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class Name(
    val language: Language,
    val name: String
)