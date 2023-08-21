package com.befrvnk.knotion.endpoints.search

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
enum class SortDirection {
    @JsonNames("ascending")
    ASCENDING,
    @JsonNames("descending")
    DESCENDING,
}