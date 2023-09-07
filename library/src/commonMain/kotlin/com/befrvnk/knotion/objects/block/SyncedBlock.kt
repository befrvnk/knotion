package com.befrvnk.knotion.objects.block

import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("synced_block")
data class SyncedBlock(
    override val id: String,
    override val parent: Parent,
    @JsonNames("created_time")
    override val createdTime: Instant,
    @JsonNames("created_by")
    override val createdBy: User,
    @JsonNames("last_edited_time")
    override val lastEditedTime: Instant,
    @JsonNames("last_edited_by")
    override val lastEditedBy: User,
    override val archived: Boolean,
    @JsonNames("has_children")
    override val hasChildren: Boolean,
    @JsonNames("synced_from")
    val syncedFrom: SyncedFrom? = null,
    @JsonNames("synced_block")
    val syncedBlock: SyncedBlockDetails,
) : Block() {

    @Serializable
    data class SyncedBlockDetails(
        val children: List<Block>,
    )

    @Serializable
    data class SyncedFrom(
        @JsonNames("block_id")
        val blockId: String,
    )
}