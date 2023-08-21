package com.befrvnk.knotion.objects.database

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
enum class RollupFunction {
    @JsonNames("count_all")
    COUNT_ALL,
    @JsonNames("count_values")
    COUNT_VALUES,
    @JsonNames("count_unique_values")
    COUNT_UNIQUE_VALUES,
    @JsonNames("count_empty")
    COUNT_EMPTY,
    @JsonNames("count_not_empty")
    COUNT_NOT_EMPTY,
    @JsonNames("percent_empty")
    PERCENT_EMPTY,
    @JsonNames("percent_not_empty")
    PERCENT_NOT_EMPTY,
    @JsonNames("sum")
    SUM,
    @JsonNames("average")
    AVERAGE,
    @JsonNames("median")
    MEDIAN,
    @JsonNames("min")
    MIN,
    @JsonNames("max")
    MAX,
    @JsonNames("range")
    RANGE,
    @JsonNames("show_original")
    SHOW_ORIGINAL,
}