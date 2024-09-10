package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GenerateBoostConsolidatedRequest;
import org.openapitools.server.api.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.server.api.model.GenerateGoodsFeedbackRequest;
import org.openapitools.server.api.model.GenerateGoodsMovementReportRequest;
import org.openapitools.server.api.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.server.api.model.GenerateGoodsTurnoverRequest;
import org.openapitools.server.api.model.GenerateMassOrderLabelsRequest;
import org.openapitools.server.api.model.GeneratePricesReportRequest;
import org.openapitools.server.api.model.GenerateReportResponse;
import org.openapitools.server.api.model.GenerateShelfsStatisticsRequest;
import org.openapitools.server.api.model.GenerateShipmentListDocumentReportRequest;
import org.openapitools.server.api.model.GenerateShowsSalesReportRequest;
import org.openapitools.server.api.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.server.api.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.server.api.model.GenerateUnitedNettingReportRequest;
import org.openapitools.server.api.model.GenerateUnitedOrdersRequest;
import org.openapitools.server.api.model.GetReportInfoResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageFormatType;
import org.openapitools.server.api.model.ReportFormatType;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ReportsApi  {
    //generateBoostConsolidatedReport
    void generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateCompetitorsPositionReport
    void generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsFeedbackReport
    void generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsMovementReport
    void generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsRealizationReport
    void generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateGoodsTurnoverReport
    void generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateMassOrderLabelsReport
    void generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generatePricesReport
    void generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateShelfsStatisticsReport
    void generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateShipmentListDocumentReport
    void generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateShowsSalesReport
    void generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateStocksOnWarehousesReport
    void generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateUnitedMarketplaceServicesReport
    void generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateUnitedNettingReport
    void generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //generateUnitedOrdersReport
    void generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format, Handler<AsyncResult<GenerateReportResponse>> handler);

    //getReportInfo
    void getReportInfo(String reportId, Handler<AsyncResult<GetReportInfoResponse>> handler);

}
