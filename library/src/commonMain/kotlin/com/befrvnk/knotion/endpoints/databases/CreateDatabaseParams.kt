package com.befrvnk.knotion.endpoints.databases

import com.befrvnk.knotion.objects.database.DatabaseProperties
import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.richtext.RichText
import kotlinx.serialization.Serializable

@Serializable
data class CreateDatabaseParams(
    val parent: Parent,
    val title: List<RichText>,
    val properties: DatabaseProperties,
)