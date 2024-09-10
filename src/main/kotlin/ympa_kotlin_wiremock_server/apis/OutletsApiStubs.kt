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
open class OutletsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createOutlet.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateOutletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createOutlet(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateOutletStubBuilder =
        CreateOutletStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/outlets"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteOutlet.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param outletId path parameter outletId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteOutletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteOutlet(campaignId: StringValuePattern, outletId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteOutletStubBuilder =
        DeleteOutletStubBuilder(objectMapper, delete(urlPathTemplate("/campaigns/{campaignId}/outlets/{outletId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("outletId", outletId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOutlet.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param outletId path parameter outletId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOutletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOutlet(campaignId: StringValuePattern, outletId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOutletStubBuilder =
        GetOutletStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/outlets/{outletId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("outletId", outletId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOutlets.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param regionId query parameter regionId pattern.
     * @param shopOutletCode query parameter shopOutletCode pattern.
     * @param regionId2 query parameter regionId2 pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOutletsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOutlets(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, regionId: StringValuePattern? = null, shopOutletCode: StringValuePattern? = null, regionId2: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOutletsStubBuilder =
        GetOutletsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/outlets"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { regionId?.let { withQueryParam("regionId", it) } }
            .apply { shopOutletCode?.let { withQueryParam("shopOutletCode", it) } }
            .apply { regionId2?.let { withQueryParam("regionId2", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOutlet.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param outletId path parameter outletId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOutletStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOutlet(campaignId: StringValuePattern, outletId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOutletStubBuilder =
        UpdateOutletStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/outlets/{outletId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("outletId", outletId)
            .configurer()
        )
}
