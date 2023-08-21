package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.users.ListAllUsersResponse
import com.befrvnk.knotion.objects.user.User
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class UsersEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("ListAllUsersResponse parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/users/list_all_users_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<ListAllUsersResponse>(jsonString)
        }
    }

    test("retrieveUser() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/users/retrieve_user_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<User>(jsonString)
        }
    }

    test("retrieveMyUser() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/users/retrieve_my_user_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<User>(jsonString)
        }
    }
})
