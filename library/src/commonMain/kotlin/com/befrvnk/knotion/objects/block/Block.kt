package com.befrvnk.knotion.objects.block

import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
sealed class Block {
    abstract val id: String
    abstract val parent: Parent
    @JsonNames("created_time")
    abstract val createdTime: Instant
    @JsonNames("created_by")
    abstract val createdBy: User
    @JsonNames("last_edited_time")
    abstract val lastEditedTime: Instant
    @JsonNames("last_edited_by")
    abstract val lastEditedBy: User
    abstract val archived: Boolean
    @JsonNames("has_children")
    abstract val hasChildren: Boolean
}
