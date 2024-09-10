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
open class ReportsApiStubs(private val objectMapper: ObjectMapper) {

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
     * Construct a stub for the operation generateGoodsMovementReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateGoodsMovementReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateGoodsMovementReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateGoodsMovementReportStubBuilder =
        GenerateGoodsMovementReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/goods-movement/generate"))
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
     * Construct a stub for the operation generateGoodsTurnoverReport.
     *
     * @param format query parameter format pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerateGoodsTurnoverReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generateGoodsTurnoverReport(format: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerateGoodsTurnoverReportStubBuilder =
        GenerateGoodsTurnoverReportStubBuilder(objectMapper, post(urlPathTemplate("/reports/goods-turnover/generate"))
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
}
