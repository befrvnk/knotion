package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.databases.CreateDatabaseParams
import com.befrvnk.knotion.objects.database.Database
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class DatabasesEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("CreateDatabaseParams parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/databases/create_database_params.json")
        shouldNotThrowAny {
            json.decodeFromString<CreateDatabaseParams>(jsonString)
        }
    }

    test("createDatabase() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/databases/create_database_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Database>(jsonString)
        }
    }
})
