package com.befrvnk.knotion.endpoints.comments

import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.richtext.RichText
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class CreateCommentParams(
    val parent: Parent? = null,
    @JsonNames("discussion_id")
    val discussionId: String? = null,
    @JsonNames("rich_text")
    val richText: List<RichText>,
)