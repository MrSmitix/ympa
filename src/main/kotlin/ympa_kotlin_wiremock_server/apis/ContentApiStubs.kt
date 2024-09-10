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
open class ContentApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getCategoryContentParameters.
     *
     * @param categoryId path parameter categoryId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCategoryContentParametersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCategoryContentParameters(categoryId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCategoryContentParametersStubBuilder =
        GetCategoryContentParametersStubBuilder(objectMapper, post(urlPathTemplate("/category/{categoryId}/parameters"))
            .withPathParam("categoryId", categoryId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOfferCardsContentStatus.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferCardsContentStatusStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferCardsContentStatus(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferCardsContentStatusStubBuilder =
        GetOfferCardsContentStatusStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-cards"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOfferContent.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOfferContentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOfferContent(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOfferContentStubBuilder =
        UpdateOfferContentStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-cards/update"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
