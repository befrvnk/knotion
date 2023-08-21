package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.search.SearchByTitleResponse
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class SearchEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("SearchByTitleResponse parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/search/search_by_title_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<SearchByTitleResponse>(jsonString)
        }
    }
})
