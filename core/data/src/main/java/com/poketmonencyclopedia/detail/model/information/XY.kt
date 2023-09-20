package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.Serializable

@Serializable
data class XY(
    val front_default: String?,
    val front_female: String?,
    val front_shiny: String?,
    val front_shiny_female: String?
)