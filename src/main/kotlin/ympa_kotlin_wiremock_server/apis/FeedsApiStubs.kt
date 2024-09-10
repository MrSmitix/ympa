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
open class FeedsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getFeed.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeed(campaignId: StringValuePattern, feedId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedStubBuilder =
        GetFeedStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getFeedIndexLogs.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param limit query parameter limit pattern.
     * @param publishedTimeFrom query parameter publishedTimeFrom pattern.
     * @param publishedTimeTo query parameter publishedTimeTo pattern.
     * @param status query parameter status pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedIndexLogsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeedIndexLogs(campaignId: StringValuePattern, feedId: StringValuePattern, limit: StringValuePattern? = null, publishedTimeFrom: StringValuePattern? = null, publishedTimeTo: StringValuePattern? = null, status: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedIndexLogsStubBuilder =
        GetFeedIndexLogsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}/index-logs"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { publishedTimeFrom?.let { withQueryParam("publishedTimeFrom", it) } }
            .apply { publishedTimeTo?.let { withQueryParam("publishedTimeTo", it) } }
            .apply { status?.let { withQueryParam("status", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getFeeds.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeeds(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedsStubBuilder =
        GetFeedsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feeds"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation refreshFeed.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RefreshFeedStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun refreshFeed(campaignId: StringValuePattern, feedId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RefreshFeedStubBuilder =
        RefreshFeedStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}/refresh"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .configurer()
        )

    /**
     * Construct a stub for the operation setFeedParams.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetFeedParamsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setFeedParams(campaignId: StringValuePattern, feedId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetFeedParamsStubBuilder =
        SetFeedParamsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}/params"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .configurer()
        )
}
