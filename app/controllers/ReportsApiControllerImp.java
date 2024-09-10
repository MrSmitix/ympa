package controllers;

import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.GenerateBoostConsolidatedRequest;
import apimodels.GenerateCompetitorsPositionReportRequest;
import apimodels.GenerateGoodsFeedbackRequest;
import apimodels.GenerateGoodsMovementReportRequest;
import apimodels.GenerateGoodsRealizationReportRequest;
import apimodels.GenerateGoodsTurnoverRequest;
import apimodels.GenerateMassOrderLabelsRequest;
import apimodels.GeneratePricesReportRequest;
import apimodels.GenerateReportResponse;
import apimodels.GenerateShelfsStatisticsRequest;
import apimodels.GenerateShipmentListDocumentReportRequest;
import apimodels.GenerateShowsSalesReportRequest;
import apimodels.GenerateStocksOnWarehousesReportRequest;
import apimodels.GenerateUnitedMarketplaceServicesReportRequest;
import apimodels.GenerateUnitedNettingReportRequest;
import apimodels.GenerateUnitedOrdersRequest;
import apimodels.GetReportInfoResponse;
import apimodels.PageFormatType;
import apimodels.ReportFormatType;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportsApiControllerImp extends ReportsApiControllerImpInterface {
    @Override
    public GenerateReportResponse generateBoostConsolidatedReport(Http.Request request, GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateCompetitorsPositionReport(Http.Request request, GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateGoodsFeedbackReport(Http.Request request, GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateGoodsMovementReport(Http.Request request, GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateGoodsRealizationReport(Http.Request request, GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateGoodsTurnoverReport(Http.Request request, GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateMassOrderLabelsReport(Http.Request request, GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generatePricesReport(Http.Request request, GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateShelfsStatisticsReport(Http.Request request, GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateShipmentListDocumentReport(Http.Request request, GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateShowsSalesReport(Http.Request request, GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateStocksOnWarehousesReport(Http.Request request, GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateUnitedMarketplaceServicesReport(Http.Request request, GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateUnitedNettingReport(Http.Request request, GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GenerateReportResponse generateUnitedOrdersReport(Http.Request request, GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) throws Exception {
        //Do your magic!!!
        return new GenerateReportResponse();
    }

    @Override
    public GetReportInfoResponse getReportInfo(Http.Request request, String reportId) throws Exception {
        //Do your magic!!!
        return new GetReportInfoResponse();
    }

}
