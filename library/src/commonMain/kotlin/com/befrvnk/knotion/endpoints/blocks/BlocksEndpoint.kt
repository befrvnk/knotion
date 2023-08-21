package com.befrvnk.knotion.endpoints.blocks

import com.befrvnk.knotion.objects.block.Block
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.PATCH
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface BlocksEndpoint {

    @PATCH("blocks/{block_id}/children")
    suspend fun appendBlockChildren(
        @Path("block_id") blockId: String,
        @Body params: AppendBlockChildrenParams,
    ): Response<AppendBlockChildrenResponse>

    @GET("blocks/{block_id}")
    suspend fun retrieveBlock(@Path("block_id") blockId: String): Response<Block>

    @GET("blocks/{block_id}/children")
    suspend fun retrieveBlockChildren(
        @Path("block_id") blockId: String,
        @Query("start_cursor") startCursor: String? = null,
        @Query("page_size") pageSize: Int? = null,
    ): Response<RetrieveBlockChildrenResponse>

    @PATCH("blocks/{block_id}")
    suspend fun updateBlock(
        @Path("block_id") blockId: String,
        @Body block: Block,
    ): Response<Block>

    @DELETE("blocks/{block_id}")
    suspend fun deleteBlock(@Path("block_id") blockId: String): Response<Block>
}