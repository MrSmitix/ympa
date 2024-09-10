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
open class OrderLabelsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation generateOrderLabel.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param boxId path parameter boxId pattern.
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateOrderLabelStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateOrderLabel(campaignId: StringValuePattern, orderId: StringValuePattern, shipmentId: StringValuePattern, boxId: StringValuePattern, format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateOrderLabelStubBuilder =
        GenerateOrderLabelStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("shipmentId", shipmentId)
            .withPathParam("boxId", boxId)
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateOrderLabels.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateOrderLabelsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateOrderLabels(campaignId: StringValuePattern, orderId: StringValuePattern, format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateOrderLabelsStubBuilder =
        GenerateOrderLabelsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/labels"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOrderLabelsData.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrderLabelsDataStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrderLabelsData(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrderLabelsDataStubBuilder =
        GetOrderLabelsDataStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )
}
