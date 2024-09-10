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
open class OrderDeliveryApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getOrderBuyerInfo.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrderBuyerInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrderBuyerInfo(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrderBuyerInfoStubBuilder =
        GetOrderBuyerInfoStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/buyer"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation setOrderDeliveryDate.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetOrderDeliveryDateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setOrderDeliveryDate(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetOrderDeliveryDateStubBuilder =
        SetOrderDeliveryDateStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/date"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation setOrderDeliveryTrackCode.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetOrderDeliveryTrackCodeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setOrderDeliveryTrackCode(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetOrderDeliveryTrackCodeStubBuilder =
        SetOrderDeliveryTrackCodeStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/track"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOrderStorageLimit.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOrderStorageLimitStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOrderStorageLimit(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOrderStorageLimitStubBuilder =
        UpdateOrderStorageLimitStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation verifyOrderEac.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [VerifyOrderEacStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun verifyOrderEac(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): VerifyOrderEacStubBuilder =
        VerifyOrderEacStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/verifyEac"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )
}
