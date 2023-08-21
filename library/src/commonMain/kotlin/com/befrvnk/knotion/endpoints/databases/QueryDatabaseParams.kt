package com.befrvnk.knotion.endpoints.databases

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class QueryDatabaseParams(
    val filter: JsonElement,
    val sorts: List<SortDirection>,
    @JsonNames("start_cursor")
    val startCursor: String,
    @JsonNames("page_size")
    val pageSize: Int,
)