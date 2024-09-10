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
open class OfferMappingsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getOfferMappingEntries.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param offerId query parameter offerId pattern.
     * @param shopSku query parameter shopSku pattern.
     * @param mappingKind query parameter mappingKind pattern.
     * @param status query parameter status pattern.
     * @param availability query parameter availability pattern.
     * @param categoryId query parameter categoryId pattern.
     * @param vendor query parameter vendor pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferMappingEntriesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferMappingEntries(campaignId: StringValuePattern, offerId: StringValuePattern? = null, shopSku: StringValuePattern? = null, mappingKind: StringValuePattern? = null, status: StringValuePattern? = null, availability: StringValuePattern? = null, categoryId: StringValuePattern? = null, vendor: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferMappingEntriesStubBuilder =
        GetOfferMappingEntriesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offer-mapping-entries"))
            .withPathParam("campaignId", campaignId)
            .apply { offerId?.let { withQueryParam("offerId", it) } }
            .apply { shopSku?.let { withQueryParam("shopSku", it) } }
            .apply { mappingKind?.let { withQueryParam("mappingKind", it) } }
            .apply { status?.let { withQueryParam("status", it) } }
            .apply { availability?.let { withQueryParam("availability", it) } }
            .apply { categoryId?.let { withQueryParam("categoryId", it) } }
            .apply { vendor?.let { withQueryParam("vendor", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getSuggestedOfferMappingEntries.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetSuggestedOfferMappingEntriesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getSuggestedOfferMappingEntries(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetSuggestedOfferMappingEntriesStubBuilder =
        GetSuggestedOfferMappingEntriesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-mapping-entries/suggestions"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOfferMappingEntries.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOfferMappingEntriesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOfferMappingEntries(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOfferMappingEntriesStubBuilder =
        UpdateOfferMappingEntriesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-mapping-entries/updates"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
