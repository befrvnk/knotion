package com.befrvnk.knotion.objects.richtext

import com.befrvnk.knotion.objects.other.Color
import kotlinx.serialization.Serializable

@Serializable
data class Annotations(
    val bold: Boolean,
    val italic: Boolean,
    val strikethrough: Boolean,
    val underline: Boolean,
    val code: Boolean,
    val color: Color,
)