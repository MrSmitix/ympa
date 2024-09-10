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
open class FeedbacksApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getFeedbackAndCommentUpdates.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param fromDate query parameter fromDate pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedbackAndCommentUpdatesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeedbackAndCommentUpdates(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, fromDate: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedbackAndCommentUpdatesStubBuilder =
        GetFeedbackAndCommentUpdatesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feedback/updates"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { fromDate?.let { withQueryParam("fromDate", it) } }
            .configurer()
        )
}
