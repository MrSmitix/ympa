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
open class OffersApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteCampaignOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteCampaignOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteCampaignOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteCampaignOffersStubBuilder =
        DeleteCampaignOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers/delete"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getAllOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId query parameter feedId pattern.
     * @param chunk query parameter chunk pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAllOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAllOffers(campaignId: StringValuePattern, feedId: StringValuePattern? = null, chunk: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAllOffersStubBuilder =
        GetAllOffersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offers/all"))
            .withPathParam("campaignId", campaignId)
            .apply { feedId?.let { withQueryParam("feedId", it) } }
            .apply { chunk?.let { withQueryParam("chunk", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignOffers(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignOffersStubBuilder =
        GetCampaignOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOfferRecommendations.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferRecommendationsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferRecommendations(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferRecommendationsStubBuilder =
        GetOfferRecommendationsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offers/recommendations"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param query query parameter query pattern.
     * @param feedId query parameter feedId pattern.
     * @param shopCategoryId query parameter shopCategoryId pattern.
     * @param currency query parameter currency pattern.
     * @param matched query parameter matched pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOffers(campaignId: StringValuePattern, query: StringValuePattern? = null, feedId: StringValuePattern? = null, shopCategoryId: StringValuePattern? = null, currency: StringValuePattern? = null, matched: StringValuePattern? = null, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOffersStubBuilder =
        GetOffersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offers"))
            .withPathParam("campaignId", campaignId)
            .apply { query?.let { withQueryParam("query", it) } }
            .apply { feedId?.let { withQueryParam("feedId", it) } }
            .apply { shopCategoryId?.let { withQueryParam("shopCategoryId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .apply { matched?.let { withQueryParam("matched", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation updateCampaignOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateCampaignOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateCampaignOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateCampaignOffersStubBuilder =
        UpdateCampaignOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers/update"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
