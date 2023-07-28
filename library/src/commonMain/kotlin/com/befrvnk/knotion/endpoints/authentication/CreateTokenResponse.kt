package com.befrvnk.knotion.endpoints.authentication

import com.befrvnk.knotion.objects.Id
import com.befrvnk.knotion.objects.other.Owner
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class CreateTokenResponse(
    @JsonNames("access_token")
    val accessToken: String,
    @JsonNames("bot_id")
    val botId: Id,
    @JsonNames("duplicated_template_id")
    val duplicatedTemplateId: Id,
    val owner: Owner,
    @JsonNames("workspace_icon")
    val workspaceIcon: String,
    @JsonNames("workspace_id")
    val workspaceId: Id,
    @JsonNames("workspace_name")
    val workspaceName: String,
)