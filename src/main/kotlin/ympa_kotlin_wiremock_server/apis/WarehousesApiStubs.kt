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
open class WarehousesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getFulfillmentWarehouses.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFulfillmentWarehousesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFulfillmentWarehouses(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFulfillmentWarehousesStubBuilder =
        GetFulfillmentWarehousesStubBuilder(objectMapper, get(urlPathTemplate("/warehouses"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getWarehouses.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetWarehousesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getWarehouses(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetWarehousesStubBuilder =
        GetWarehousesStubBuilder(objectMapper, get(urlPathTemplate("/businesses/{businessId}/warehouses"))
            .withPathParam("businessId", businessId)
            .configurer()
        )
}
