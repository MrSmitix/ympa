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
open class FbsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation addHiddenOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AddHiddenOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun addHiddenOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AddHiddenOffersStubBuilder =
        AddHiddenOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/hidden-offers"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation addOffersToArchive.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AddOffersToArchiveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun addOffersToArchive(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AddOffersToArchiveStubBuilder =
        AddOffersToArchiveStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/archive"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation calculateTariffs.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CalculateTariffsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun calculateTariffs(configurer: MappingBuilder.() -> MappingBuilder = { this }): CalculateTariffsStubBuilder =
        CalculateTariffsStubBuilder(objectMapper, post(urlPathTemplate("/tariffs/calculate"))
            .configurer()
        )

    /**
     * Construct a stub for the operation confirmBusinessPrices.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConfirmBusinessPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun confirmBusinessPrices(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConfirmBusinessPricesStubBuilder =
        ConfirmBusinessPricesStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/price-quarantine/confirm"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation confirmCampaignPrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConfirmCampaignPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun confirmCampaignPrices(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConfirmCampaignPricesStubBuilder =
        ConfirmCampaignPricesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/price-quarantine/confirm"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

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
     * Construct a stub for the operation createChat.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateChatStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createChat(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateChatStubBuilder =
        CreateChatStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/new"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteCampaignOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteCampaignOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteCampaignOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteCampaignOffersStubBuilder =
        DeleteCampaignOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers/delete"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteGoodsFeedbackComment.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteGoodsFeedbackCommentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteGoodsFeedbackComment(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteGoodsFeedbackCommentStubBuilder =
        DeleteGoodsFeedbackCommentStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/comments/delete"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteHiddenOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteHiddenOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteHiddenOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteHiddenOffersStubBuilder =
        DeleteHiddenOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/hidden-offers/delete"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteOffers(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteOffersStubBuilder =
        DeleteOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/delete"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteOffersFromArchive.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteOffersFromArchiveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteOffersFromArchive(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteOffersFromArchiveStubBuilder =
        DeleteOffersFromArchiveStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/unarchive"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deletePromoOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeletePromoOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deletePromoOffers(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeletePromoOffersStubBuilder =
        DeletePromoOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos/offers/delete"))
            .withPathParam("businessId", businessId)
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
     * Construct a stub for the operation generateBoostConsolidatedReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateBoostConsolidatedReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateBoostConsolidatedReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateBoostConsolidatedReportStubBuilder =
        GenerateBoostConsolidatedReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/boost-consolidated/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateCompetitorsPositionReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateCompetitorsPositionReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateCompetitorsPositionReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateCompetitorsPositionReportStubBuilder =
        GenerateCompetitorsPositionReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/competitors-position/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateGoodsFeedbackReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateGoodsFeedbackReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateGoodsFeedbackReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateGoodsFeedbackReportStubBuilder =
        GenerateGoodsFeedbackReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/goods-feedback/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateGoodsRealizationReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateGoodsRealizationReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateGoodsRealizationReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateGoodsRealizationReportStubBuilder =
        GenerateGoodsRealizationReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/goods-realization/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateMassOrderLabelsReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateMassOrderLabelsReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateMassOrderLabelsReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateMassOrderLabelsReportStubBuilder =
        GenerateMassOrderLabelsReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/documents/labels/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

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
     * Construct a stub for the operation generatePricesReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GeneratePricesReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generatePricesReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GeneratePricesReportStubBuilder =
        GeneratePricesReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/prices/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateShelfsStatisticsReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateShelfsStatisticsReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateShelfsStatisticsReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateShelfsStatisticsReportStubBuilder =
        GenerateShelfsStatisticsReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/shelf-statistics/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateShipmentListDocumentReport.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateShipmentListDocumentReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateShipmentListDocumentReport(configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateShipmentListDocumentReportStubBuilder =
        GenerateShipmentListDocumentReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/documents/shipment-list/generate"))
            .configurer()
        )

    /**
     * Construct a stub for the operation generateShowsSalesReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateShowsSalesReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateShowsSalesReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateShowsSalesReportStubBuilder =
        GenerateShowsSalesReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/shows-sales/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateStocksOnWarehousesReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateStocksOnWarehousesReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateStocksOnWarehousesReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateStocksOnWarehousesReportStubBuilder =
        GenerateStocksOnWarehousesReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/stocks-on-warehouses/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateUnitedMarketplaceServicesReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateUnitedMarketplaceServicesReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateUnitedMarketplaceServicesReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateUnitedMarketplaceServicesReportStubBuilder =
        GenerateUnitedMarketplaceServicesReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/united-marketplace-services/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateUnitedNettingReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateUnitedNettingReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateUnitedNettingReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateUnitedNettingReportStubBuilder =
        GenerateUnitedNettingReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/united-netting/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generateUnitedOrdersReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateUnitedOrdersReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateUnitedOrdersReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateUnitedOrdersReportStubBuilder =
        GenerateUnitedOrdersReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/united-orders/generate"))
            .apply { format?.let { withQueryParam("format", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getAllOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId query parameter feedId pattern.
     * @param chunk query parameter chunk pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAllOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAllOffers(campaignId: StringValuePattern, feedId: StringValuePattern? = null, chunk: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAllOffersStubBuilder =
        GetAllOffersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offers/all"))
            .withPathParam("campaignId", campaignId)
            .apply { feedId?.let { withQueryParam("feedId", it) } }
            .apply { chunk?.let { withQueryParam("chunk", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getBidsInfoForBusiness.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBidsInfoForBusinessStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBidsInfoForBusiness(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBidsInfoForBusinessStubBuilder =
        GetBidsInfoForBusinessStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/bids/info"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getBidsRecommendations.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBidsRecommendationsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBidsRecommendations(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBidsRecommendationsStubBuilder =
        GetBidsRecommendationsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/bids/recommendations"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getBusinessQuarantineOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessQuarantineOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessQuarantineOffers(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessQuarantineOffersStubBuilder =
        GetBusinessQuarantineOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/price-quarantine"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getBusinessSettings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetBusinessSettingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getBusinessSettings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetBusinessSettingsStubBuilder =
        GetBusinessSettingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/settings"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaign.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaign(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignStubBuilder =
        GetCampaignStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignLogins.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignLoginsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignLogins(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignLoginsStubBuilder =
        GetCampaignLoginsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/logins"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignOffers(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignOffersStubBuilder =
        GetCampaignOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignQuarantineOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignQuarantineOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignQuarantineOffers(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignQuarantineOffersStubBuilder =
        GetCampaignQuarantineOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/price-quarantine"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignRegion.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignRegionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignRegion(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignRegionStubBuilder =
        GetCampaignRegionStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/region"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignSettings.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignSettingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignSettings(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignSettingsStubBuilder =
        GetCampaignSettingsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/settings"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaigns.
     *
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaigns(page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignsStubBuilder =
        GetCampaignsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns"))
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignsByLogin.
     *
     * @param login path parameter login pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignsByLoginStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignsByLogin(login: StringValuePattern, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignsByLoginStubBuilder =
        GetCampaignsByLoginStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/by_login/{login}"))
            .withPathParam("login", login)
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getCategoriesMaxSaleQuantum.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCategoriesMaxSaleQuantumStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCategoriesMaxSaleQuantum(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCategoriesMaxSaleQuantumStubBuilder =
        GetCategoriesMaxSaleQuantumStubBuilder(objectMapper, post(urlPathTemplate("/categories/max-sale-quantum"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getCategoriesTree.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCategoriesTreeStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCategoriesTree(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCategoriesTreeStubBuilder =
        GetCategoriesTreeStubBuilder(objectMapper, post(urlPathTemplate("/categories/tree"))
            .configurer()
        )

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
     * Construct a stub for the operation getChatHistory.
     *
     * @param businessId path parameter businessId pattern.
     * @param chatId query parameter chatId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetChatHistoryStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getChatHistory(businessId: StringValuePattern, chatId: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetChatHistoryStubBuilder =
        GetChatHistoryStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/history"))
            .withPathParam("businessId", businessId)
            .apply { chatId?.let { withQueryParam("chatId", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getChats.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetChatsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getChats(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetChatsStubBuilder =
        GetChatsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getDeliveryServices.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetDeliveryServicesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getDeliveryServices(configurer: MappingBuilder.() -> MappingBuilder = { this }): GetDeliveryServicesStubBuilder =
        GetDeliveryServicesStubBuilder(objectMapper, get(urlPathTemplate("/delivery/services"))
            .configurer()
        )

    /**
     * Construct a stub for the operation getFeed.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeed(campaignId: StringValuePattern, feedId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedStubBuilder =
        GetFeedStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getFeedIndexLogs.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param limit query parameter limit pattern.
     * @param publishedTimeFrom query parameter publishedTimeFrom pattern.
     * @param publishedTimeTo query parameter publishedTimeTo pattern.
     * @param status query parameter status pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedIndexLogsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeedIndexLogs(campaignId: StringValuePattern, feedId: StringValuePattern, limit: StringValuePattern? = null, publishedTimeFrom: StringValuePattern? = null, publishedTimeTo: StringValuePattern? = null, status: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedIndexLogsStubBuilder =
        GetFeedIndexLogsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}/index-logs"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { publishedTimeFrom?.let { withQueryParam("publishedTimeFrom", it) } }
            .apply { publishedTimeTo?.let { withQueryParam("publishedTimeTo", it) } }
            .apply { status?.let { withQueryParam("status", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getFeedbackAndCommentUpdates.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param fromDate query parameter fromDate pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedbackAndCommentUpdatesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeedbackAndCommentUpdates(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, fromDate: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedbackAndCommentUpdatesStubBuilder =
        GetFeedbackAndCommentUpdatesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feedback/updates"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { fromDate?.let { withQueryParam("fromDate", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getFeeds.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetFeedsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getFeeds(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetFeedsStubBuilder =
        GetFeedsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/feeds"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getGoodsFeedbackComments.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetGoodsFeedbackCommentsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getGoodsFeedbackComments(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetGoodsFeedbackCommentsStubBuilder =
        GetGoodsFeedbackCommentsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/comments"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getGoodsFeedbacks.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetGoodsFeedbacksStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getGoodsFeedbacks(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetGoodsFeedbacksStubBuilder =
        GetGoodsFeedbacksStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getGoodsStats.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetGoodsStatsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getGoodsStats(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetGoodsStatsStubBuilder =
        GetGoodsStatsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/stats/skus"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getHiddenOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param offerId query parameter offerId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetHiddenOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getHiddenOffers(campaignId: StringValuePattern, offerId: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, offset: StringValuePattern? = null, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetHiddenOffersStubBuilder =
        GetHiddenOffersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/hidden-offers"))
            .withPathParam("campaignId", campaignId)
            .apply { offerId?.let { withQueryParam("offerId", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
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
     * Construct a stub for the operation getOfferMappingEntries.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param offerId query parameter offerId pattern.
     * @param shopSku query parameter shopSku pattern.
     * @param mappingKind query parameter mappingKind pattern.
     * @param status query parameter status pattern.
     * @param availability query parameter availability pattern.
     * @param categoryId query parameter categoryId pattern.
     * @param vendor query parameter vendor pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferMappingEntriesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferMappingEntries(campaignId: StringValuePattern, offerId: StringValuePattern? = null, shopSku: StringValuePattern? = null, mappingKind: StringValuePattern? = null, status: StringValuePattern? = null, availability: StringValuePattern? = null, categoryId: StringValuePattern? = null, vendor: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferMappingEntriesStubBuilder =
        GetOfferMappingEntriesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offer-mapping-entries"))
            .withPathParam("campaignId", campaignId)
            .apply { offerId?.let { withQueryParam("offerId", it) } }
            .apply { shopSku?.let { withQueryParam("shopSku", it) } }
            .apply { mappingKind?.let { withQueryParam("mappingKind", it) } }
            .apply { status?.let { withQueryParam("status", it) } }
            .apply { availability?.let { withQueryParam("availability", it) } }
            .apply { categoryId?.let { withQueryParam("categoryId", it) } }
            .apply { vendor?.let { withQueryParam("vendor", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOfferMappings.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferMappingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferMappings(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferMappingsStubBuilder =
        GetOfferMappingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOfferRecommendations.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOfferRecommendationsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOfferRecommendations(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOfferRecommendationsStubBuilder =
        GetOfferRecommendationsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offers/recommendations"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param query query parameter query pattern.
     * @param feedId query parameter feedId pattern.
     * @param shopCategoryId query parameter shopCategoryId pattern.
     * @param currency query parameter currency pattern.
     * @param matched query parameter matched pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOffers(campaignId: StringValuePattern, query: StringValuePattern? = null, feedId: StringValuePattern? = null, shopCategoryId: StringValuePattern? = null, currency: StringValuePattern? = null, matched: StringValuePattern? = null, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOffersStubBuilder =
        GetOffersStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offers"))
            .withPathParam("campaignId", campaignId)
            .apply { query?.let { withQueryParam("query", it) } }
            .apply { feedId?.let { withQueryParam("feedId", it) } }
            .apply { shopCategoryId?.let { withQueryParam("shopCategoryId", it) } }
            .apply { currency?.let { withQueryParam("currency", it) } }
            .apply { matched?.let { withQueryParam("matched", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
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
     * Construct a stub for the operation getOrdersStats.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetOrdersStatsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getOrdersStats(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetOrdersStatsStubBuilder =
        GetOrdersStatsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/stats/orders"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getPrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param archived query parameter archived pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPrices(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, archived: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPricesStubBuilder =
        GetPricesStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/offer-prices"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { archived?.let { withQueryParam("archived", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getPricesByOfferIds.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPricesByOfferIdsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPricesByOfferIds(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPricesByOfferIdsStubBuilder =
        GetPricesByOfferIdsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-prices"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getPromoOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPromoOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPromoOffers(businessId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPromoOffersStubBuilder =
        GetPromoOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos/offers"))
            .withPathParam("businessId", businessId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getPromos.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetPromosStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getPromos(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetPromosStubBuilder =
        GetPromosStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

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

    /**
     * Construct a stub for the operation getReportInfo.
     *
     * @param reportId path parameter reportId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReportInfoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReportInfo(reportId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReportInfoStubBuilder =
        GetReportInfoStubBuilder(objectMapper, get(urlPathTemplate("/reports/info/{reportId}"))
            .withPathParam("reportId", reportId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturn.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturn(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnStubBuilder =
        GetReturnStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturnApplication.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnApplicationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturnApplication(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnApplicationStubBuilder =
        GetReturnApplicationStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturnPhoto.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param orderId path parameter orderId pattern.
     * @param returnId path parameter returnId pattern.
     * @param itemId path parameter itemId pattern.
     * @param imageHash path parameter imageHash pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnPhotoStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturnPhoto(campaignId: StringValuePattern, orderId: StringValuePattern, returnId: StringValuePattern, itemId: StringValuePattern, imageHash: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnPhotoStubBuilder =
        GetReturnPhotoStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("orderId", orderId)
            .withPathParam("returnId", returnId)
            .withPathParam("itemId", itemId)
            .withPathParam("imageHash", imageHash)
            .configurer()
        )

    /**
     * Construct a stub for the operation getReturns.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param orderIds query parameter orderIds pattern.
     * @param statuses query parameter statuses pattern.
     * @param type query parameter type pattern.
     * @param fromDate query parameter fromDate pattern.
     * @param toDate query parameter toDate pattern.
     * @param fromDate2 query parameter fromDate2 pattern.
     * @param toDate2 query parameter toDate2 pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetReturnsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getReturns(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, orderIds: StringValuePattern? = null, statuses: StringValuePattern? = null, type: StringValuePattern? = null, fromDate: StringValuePattern? = null, toDate: StringValuePattern? = null, fromDate2: StringValuePattern? = null, toDate2: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetReturnsStubBuilder =
        GetReturnsStubBuilder(objectMapper, get(urlPathTemplate("/campaigns/{campaignId}/returns"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { orderIds?.let { withQueryParam("orderIds", it) } }
            .apply { statuses?.let { withQueryParam("statuses", it) } }
            .apply { type?.let { withQueryParam("type", it) } }
            .apply { fromDate?.let { withQueryParam("fromDate", it) } }
            .apply { toDate?.let { withQueryParam("toDate", it) } }
            .apply { fromDate2?.let { withQueryParam("fromDate2", it) } }
            .apply { toDate2?.let { withQueryParam("toDate2", it) } }
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
     * Construct a stub for the operation getStocks.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetStocksStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getStocks(campaignId: StringValuePattern, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetStocksStubBuilder =
        GetStocksStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers/stocks"))
            .withPathParam("campaignId", campaignId)
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getSuggestedOfferMappingEntries.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetSuggestedOfferMappingEntriesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getSuggestedOfferMappingEntries(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetSuggestedOfferMappingEntriesStubBuilder =
        GetSuggestedOfferMappingEntriesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-mapping-entries/suggestions"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getSuggestedOfferMappings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetSuggestedOfferMappingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getSuggestedOfferMappings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetSuggestedOfferMappingsStubBuilder =
        GetSuggestedOfferMappingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/suggestions"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getSuggestedPrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetSuggestedPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getSuggestedPrices(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetSuggestedPricesStubBuilder =
        GetSuggestedPricesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-prices/suggestions"))
            .withPathParam("campaignId", campaignId)
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
     * Construct a stub for the operation putBidsForBusiness.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PutBidsForBusinessStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun putBidsForBusiness(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PutBidsForBusinessStubBuilder =
        PutBidsForBusinessStubBuilder(objectMapper, put(urlPathTemplate("/businesses/{businessId}/bids"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation putBidsForCampaign.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PutBidsForCampaignStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun putBidsForCampaign(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PutBidsForCampaignStubBuilder =
        PutBidsForCampaignStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/bids"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation refreshFeed.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RefreshFeedStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun refreshFeed(campaignId: StringValuePattern, feedId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RefreshFeedStubBuilder =
        RefreshFeedStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}/refresh"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
            .configurer()
        )

    /**
     * Construct a stub for the operation searchRegionChildren.
     *
     * @param regionId path parameter regionId pattern.
     * @param page query parameter page pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchRegionChildrenStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchRegionChildren(regionId: StringValuePattern, page: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchRegionChildrenStubBuilder =
        SearchRegionChildrenStubBuilder(objectMapper, get(urlPathTemplate("/regions/{regionId}/children"))
            .withPathParam("regionId", regionId)
            .apply { page?.let { withQueryParam("page", it) } }
            .apply { pageSize?.let { withQueryParam("pageSize", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation searchRegionsById.
     *
     * @param regionId path parameter regionId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchRegionsByIdStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchRegionsById(regionId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchRegionsByIdStubBuilder =
        SearchRegionsByIdStubBuilder(objectMapper, get(urlPathTemplate("/regions/{regionId}"))
            .withPathParam("regionId", regionId)
            .configurer()
        )

    /**
     * Construct a stub for the operation searchRegionsByName.
     *
     * @param name query parameter name pattern.
     * @param pageToken query parameter pageToken pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchRegionsByNameStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchRegionsByName(name: StringValuePattern? = null, pageToken: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchRegionsByNameStubBuilder =
        SearchRegionsByNameStubBuilder(objectMapper, get(urlPathTemplate("/regions"))
            .apply { name?.let { withQueryParam("name", it) } }
            .apply { pageToken?.let { withQueryParam("pageToken", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
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
     * Construct a stub for the operation sendFileToChat.
     *
     * @param businessId path parameter businessId pattern.
     * @param chatId query parameter chatId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SendFileToChatStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sendFileToChat(businessId: StringValuePattern, chatId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SendFileToChatStubBuilder =
        SendFileToChatStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/file/send"))
            .withPathParam("businessId", businessId)
            .apply { chatId?.let { withQueryParam("chatId", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation sendMessageToChat.
     *
     * @param businessId path parameter businessId pattern.
     * @param chatId query parameter chatId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SendMessageToChatStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sendMessageToChat(businessId: StringValuePattern, chatId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SendMessageToChatStubBuilder =
        SendMessageToChatStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/chats/message"))
            .withPathParam("businessId", businessId)
            .apply { chatId?.let { withQueryParam("chatId", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation setFeedParams.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param feedId path parameter feedId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SetFeedParamsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun setFeedParams(campaignId: StringValuePattern, feedId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SetFeedParamsStubBuilder =
        SetFeedParamsStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/feeds/{feedId}/params"))
            .withPathParam("campaignId", campaignId)
            .withPathParam("feedId", feedId)
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
     * Construct a stub for the operation skipGoodsFeedbacksReaction.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SkipGoodsFeedbacksReactionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun skipGoodsFeedbacksReaction(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SkipGoodsFeedbacksReactionStubBuilder =
        SkipGoodsFeedbacksReactionStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/skip-reaction"))
            .withPathParam("businessId", businessId)
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

    /**
     * Construct a stub for the operation updateBusinessPrices.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateBusinessPricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateBusinessPrices(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateBusinessPricesStubBuilder =
        UpdateBusinessPricesStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-prices/updates"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateCampaignOffers.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateCampaignOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateCampaignOffers(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateCampaignOffersStubBuilder =
        UpdateCampaignOffersStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offers/update"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateGoodsFeedbackComment.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateGoodsFeedbackCommentStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateGoodsFeedbackComment(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateGoodsFeedbackCommentStubBuilder =
        UpdateGoodsFeedbackCommentStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/goods-feedback/comments/update"))
            .withPathParam("businessId", businessId)
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

    /**
     * Construct a stub for the operation updateOfferMappingEntries.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOfferMappingEntriesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOfferMappingEntries(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOfferMappingEntriesStubBuilder =
        UpdateOfferMappingEntriesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-mapping-entries/updates"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateOfferMappings.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateOfferMappingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateOfferMappings(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateOfferMappingsStubBuilder =
        UpdateOfferMappingsStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/offer-mappings/update"))
            .withPathParam("businessId", businessId)
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

    /**
     * Construct a stub for the operation updatePrices.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdatePricesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updatePrices(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdatePricesStubBuilder =
        UpdatePricesStubBuilder(objectMapper, post(urlPathTemplate("/campaigns/{campaignId}/offer-prices/updates"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updatePromoOffers.
     *
     * @param businessId path parameter businessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdatePromoOffersStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updatePromoOffers(businessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdatePromoOffersStubBuilder =
        UpdatePromoOffersStubBuilder(objectMapper, post(urlPathTemplate("/businesses/{businessId}/promos/offers/update"))
            .withPathParam("businessId", businessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation updateStocks.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UpdateStocksStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun updateStocks(campaignId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): UpdateStocksStubBuilder =
        UpdateStocksStubBuilder(objectMapper, put(urlPathTemplate("/campaigns/{campaignId}/offers/stocks"))
            .withPathParam("campaignId", campaignId)
            .configurer()
        )
}
