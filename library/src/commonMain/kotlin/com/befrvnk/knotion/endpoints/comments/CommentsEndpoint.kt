package com.befrvnk.knotion.endpoints.comments

import com.befrvnk.knotion.objects.Comment
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

interface CommentsEndpoint {

    @POST("comments")
    suspend fun createComment(
        @Body params: CreateCommentParams,
    ): Response<Comment>

    @GET("comments")
    suspend fun retrieveComments(
        @Query("block_id") blockId: String,
        @Query("start_cursor") startCursor: String,
        @Query("page_size") pageSize: Int,
    ): Response<Paging<Comment>>
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Paging<T>(
    val results: List<T>,
    @JsonNames("next_cursor")
    val nextCursor: String? = null,
    @JsonNames("has_more")
    val hasMore: Boolean,
    @JsonNames("type")
    val type: String,
)