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
open class HiddenOffersApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation addHiddenOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AddHiddenOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun addHiddenOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AddHiddenOffersStubBuilder =
        AddHiddenOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/hidden-offers"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteHiddenOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteHiddenOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteHiddenOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteHiddenOffersStubBuilder =
        DeleteHiddenOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/hidden-offers/delete"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getHiddenOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param offerId query parameter offerId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetHiddenOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getHiddenOffers(campaignId: StringValuePattern, offerId: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, offset: StringValuePattern? = null, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetHiddenOffersStubBuilder =
        GetHiddenOffersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/hidden-offers"))
            .withPathParam("campaignId", campaignId)
            .apply { offerId?.let { withQueryParam("offerId", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )
}
