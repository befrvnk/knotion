package com.befrvnk.knotion.endpoints.pages.params

import com.befrvnk.knotion.objects.PageProperties
import com.befrvnk.knotion.objects.other.File
import com.befrvnk.knotion.objects.other.Icon
import kotlinx.serialization.Serializable

@Serializable
data class UpdatePagePropertiesBody(
    val properties: PageProperties,
    val archived: Boolean,
    val icon: Icon,
    val cover: File,
)