package com.befrvnk.knotion.objects.database

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Rollup(
    @JsonNames("relation_property_name")
    val relationPropertyName: String?,
    @JsonNames("relation_property_id")
    val relationPropertyId: String?,
    @JsonNames("rollup_property_name")
    val rollupPropertyName: String?,
    @JsonNames("rollup_property_id")
    val rollupPropertyId: String?,
    @JsonNames("function")
    val function: RollupFunction,
)