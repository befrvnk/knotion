package com.befrvnk.knotion.endpoints.users

import com.befrvnk.knotion.objects.user.User
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path

interface UsersEndpoint {

    @GET("users/{user_id}")
    suspend fun retrieveUser(
        @Path("user_id") userId: String,
    ): Response<User>
}