package com.befrvnk.knotion.endpoints.databases

import com.befrvnk.knotion.objects.Page
import kotlinx.serialization.Serializable

@Serializable
data class QueryDatabaseResponse(
    val results: List<Page>
)