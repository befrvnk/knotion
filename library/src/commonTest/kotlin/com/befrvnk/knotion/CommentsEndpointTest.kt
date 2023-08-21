package com.befrvnk.knotion

import com.befrvnk.knotion.endpoints.comments.Paging
import com.befrvnk.knotion.objects.Comment
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.core.spec.style.FunSpec
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@ExperimentalSerializationApi
class CommentsEndpointTest : FunSpec({
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
        coerceInputValues = true
    }

    test("createComment() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/comments/create_comment_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Comment>(jsonString)
        }
    }

    test("retrieveComments() response parses successfully") {
        val jsonString = Resources.readString("src/commonTest/resources/comments/retrieve_comments_response_200.json")
        shouldNotThrowAny {
            json.decodeFromString<Paging<Comment>>(jsonString)
        }
    }
})
