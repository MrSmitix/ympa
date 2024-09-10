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
open class ShipmentsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation confirmShipment.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConfirmShipmentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun confirmShipment(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConfirmShipmentStubBuilder =
        ConfirmShipmentStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadShipmentAct.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadShipmentActStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadShipmentAct(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadShipmentActStubBuilder =
        DownloadShipmentActStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadShipmentDiscrepancyAct.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadShipmentDiscrepancyActStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadShipmentDiscrepancyAct(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadShipmentDiscrepancyActStubBuilder =
        DownloadShipmentDiscrepancyActStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadShipmentInboundAct.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadShipmentInboundActStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadShipmentInboundAct(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadShipmentInboundActStubBuilder =
        DownloadShipmentInboundActStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadShipmentPalletLabels.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadShipmentPalletLabelsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadShipmentPalletLabels(campaignId: StringValuePattern, shipmentId: StringValuePattern, format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadShipmentPalletLabelsStubBuilder =
        DownloadShipmentPalletLabelsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadShipmentReceptionTransferAct.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param warehouseId query parameter warehouseId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadShipmentReceptionTransferActStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadShipmentReceptionTransferAct(campaignId: StringValuePattern, warehouseId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadShipmentReceptionTransferActStubBuilder =
        DownloadShipmentReceptionTransferActStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/shipments/reception-transfer-act"))
            .withPathParam("campaignId", campaignId)
            .apply { warehouseId?.let { withQueryParam("warehouseId", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadShipmentTransportationWaybill.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadShipmentTransportationWaybillStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadShipmentTransportationWaybill(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadShipmentTransportationWaybillStubBuilder =
        DownloadShipmentTransportationWaybillStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getShipment.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param cancelledOrders query parameter cancelledOrders pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetShipmentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getShipment(campaignId: StringValuePattern, shipmentId: StringValuePattern, cancelledOrders: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetShipmentStubBuilder =
        GetShipmentStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .apply { cancelledOrders?.let { withQueryParam("cancelledOrders", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getShipmentOrdersInfo.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetShipmentOrdersInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getShipmentOrdersInfo(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetShipmentOrdersInfoStubBuilder =
        GetShipmentOrdersInfoStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation searchShipments.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchShipmentsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchShipments(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchShipmentsStubBuilder =
        SearchShipmentsStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation setShipmentPalletsCount.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetShipmentPalletsCountStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setShipmentPalletsCount(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetShipmentPalletsCountStubBuilder =
        SetShipmentPalletsCountStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )

    /**
     * Construct a stub for the operation transferOrdersFromShipment.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param shipmentId path parameter shipmentId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TransferOrdersFromShipmentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun transferOrdersFromShipment(campaignId: StringValuePattern, shipmentId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): TransferOrdersFromShipmentStubBuilder =
        TransferOrdersFromShipmentStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("shipmentId", shipmentId)
            .configurer()
        )
}
