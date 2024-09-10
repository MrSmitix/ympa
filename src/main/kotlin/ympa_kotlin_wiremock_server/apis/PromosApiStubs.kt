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
open class PromosApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deletePromoOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeletePromoOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deletePromoOffers(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeletePromoOffersStubBuilder =
        DeletePromoOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getPromoOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPromoOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPromoOffers(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPromoOffersStubBuilder =
        GetPromoOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getPromos.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPromosStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPromos(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPromosStubBuilder =
        GetPromosStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updatePromoOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdatePromoOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updatePromoOffers(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdatePromoOffersStubBuilder =
        UpdatePromoOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
