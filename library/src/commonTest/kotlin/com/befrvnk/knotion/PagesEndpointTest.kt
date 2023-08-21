package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.pages.CreatePageParams
import com.befrvnk.knotion.objects.Page
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class PagesEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("CreatePageParams parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/pages/create_page_params.json")
        shouldNotThrowAny {
            json.decodeFromString<CreatePageParams>(jsonString)
        }
    }

    test("createPage() parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/pages/create_page_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Page>(jsonString)
        }
    }

    test("retrievePage() parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/pages/retrieve_page_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Page>(jsonString)
        }
    }
})
