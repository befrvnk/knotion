package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.authentication.AuthenticationEndpoint
import com.befrvnk.knotion.endpoints.blocks.BlocksEndpoint
import com.befrvnk.knotion.endpoints.pages.PagesEndpoint
import com.befrvnk.knotion.endpoints.users.UsersEndpoint
import de.jensklingenberg.ktorfit.ktorfit
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

private const val NOTION_URL = "https://api.notion.com/v1/"
private const val API_VERSION = "2022-06-28"

@OptIn(ExperimentalSerializationApi::class)
class Knotion(integrationToken: String) {
    private val ktorfit = ktorfit {
        baseUrl(NOTION_URL)
        httpClient {
            defaultRequest {
                header("Notion-Version", API_VERSION)
                header("Authorization", "Bearer $integrationToken")
            }
            install(ContentNegotiation) {
                json(
                    Json {
                        explicitNulls = false
                        ignoreUnknownKeys = true
                    }
                )
            }
        }
    }

    val authenticationEndpoint = ktorfit.create<AuthenticationEndpoint>()

    val blocksEndpoint = ktorfit.create<BlocksEndpoint>()

    val pagesEndpoint = ktorfit.create<PagesEndpoint>()

    val usersEndpoint = ktorfit.create<UsersEndpoint>()
}
