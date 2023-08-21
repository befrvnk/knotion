package com.befrvnk.knotion.endpoints.authentication

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
    val botId: String,
    @JsonNames("duplicated_template_id")
    val duplicatedTemplateId: String?,
    val owner: Owner,
    @JsonNames("workspace_icon")
    val workspaceIcon: String,
    @JsonNames("workspace_id")
    val workspaceId: String,
    @JsonNames("workspace_name")
    val workspaceName: String,
)