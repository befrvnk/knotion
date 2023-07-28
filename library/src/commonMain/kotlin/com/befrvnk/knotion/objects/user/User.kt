package com.befrvnk.knotion.objects.user

import com.befrvnk.knotion.objects.Email
import com.befrvnk.knotion.objects.Id
import com.befrvnk.knotion.objects.other.Owner
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class User(
    val id: Id,
    val type: String? = null,
    val name: String? = null,
    @JsonNames("avatar_url")
    val avatarUrl: String? = null,
    val person: PersonDetails? = null,
    val bot: BotDetails? = null,
) {
    @Serializable
    data class PersonDetails(
        val email: Email
    )

    @OptIn(ExperimentalSerializationApi::class)
    @Serializable
    data class BotDetails(
        val owner: Owner,
        @JsonNames("workspace_name")
        val workspaceName: String,
    )
}
