package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GenerationIV(
    @SerialName("diamond-pearl") val diamondPearl: DiamondPearl,
    @SerialName("heartgold-soulsilver") val heartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)