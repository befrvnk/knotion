package com.befrvnk.knotion.objects.block

import com.befrvnk.knotion.objects.Id
import com.befrvnk.knotion.objects.other.Color
import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.other.RichText
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("bullet_list_item")
data class BulletListItem(
    override val id: Id,
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
    @JsonNames("bullet_list_item")
    val bulletListItem: BulletListItemDetails,
) : Block() {

    @Serializable
    data class BulletListItemDetails(
        @JsonNames("rich_text")
        val richText: RichText,
        val color: Color,
        val children: List<Block>,
    )
}