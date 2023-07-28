package com.befrvnk.knotion.endpoints.authentication

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class CreateTokenParams(
    val code: String,
    @JsonNames("grant_type")
    val grantType: String,
    @JsonNames("redirect_uri")
    val redirectUri: String,
    @JsonNames("external_account")
    val externalAccount: ExternalAccount,
) {
    @Serializable
    data class ExternalAccount(
        val key: String,
        val name: String,
    )
}