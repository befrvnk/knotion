package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.blocks.responses.RetrieveBlockChildrenResponse
import com.befrvnk.knotion.objects.block.Paragraph
import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.other.RichText
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

/**
 * Tests if example responses do not fail on parsing.
 *
 * This was only needed to find problems with the data models.
 */
@ExperimentalSerializationApi
class ResponseParsingTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    test("Block") {
        val blockJson = Resources.readString("src/commonTest/resources/endpoint_blocks.json")
        shouldNotThrowAny {
            json.decodeFromString<RetrieveBlockChildrenResponse>(blockJson)
        }
    }

    test("Paragraph") {
        val paragraphJson = Resources.readString("src/commonTest/resources/paragraph.json")
        shouldNotThrowAny {
            json.decodeFromString<Paragraph>(paragraphJson)
        }
    }

    test("Parent") {
        val parentJson = Resources.readString("src/commonTest/resources/parent.json")
        shouldNotThrowAny {
            json.decodeFromString<Parent>(parentJson)
        }
    }

    test("Rich Text") {
        val richTextJson = Resources.readString("src/commonTest/resources/rich_text.json")
        shouldNotThrowAny {
            json.decodeFromString<RichText>(richTextJson)
        }
    }
})
