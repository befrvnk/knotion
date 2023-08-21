package com.befrvnk.knotion.objects.database

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Relation(
    @JsonNames("database_id")
    val databaseId: String,
    @JsonNames("type")
    val type: RelationType?,
)