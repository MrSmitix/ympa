package ympa_kotlin_vertx_server.apis

import ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse
import ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_vertx_server.models.ApiLimitErrorResponse
import ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_vertx_server.models.ApiServerErrorResponse
import ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_vertx_server.models.GenerateBoostConsolidatedRequest
import ympa_kotlin_vertx_server.models.GenerateCompetitorsPositionReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsFeedbackRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsMovementReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsRealizationReportRequest
import ympa_kotlin_vertx_server.models.GenerateGoodsTurnoverRequest
import ympa_kotlin_vertx_server.models.GenerateMassOrderLabelsRequest
import ympa_kotlin_vertx_server.models.GeneratePricesReportRequest
import ympa_kotlin_vertx_server.models.GenerateReportResponse
import ympa_kotlin_vertx_server.models.GenerateShelfsStatisticsRequest
import ympa_kotlin_vertx_server.models.GenerateShipmentListDocumentReportRequest
import ympa_kotlin_vertx_server.models.GenerateShowsSalesReportRequest
import ympa_kotlin_vertx_server.models.GenerateStocksOnWarehousesReportRequest
import ympa_kotlin_vertx_server.models.GenerateUnitedMarketplaceServicesReportRequest
import ympa_kotlin_vertx_server.models.GenerateUnitedNettingReportRequest
import ympa_kotlin_vertx_server.models.GenerateUnitedOrdersRequest
import ympa_kotlin_vertx_server.models.GetReportInfoResponse
import ympa_kotlin_vertx_server.models.PageFormatType
import ympa_kotlin_vertx_server.models.ReportFormatType
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface ReportsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* generateBoostConsolidatedReport
     * Отчет по бусту продаж */
    suspend fun generateBoostConsolidatedReport(generateBoostConsolidatedRequest:GenerateBoostConsolidatedRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateCompetitorsPositionReport
     * Отчет «Конкурентная позиция» */
    suspend fun generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest:GenerateCompetitorsPositionReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateGoodsFeedbackReport
     * Отчет по отзывам о товарах */
    suspend fun generateGoodsFeedbackReport(generateGoodsFeedbackRequest:GenerateGoodsFeedbackRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateGoodsMovementReport
     * Отчет по движению товаров */
    suspend fun generateGoodsMovementReport(generateGoodsMovementReportRequest:GenerateGoodsMovementReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateGoodsRealizationReport
     * Отчет по реализации */
    suspend fun generateGoodsRealizationReport(generateGoodsRealizationReportRequest:GenerateGoodsRealizationReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateGoodsTurnoverReport
     * Отчет по оборачиваемости */
    suspend fun generateGoodsTurnoverReport(generateGoodsTurnoverRequest:GenerateGoodsTurnoverRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateMassOrderLabelsReport
     * Готовые ярлыки‑наклейки на все коробки в нескольких заказах */
    suspend fun generateMassOrderLabelsReport(generateMassOrderLabelsRequest:GenerateMassOrderLabelsRequest?,format:PageFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generatePricesReport
     * Отчет «Цены на рынке» */
    suspend fun generatePricesReport(generatePricesReportRequest:GeneratePricesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateShelfsStatisticsReport
     * Отчет по полкам */
    suspend fun generateShelfsStatisticsReport(generateShelfsStatisticsRequest:GenerateShelfsStatisticsRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateShipmentListDocumentReport
     * Получение листа сборки */
    suspend fun generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest:GenerateShipmentListDocumentReportRequest?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateShowsSalesReport
     * Отчет «Аналитика продаж» */
    suspend fun generateShowsSalesReport(generateShowsSalesReportRequest:GenerateShowsSalesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateStocksOnWarehousesReport
     * Отчет по остаткам на складах */
    suspend fun generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest:GenerateStocksOnWarehousesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateUnitedMarketplaceServicesReport
     * Отчет по стоимости услуг */
    suspend fun generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest:GenerateUnitedMarketplaceServicesReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateUnitedNettingReport
     * Отчет по платежам */
    suspend fun generateUnitedNettingReport(generateUnitedNettingReportRequest:GenerateUnitedNettingReportRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* generateUnitedOrdersReport
     * Отчет по заказам */
    suspend fun generateUnitedOrdersReport(generateUnitedOrdersRequest:GenerateUnitedOrdersRequest?,format:ReportFormatType?,context:OperationRequest):Response<GenerateReportResponse>
    /* getReportInfo
     * Получение заданного отчета */
    suspend fun getReportInfo(reportId:kotlin.String?,context:OperationRequest):Response<GetReportInfoResponse>
    companion object {
        const val address = "ReportsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in ReportsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ReportsApi::class.java, address)
            return routerFactory
        }
    }
}
