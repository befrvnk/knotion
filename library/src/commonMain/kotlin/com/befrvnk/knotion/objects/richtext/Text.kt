package com.befrvnk.knotion.objects.richtext

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("text")
data class Text(
    override val annotations: Annotations,
    @JsonNames("plain_text")
    override val plainText: String,
    override val href: String? = null,
    val text: TextDetails,
) : RichText() {
    @Serializable
    data class TextDetails(
        val content: String,
        val link: Link? = null,
    ) {
        @Serializable
        data class Link(
            val url: String,
        )
    }
}