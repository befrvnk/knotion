package com.befrvnk.knotion.endpoints.users

import com.befrvnk.knotion.objects.user.User
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface UsersEndpoint {

    @GET("users")
    suspend fun listAllUsers(
        @Query("start_cursor") startCursor: String,
        @Query("page_size") pageSize: Int,
    ): Response<ListAllUsersResponse>

    @GET("users/{user_id}")
    suspend fun retrieveUser(
        @Path("user_id") userId: String,
    ): Response<User>

    @GET("users/me")
    suspend fun retrieveMyUser(): Response<User>
}

