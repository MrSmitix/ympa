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
open class BidsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getBidsInfoForBusiness.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBidsInfoForBusinessStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBidsInfoForBusiness(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBidsInfoForBusinessStubBuilder =
        GetBidsInfoForBusinessStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/bids/info"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getBidsRecommendations.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBidsRecommendationsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBidsRecommendations(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBidsRecommendationsStubBuilder =
        GetBidsRecommendationsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/bids/recommendations"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation putBidsForBusiness.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PutBidsForBusinessStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun putBidsForBusiness(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PutBidsForBusinessStubBuilder =
        PutBidsForBusinessStubBuilder(objectMapper, put(urlPathTemplate("/businesses/{businessId}/bids"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation putBidsForCampaign.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PutBidsForCampaignStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun putBidsForCampaign(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PutBidsForCampaignStubBuilder =
        PutBidsForCampaignStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/bids"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
