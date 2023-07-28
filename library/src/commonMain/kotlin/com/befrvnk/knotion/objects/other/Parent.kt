package com.befrvnk.knotion.objects.other

import com.befrvnk.knotion.objects.Id
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
sealed class Parent {

    @Serializable
    @SerialName("database_id")
    data class Database(
        @JsonNames("database_id")
        val id: Id,
    ) : Parent()

    @Serializable
    @SerialName("page_id")
    data class Page(
        @JsonNames("page_id")
        val id: Id,
    ) : Parent()

    @Serializable
    @SerialName("workspace")
    data class Workspace(
        val workspace: Boolean,
    ) : Parent()

    @Serializable
    @SerialName("block_id")
    data class Block(
        @JsonNames("block_id")
        val id: Id,
    ) : Parent()
}
