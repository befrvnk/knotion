package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.blocks.AppendBlockChildrenParams
import com.befrvnk.knotion.endpoints.blocks.AppendBlockChildrenResponse
import com.befrvnk.knotion.endpoints.blocks.RetrieveBlockChildrenResponse
import com.befrvnk.knotion.objects.block.Block
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class BlocksEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("AppendBlockChildrenParams parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/blocks/append_block_children_params.json")
        shouldNotThrowAny {
            json.decodeFromString<AppendBlockChildrenParams>(jsonString)
        }
    }

    test("AppendBlockChildrenResponse parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/blocks/append_block_children_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<AppendBlockChildrenResponse>(jsonString)
        }
    }

    test("retrieveBlock() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/blocks/retrieve_block_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Block>(jsonString)
        }
    }

    test("RetrieveBlockChildrenResponse parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/blocks/retrieve_block_children_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<RetrieveBlockChildrenResponse>(jsonString)
        }
    }

    test("updateBlock() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/blocks/update_block_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Block>(jsonString)
        }
    }

    test("deleteBlock() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/blocks/delete_block_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Block>(jsonString)
        }
    }
})
