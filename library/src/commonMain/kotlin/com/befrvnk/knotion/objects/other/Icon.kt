package com.befrvnk.knotion.objects.other

import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
sealed class Icon {

    @Serializable
    @SerialName("emoji")
    data class Emoji(
        val emoji: String,
    ) : Icon()

    @Serializable
    @SerialName("file")
    data class File(
        val file: NotionFileDetails,
    ) : Icon() {
        @OptIn(ExperimentalSerializationApi::class)
        @Serializable
        @SerialName("file")
        data class NotionFileDetails(
            val url: String,
            @JsonNames("expiry_time")
            val expiryTime: Instant
        )
    }

    @Serializable
    @SerialName("external")
    data class External(
        val external: ExternalFileDetails,
    ) : Icon() {
        @Serializable
        data class ExternalFileDetails(
            val url: String,
        )
    }
}