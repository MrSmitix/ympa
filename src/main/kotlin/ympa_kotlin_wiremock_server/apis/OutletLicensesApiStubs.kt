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
open class OutletLicensesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteOutletLicenses.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param ids query parameter ids pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteOutletLicensesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteOutletLicenses(campaignId: StringValuePattern, ids: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteOutletLicensesStubBuilder =
        DeleteOutletLicensesStubBuilder(objectMapper, delete(urlPathTemplate("/campaigns/{campaignId}/outlets/licenses"))
            .withPathParam("campaignId", campaignId)
            .apply { ids?.let { withQueryParam("ids", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOutletLicenses.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param outletIds query parameter outletIds pattern.
     * @param ids query parameter ids pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOutletLicensesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOutletLicenses(campaignId: StringValuePattern, outletIds: StringValuePattern? = null, ids: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOutletLicensesStubBuilder =
        GetOutletLicensesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/outlets/licenses"))
            .withPathParam("campaignId", campaignId)
            .apply { outletIds?.let { withQueryParam("outletIds", it) } }
            .apply { ids?.let { withQueryParam("ids", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOutletLicenses.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOutletLicensesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOutletLicenses(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOutletLicensesStubBuilder =
        UpdateOutletLicensesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/outlets/licenses"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
