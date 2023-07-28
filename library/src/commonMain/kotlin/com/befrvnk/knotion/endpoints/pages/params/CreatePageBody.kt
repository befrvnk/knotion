package com.befrvnk.knotion.endpoints.pages.params

import com.befrvnk.knotion.objects.Id
import com.befrvnk.knotion.objects.PageProperties
import com.befrvnk.knotion.objects.block.Block
import com.befrvnk.knotion.objects.other.File
import com.befrvnk.knotion.objects.other.Icon
import kotlinx.serialization.Serializable

@Serializable
data class CreatePageBody(
    val parent: Id,
    val properties: PageProperties,
    val children: List<Block>,
    val icon: Icon,
    val cover: File,
)