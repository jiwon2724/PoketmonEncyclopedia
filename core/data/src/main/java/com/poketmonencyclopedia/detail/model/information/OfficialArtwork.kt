package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.Serializable

@Serializable
data class OfficialArtwork(
    val front_default: String?,
    val front_shiny: String?
)