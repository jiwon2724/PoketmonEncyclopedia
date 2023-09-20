package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationI(
    @SerialName("red-blue") val redBlue: RedBlue,
    val yellow: Yellow
)