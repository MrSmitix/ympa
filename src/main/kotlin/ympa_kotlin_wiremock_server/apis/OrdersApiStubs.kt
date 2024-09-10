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
open class OrdersApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation acceptOrderCancellation.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AcceptOrderCancellationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun acceptOrderCancellation(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AcceptOrderCancellationStubBuilder =
        AcceptOrderCancellationStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOrder.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrderStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrder(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrderStubBuilder =
        GetOrderStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getOrders.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderIds query parameter orderIds pattern.
     * @param status query parameter status pattern.
     * @param substatus query parameter substatus pattern.
     * @param fromDate query parameter fromDate pattern.
     * @param toDate query parameter toDate pattern.
     * @param supplierShipmentDateFrom query parameter supplierShipmentDateFrom pattern.
     * @param supplierShipmentDateTo query parameter supplierShipmentDateTo pattern.
     * @param updatedAtFrom query parameter updatedAtFrom pattern.
     * @param updatedAtTo query parameter updatedAtTo pattern.
     * @param dispatchType query parameter dispatchType pattern.
     * @param fake query parameter fake pattern.
     * @param hasCis query parameter hasCis pattern.
     * @param onlyWaitingForCancellationApprove query parameter onlyWaitingForCancellationApprove pattern.
     * @param onlyEstimatedDelivery query parameter onlyEstimatedDelivery pattern.
     * @param buyerType query parameter buyerType pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrdersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrders(campaignId: StringValuePattern, orderIds: StringValuePattern? = null, status: StringValuePattern? = null, substatus: StringValuePattern? = null, fromDate: StringValuePattern? = null, toDate: StringValuePattern? = null, supplierShipmentDateFrom: StringValuePattern? = null, supplierShipmentDateTo: StringValuePattern? = null, updatedAtFrom: StringValuePattern? = null, updatedAtTo: StringValuePattern? = null, dispatchType: StringValuePattern? = null, fake: StringValuePattern? = null, hasCis: StringValuePattern? = null, onlyWaitingForCancellationApprove: StringValuePattern? = null, onlyEstimatedDelivery: StringValuePattern? = null, buyerType: StringValuePattern? = null, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrdersStubBuilder =
        GetOrdersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders"))
            .withPathParam("campaignId", campaignId)
            .apply { orderIds?.let { withQueryParam("orderIds", it) } }
            .apply { status?.let { withQueryParam("status", it) } }
            .apply { substatus?.let { withQueryParam("substatus", it) } }
            .apply { fromDate?.let { withQueryParam("fromDate", it) } }
            .apply { toDate?.let { withQueryParam("toDate", it) } }
            .apply { supplierShipmentDateFrom?.let { withQueryParam("supplierShipmentDateFrom", it) } }
            .apply { supplierShipmentDateTo?.let { withQueryParam("supplierShipmentDateTo", it) } }
            .apply { updatedAtFrom?.let { withQueryParam("updatedAtFrom", it) } }
            .apply { updatedAtTo?.let { withQueryParam("updatedAtTo", it) } }
            .apply { dispatchType?.let { withQueryParam("dispatchType", it) } }
            .apply { fake?.let { withQueryParam("fake", it) } }
            .apply { hasCis?.let { withQueryParam("hasCis", it) } }
            .apply { onlyWaitingForCancellationApprove?.let { withQueryParam("onlyWaitingForCancellationApprove", it) } }
            .apply { onlyEstimatedDelivery?.let { withQueryParam("onlyEstimatedDelivery", it) } }
            .apply { buyerType?.let { withQueryParam("buyerType", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation provideOrderDigitalCodes.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProvideOrderDigitalCodesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun provideOrderDigitalCodes(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProvideOrderDigitalCodesStubBuilder =
        ProvideOrderDigitalCodesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation provideOrderItemIdentifiers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProvideOrderItemIdentifiersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun provideOrderItemIdentifiers(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProvideOrderItemIdentifiersStubBuilder =
        ProvideOrderItemIdentifiersStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/identifiers"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation setOrderBoxLayout.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetOrderBoxLayoutStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setOrderBoxLayout(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetOrderBoxLayoutStubBuilder =
        SetOrderBoxLayoutStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/boxes"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation setOrderShipmentBoxes.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetOrderShipmentBoxesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setOrderShipmentBoxes(campaignId: StringValuePattern, orderId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetOrderShipmentBoxesStubBuilder =
        SetOrderShipmentBoxesStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOrderItems.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOrderItemsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOrderItems(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOrderItemsStubBuilder =
        UpdateOrderItemsStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/items"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOrderStatus.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOrderStatusStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOrderStatus(campaignId: StringValuePattern, orderId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOrderStatusStubBuilder =
        UpdateOrderStatusStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/status"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOrderStatuses.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOrderStatusesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOrderStatuses(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOrderStatusesStubBuilder =
        UpdateOrderStatusesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/orders/status-update"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
