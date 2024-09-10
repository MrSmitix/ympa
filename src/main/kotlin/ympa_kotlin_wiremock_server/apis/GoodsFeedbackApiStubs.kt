@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package ympa_kotlin_wiremock_server.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import ympa_kotlin_wiremock_server.models.*

/**
 * WireMock stub request builder.
 */
open class GoodsFeedbackApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteGoodsFeedbackComment.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteGoodsFeedbackCommentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteGoodsFeedbackComment(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteGoodsFeedbackCommentStubBuilder =
        DeleteGoodsFeedbackCommentStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/comments/delete"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getGoodsFeedbackComments.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetGoodsFeedbackCommentsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getGoodsFeedbackComments(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetGoodsFeedbackCommentsStubBuilder =
        GetGoodsFeedbackCommentsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/comments"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getGoodsFeedbacks.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetGoodsFeedbacksStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getGoodsFeedbacks(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetGoodsFeedbacksStubBuilder =
        GetGoodsFeedbacksStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation skipGoodsFeedbacksReaction.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SkipGoodsFeedbacksReactionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun skipGoodsFeedbacksReaction(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SkipGoodsFeedbacksReactionStubBuilder =
        SkipGoodsFeedbacksReactionStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/skip-reaction"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateGoodsFeedbackComment.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateGoodsFeedbackCommentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateGoodsFeedbackComment(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateGoodsFeedbackCommentStubBuilder =
        UpdateGoodsFeedbackCommentStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/comments/update"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
