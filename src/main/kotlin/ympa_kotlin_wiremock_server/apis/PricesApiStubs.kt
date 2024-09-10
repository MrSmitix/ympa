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
open class PricesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getPrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param archived query parameter archived pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPrices(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, archived: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPricesStubBuilder =
        GetPricesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offer-prices"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { archived?.let { withQueryParam("archived", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getPricesByOfferIds.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPricesByOfferIdsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPricesByOfferIds(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPricesByOfferIdsStubBuilder =
        GetPricesByOfferIdsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-prices"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getSuggestedPrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetSuggestedPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getSuggestedPrices(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetSuggestedPricesStubBuilder =
        GetSuggestedPricesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-prices/suggestions"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateBusinessPrices.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateBusinessPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateBusinessPrices(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateBusinessPricesStubBuilder =
        UpdateBusinessPricesStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-prices/updates"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updatePrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdatePricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updatePrices(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdatePricesStubBuilder =
        UpdatePricesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-prices/updates"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
