package com.befrvnk.knotion.endpoints.blocks.responses

import com.befrvnk.knotion.objects.block.Block
import kotlinx.serialization.Serializable

@Serializable
data class RetrieveBlockChildrenResponse(
    val results: List<Block>,
)
