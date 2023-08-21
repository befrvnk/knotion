package com.befrvnk.knotion.endpoints.databases

import com.befrvnk.knotion.objects.database.DatabaseProperties
import com.befrvnk.knotion.objects.richtext.RichText
import kotlinx.serialization.Serializable

@Serializable
data class UpdateDatabaseParams(
    val title: List<RichText>,
    val description: List<RichText>,
    val properties: DatabaseProperties,
)