package com.befrvnk.knotion.endpoints.pages

import com.befrvnk.knotion.objects.Page
import com.befrvnk.knotion.objects.Property
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.PATCH
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path

interface PagesEndpoint {
    @POST("pages")
    suspend fun createPage(@Body body: CreatePageParams): Response<Page>

    @GET("pages/{page_id}")
    suspend fun retrievePage(@Path("page_id") pageId: String): Response<Page>

    @GET("pages/{page_id}/properties/{property_id}")
    suspend fun retrievePagePropertyItem(
        @Path("page_id") pageId: String,
        @Path("property_id") propertyId: String,
    ): Response<Property>

    @PATCH("page/{page_id}")
    suspend fun updatePageProperties(
        @Path("page_id") pageId: String,
        @Body body: UpdatePagePropertiesBody,
    ): Response<Page>
}
