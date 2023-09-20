package com.poketmonencyclopedia.detail.model.information
import kotlinx.serialization.Serializable

@Serializable
data class VersionGroup(
    val name: String,
    val url: String
)