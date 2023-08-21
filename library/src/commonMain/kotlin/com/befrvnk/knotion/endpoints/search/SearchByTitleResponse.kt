package com.befrvnk.knotion.endpoints.search

import com.befrvnk.knotion.objects.Page
import kotlinx.serialization.Serializable

@Serializable
data class SearchByTitleResponse(
    val results: List<Page>,
)