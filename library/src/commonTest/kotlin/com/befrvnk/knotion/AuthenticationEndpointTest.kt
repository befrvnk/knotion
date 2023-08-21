package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.authentication.CreateTokenParams
import com.befrvnk.knotion.endpoints.authentication.CreateTokenResponse
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class AuthenticationEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("CreateTokenParams parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/authentication/create_token_params.json")
        shouldNotThrowAny {
            json.decodeFromString<CreateTokenParams>(jsonString)
        }
    }

    test("CreateTokenResponse parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/authentication/create_token_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<CreateTokenResponse>(jsonString)
        }
    }
})
