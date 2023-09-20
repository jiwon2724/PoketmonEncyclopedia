package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationV(
    @SerialName("black-white") val blackWhite: BlackWhite
)