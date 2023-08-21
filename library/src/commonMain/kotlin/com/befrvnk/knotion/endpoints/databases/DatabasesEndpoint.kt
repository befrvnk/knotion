package com.befrvnk.knotion.endpoints.databases

import com.befrvnk.knotion.objects.database.Database
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.PATCH
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface DatabasesEndpoint {

    @POST("databases")
    suspend fun createDatabase(
        @Body params: CreateDatabaseParams,
    ): Response<Database>

    @POST("databases/{database_id}/query")
    suspend fun queryDatabase(
        @Path("database_id") databaseId: String,
        @Query("filter_properties") filterProperties: String,
    ): Response<QueryDatabaseResponse>

    @GET("databases/{database_id}")
    suspend fun retrieveDatabase(
        @Path("database_id") databaseId: String,
    ): Response<Database>

    @PATCH("databases/{database_id}")
    suspend fun updateDatabase(
        @Path("database_id") databaseId: String,
    ): Response<Database>
}
