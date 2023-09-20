package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    val dream_world: DreamWorld,
    val home: Home,
    @SerialName("official-artwork") val officialArtwork: OfficialArtwork
)