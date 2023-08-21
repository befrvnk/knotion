package com.befrvnk.knotion.endpoints.databases

import kotlinx.serialization.Serializable

@Serializable
data class Sort(
    val property: String,
    val direction: SortDirection,
)