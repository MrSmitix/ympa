package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GenerateBoostConsolidatedRequest;
import org.openapitools.vertxweb.server.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsFeedbackRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsMovementReportRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.vertxweb.server.model.GenerateGoodsTurnoverRequest;
import org.openapitools.vertxweb.server.model.GenerateMassOrderLabelsRequest;
import org.openapitools.vertxweb.server.model.GeneratePricesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateReportResponse;
import org.openapitools.vertxweb.server.model.GenerateShelfsStatisticsRequest;
import org.openapitools.vertxweb.server.model.GenerateShipmentListDocumentReportRequest;
import org.openapitools.vertxweb.server.model.GenerateShowsSalesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.vertxweb.server.model.GenerateUnitedNettingReportRequest;
import org.openapitools.vertxweb.server.model.GenerateUnitedOrdersRequest;
import org.openapitools.vertxweb.server.model.GetReportInfoResponse;
import org.openapitools.vertxweb.server.model.PageFormatType;
import org.openapitools.vertxweb.server.model.ReportFormatType;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ReportsApi  {
    Future<ApiResponse<GenerateReportResponse>> generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest);
    Future<ApiResponse<GenerateReportResponse>> generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format);
    Future<ApiResponse<GenerateReportResponse>> generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format);
    Future<ApiResponse<GetReportInfoResponse>> getReportInfo(String reportId);
}
