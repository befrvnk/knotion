package com.befrvnk.knotion.objects.block

import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.richtext.RichText
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("file")
data class File(
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
    val file: FileDetails,
) : Block() {

    interface FileDetails {
        val caption: List<RichText>
    }

    @Serializable
    @SerialName("file")
    data class InternalFile(
        override val caption: List<RichText>,
        val file: InternalFileDetails,
    ) : FileDetails {

        @Serializable
        data class InternalFileDetails(
            val url: String,
            @JsonNames("expiry_time")
            val expiryTime: Instant
        )
    }

    @Serializable
    @SerialName("external")
    data class ExternalFile(
        override val caption: List<RichText>,
        val external: ExternalFileDetails,
    ) : FileDetails {

        @Serializable
        data class ExternalFileDetails(
            val url: String,
        )
    }
}