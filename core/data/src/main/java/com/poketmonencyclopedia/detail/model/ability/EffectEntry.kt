package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class EffectEntry(
    val effect: String,
    val language: Language
)