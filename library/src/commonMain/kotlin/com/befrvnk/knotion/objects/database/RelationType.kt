package com.befrvnk.knotion.objects.database

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
enum class RelationType {
    @JsonNames("single_property")
    SINGLE_PROPERTY,
    @JsonNames("dual_property")
    DUAL_PROPERTY,
}