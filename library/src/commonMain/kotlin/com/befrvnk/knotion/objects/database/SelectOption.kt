package com.befrvnk.knotion.objects.database

import com.befrvnk.knotion.objects.other.Color
import kotlinx.serialization.Serializable

@Serializable
data class SelectOption(
    val name: String,
    val color: Color,
)