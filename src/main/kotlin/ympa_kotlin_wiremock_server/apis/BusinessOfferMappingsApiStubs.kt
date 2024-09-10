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
open class BusinessOfferMappingsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation addOffersToArchive.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AddOffersToArchiveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun addOffersToArchive(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AddOffersToArchiveStubBuilder =
        AddOffersToArchiveStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/archive"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteOffers(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteOffersStubBuilder =
        DeleteOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/delete"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteOffersFromArchive.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteOffersFromArchiveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteOffersFromArchive(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteOffersFromArchiveStubBuilder =
        DeleteOffersFromArchiveStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/unarchive"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOfferMappings.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferMappingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferMappings(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferMappingsStubBuilder =
        GetOfferMappingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getSuggestedOfferMappings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetSuggestedOfferMappingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getSuggestedOfferMappings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetSuggestedOfferMappingsStubBuilder =
        GetSuggestedOfferMappingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/suggestions"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOfferMappings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOfferMappingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOfferMappings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOfferMappingsStubBuilder =
        UpdateOfferMappingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/update"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
