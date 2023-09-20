package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.Serializable

@Serializable
data class GenerationII(
    val crystal: Crystal,
    val gold: Gold,
    val silver: Silver
)