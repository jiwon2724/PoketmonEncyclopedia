package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class EffectEntryX(
    val effect: String,
    val language: Language,
    val short_effect: String
)