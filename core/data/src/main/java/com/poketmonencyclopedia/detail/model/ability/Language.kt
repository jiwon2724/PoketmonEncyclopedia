package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class Language(
    val name: String,
    val url: String
)