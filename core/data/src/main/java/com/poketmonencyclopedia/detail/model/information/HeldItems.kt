package com.poketmonencyclopedia.detail.model.information

import kotlinx.serialization.Serializable

@Serializable
data class HeldItems(
    val item: Item,
    val version_details: List<VersionDetail>
)