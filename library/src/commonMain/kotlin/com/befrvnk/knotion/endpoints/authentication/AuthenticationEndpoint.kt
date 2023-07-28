package com.befrvnk.knotion.endpoints.authentication

import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.POST

interface AuthenticationEndpoint {
    @POST("oauth/token")
    suspend fun createToken(@Body params: CreateTokenParams): Response<CreateTokenResponse>
}

