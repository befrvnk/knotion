package com.befrvnk.knotion.endpoints.blocks.params

import com.befrvnk.knotion.objects.block.Block
import kotlinx.serialization.Serializable

@Serializable
data class AppendBlockChildrenParams(
    val children: List<Block>
)