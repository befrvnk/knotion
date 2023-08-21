package com.befrvnk.knotion.endpoints.pages

import com.befrvnk.knotion.objects.PageProperties
import com.befrvnk.knotion.objects.block.Block
import com.befrvnk.knotion.objects.other.File
import com.befrvnk.knotion.objects.other.Icon
import com.befrvnk.knotion.objects.other.Parent
import kotlinx.serialization.Serializable

@Serializable
data class CreatePageParams(
    val parent: Parent,
    val properties: PageProperties,
    val children: List<Block>,
    val icon: Icon,
    val cover: File,
)