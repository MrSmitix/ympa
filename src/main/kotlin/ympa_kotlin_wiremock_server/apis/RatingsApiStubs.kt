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
open class RatingsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getQualityRatingDetails.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetQualityRatingDetailsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getQualityRatingDetails(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetQualityRatingDetailsStubBuilder =
        GetQualityRatingDetailsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/ratings/quality/details"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getQualityRatings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetQualityRatingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getQualityRatings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetQualityRatingsStubBuilder =
        GetQualityRatingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/ratings/quality"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
