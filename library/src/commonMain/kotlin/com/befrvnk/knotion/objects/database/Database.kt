package com.befrvnk.knotion.objects.database

import com.befrvnk.knotion.objects.other.File
import com.befrvnk.knotion.objects.other.Icon
import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.richtext.RichText
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Database(
    val id: String,
    @JsonNames("created_time")
    val createdTime: Instant,
    @JsonNames("created_by")
    val createdBy: User,
    @JsonNames("last_edited_time")
    val lastEditedTime: Instant,
    @JsonNames("last_edited_by")
    val lastEditedBy: User,
    val title: List<RichText>,
    val description: List<RichText>,
    val icon: Icon,
    val cover: File,
    // Skipped properties
    val parent: Parent,
    val url: String,
    val archived: Boolean,
    @JsonNames("is_inline")
    val isInline: Boolean,
)