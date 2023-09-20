package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIII(
    val emerald: Emerald,
    @SerialName("firered-leafgreen") val fireredLeafgreen: FireredLeafgreen,
    @SerialName("ruby-sapphire") val rubySapphire: RubySapphire
)