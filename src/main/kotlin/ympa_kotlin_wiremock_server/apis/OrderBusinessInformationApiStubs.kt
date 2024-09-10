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
open class OrderBusinessInformationApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getOrderBusinessBuyerInfo.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrderBusinessBuyerInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrderBusinessBuyerInfo(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrderBusinessBuyerInfoStubBuilder =
        GetOrderBusinessBuyerInfoStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/business-buyer"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOrderBusinessDocumentsInfo.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrderBusinessDocumentsInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrderBusinessDocumentsInfo(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrderBusinessDocumentsInfoStubBuilder =
        GetOrderBusinessDocumentsInfoStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/documents"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )
}
