package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class VersionGroup(
    val name: String,
    val url: String
)