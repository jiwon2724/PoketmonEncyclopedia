package com.poketmonencyclopedia.detail.model.ability

import kotlinx.serialization.Serializable

@Serializable
data class EffectChange(
    val effect_entries: List<EffectEntry>,
    val version_group: VersionGroup
)