package com.befrvnk.knotion.objects.other

import com.befrvnk.knotion.objects.richtext.RichText
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
sealed class File {
    abstract val caption: List<RichText>

    fun url(): String = when (this) {
        is ExternalFile -> external.url
        is NotionFile -> file.url
    }
}

@Serializable
@SerialName("file")
data class NotionFile(
    override val caption: List<RichText> = emptyList(),
    val file: NotionFileDetails,
) : File() {
    @OptIn(ExperimentalSerializationApi::class)
    @Serializable
    data class NotionFileDetails(
        val url: String,
        @JsonNames("expiry_time")
        val expiryTime: Instant
    )
}

@Serializable
@SerialName("external")
data class ExternalFile(
    override val caption: List<RichText> = emptyList(),
    val external: ExternalFileDetails,
) : File() {
    @Serializable
    data class ExternalFileDetails(
        val url: String,
    )
}