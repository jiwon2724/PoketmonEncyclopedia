package com.poketmonencyclopedia.detail.model.information
import kotlinx.serialization.Serializable

@Serializable
data class Type(
    val slot: Int,
    val type: TypeX
)