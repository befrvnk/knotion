package com.befrvnk.knotion.objects.other

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("emoji")
data class Emoji(
    val emoji: String,
)
