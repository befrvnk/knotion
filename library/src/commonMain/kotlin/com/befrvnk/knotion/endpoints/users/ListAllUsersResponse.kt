package com.befrvnk.knotion.endpoints.users

import com.befrvnk.knotion.objects.user.User
import kotlinx.serialization.Serializable

@Serializable
data class ListAllUsersResponse(
    val results: List<User>,
)