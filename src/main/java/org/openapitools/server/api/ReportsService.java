package org.openapitools.server.api;

import org.openapitools.server.model.ApiClientDataErrorResponse;
import org.openapitools.server.model.ApiForbiddenErrorResponse;
import org.openapitools.server.model.ApiLimitErrorResponse;
import org.openapitools.server.model.ApiNotFoundErrorResponse;
import org.openapitools.server.model.ApiServerErrorResponse;
import org.openapitools.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.model.GenerateBoostConsolidatedRequest;
import org.openapitools.server.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.server.model.GenerateGoodsFeedbackRequest;
import org.openapitools.server.model.GenerateGoodsMovementReportRequest;
import org.openapitools.server.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.server.model.GenerateGoodsTurnoverRequest;
import org.openapitools.server.model.GenerateMassOrderLabelsRequest;
import org.openapitools.server.model.GeneratePricesReportRequest;
import org.openapitools.server.model.GenerateReportResponse;
import org.openapitools.server.model.GenerateShelfsStatisticsRequest;
import org.openapitools.server.model.GenerateShipmentListDocumentReportRequest;
import org.openapitools.server.model.GenerateShowsSalesReportRequest;
import org.openapitools.server.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.server.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.server.model.GenerateUnitedNettingReportRequest;
import org.openapitools.server.model.GenerateUnitedOrdersRequest;
import org.openapitools.server.model.GetReportInfoResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PageFormatType;
import org.openapitools.server.model.ReportFormatType;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Reports'",
                             version = "7.8.0")
public interface ReportsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/boost-consolidated/generate", this::generateBoostConsolidatedReport);
        rules.post("/competitors-position/generate", this::generateCompetitorsPositionReport);
        rules.post("/goods-feedback/generate", this::generateGoodsFeedbackReport);
        rules.post("/goods-movement/generate", this::generateGoodsMovementReport);
        rules.post("/goods-realization/generate", this::generateGoodsRealizationReport);
        rules.post("/goods-turnover/generate", this::generateGoodsTurnoverReport);
        rules.post("/documents/labels/generate", this::generateMassOrderLabelsReport);
        rules.post("/prices/generate", this::generatePricesReport);
        rules.post("/shelf-statistics/generate", this::generateShelfsStatisticsReport);
        rules.post("/documents/shipment-list/generate", this::generateShipmentListDocumentReport);
        rules.post("/shows-sales/generate", this::generateShowsSalesReport);
        rules.post("/stocks-on-warehouses/generate", this::generateStocksOnWarehousesReport);
        rules.post("/united-marketplace-services/generate", this::generateUnitedMarketplaceServicesReport);
        rules.post("/united-netting/generate", this::generateUnitedNettingReport);
        rules.post("/united-orders/generate", this::generateUnitedOrdersReport);
        rules.get("/info/{reportId}", this::getReportInfo);
    }


    /**
     * POST /reports/boost-consolidated/generate : Отчет по бусту продаж.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateBoostConsolidatedReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/competitors-position/generate : Отчет «Конкурентная позиция».
     *
     * @param request the server request
     * @param response the server response
     */
    void generateCompetitorsPositionReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/goods-feedback/generate : Отчет по отзывам о товарах.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateGoodsFeedbackReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/goods-movement/generate : Отчет по движению товаров.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateGoodsMovementReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/goods-realization/generate : Отчет по реализации.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateGoodsRealizationReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/goods-turnover/generate : Отчет по оборачиваемости.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateGoodsTurnoverReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/documents/labels/generate : Готовые ярлыки‑наклейки на все коробки в нескольких заказах.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateMassOrderLabelsReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/prices/generate : Отчет «Цены на рынке».
     *
     * @param request the server request
     * @param response the server response
     */
    void generatePricesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/shelf-statistics/generate : Отчет по полкам.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateShelfsStatisticsReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/documents/shipment-list/generate : Получение листа сборки.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateShipmentListDocumentReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/shows-sales/generate : Отчет «Аналитика продаж».
     *
     * @param request the server request
     * @param response the server response
     */
    void generateShowsSalesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/stocks-on-warehouses/generate : Отчет по остаткам на складах.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateStocksOnWarehousesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/united-marketplace-services/generate : Отчет по стоимости услуг.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateUnitedMarketplaceServicesReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/united-netting/generate : Отчет по платежам.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateUnitedNettingReport(ServerRequest request, ServerResponse response);
    /**
     * POST /reports/united-orders/generate : Отчет по заказам.
     *
     * @param request the server request
     * @param response the server response
     */
    void generateUnitedOrdersReport(ServerRequest request, ServerResponse response);
    /**
     * GET /reports/info/{reportId} : Получение заданного отчета.
     *
     * @param request the server request
     * @param response the server response
     */
    void getReportInfo(ServerRequest request, ServerResponse response);
}
