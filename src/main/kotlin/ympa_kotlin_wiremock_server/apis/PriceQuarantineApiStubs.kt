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
open class PriceQuarantineApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation confirmBusinessPrices.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConfirmBusinessPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun confirmBusinessPrices(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConfirmBusinessPricesStubBuilder =
        ConfirmBusinessPricesStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/price-quarantine/confirm"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation confirmCampaignPrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConfirmCampaignPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun confirmCampaignPrices(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConfirmCampaignPricesStubBuilder =
        ConfirmCampaignPricesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/price-quarantine/confirm"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getBusinessQuarantineOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessQuarantineOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessQuarantineOffers(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessQuarantineOffersStubBuilder =
        GetBusinessQuarantineOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/price-quarantine"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignQuarantineOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignQuarantineOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignQuarantineOffers(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignQuarantineOffersStubBuilder =
        GetCampaignQuarantineOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/price-quarantine"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )
}
