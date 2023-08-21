package com.befrvnk.knotion.endpoints.search

import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.POST
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

interface SearchEndpoint {

    @POST("search")
    suspend fun searchByTitle(
        @Body params: SearchByTitleParams,
    ): Response<SearchByTitleResponse>
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class SearchByTitleParams(
    val query: String,
    val sort: Sort,
    val filter: Filter,
    @JsonNames("start_cursor")
    val startCursor: String,
    @JsonNames("page_size")
    val pageSize: Int,
)

@Serializable
data class Filter(
    val value: String,
    val property: String,
)

@Serializable
data class Sort(
    val direction: SortDirection,
    val timestamp: String,
)