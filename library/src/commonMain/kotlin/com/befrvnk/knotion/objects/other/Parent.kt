package com.befrvnk.knotion.objects.other

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Parent(
    @JsonNames("database_id")
    val databaseId: String?,
    @JsonNames("page_id")
    val pageId: String?,
    val workspace: Boolean?,
    @JsonNames("block_id")
    val blockId: String?,
)
