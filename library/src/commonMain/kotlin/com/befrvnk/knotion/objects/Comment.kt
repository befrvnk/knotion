package com.befrvnk.knotion.objects

import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.other.RichText
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Comment(
    val id: Id,
    val parent: Parent,
    @JsonNames("discussion_id")
    val discussionId: Id,
    @JsonNames("created_time")
    val createdTime: Instant,
    @JsonNames("last_edited_time")
    val lastEditedTime: Instant,
    @JsonNames("created_by")
    val createdBy: User,
    @JsonNames("rich_text")
    val richText: RichText,
)