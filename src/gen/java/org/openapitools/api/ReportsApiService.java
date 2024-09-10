package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GenerateBoostConsolidatedRequest;
import org.openapitools.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.model.GenerateGoodsFeedbackRequest;
import org.openapitools.model.GenerateGoodsMovementReportRequest;
import org.openapitools.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.model.GenerateGoodsTurnoverRequest;
import org.openapitools.model.GenerateMassOrderLabelsRequest;
import org.openapitools.model.GeneratePricesReportRequest;
import org.openapitools.model.GenerateReportResponse;
import org.openapitools.model.GenerateShelfsStatisticsRequest;
import org.openapitools.model.GenerateShipmentListDocumentReportRequest;
import org.openapitools.model.GenerateShowsSalesReportRequest;
import org.openapitools.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.model.GenerateUnitedNettingReportRequest;
import org.openapitools.model.GenerateUnitedOrdersRequest;
import org.openapitools.model.GetReportInfoResponse;
import org.openapitools.model.PageFormatType;
import org.openapitools.model.ReportFormatType;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class ReportsApiService {
    public abstract Response generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest
 ,PageFormatType format
 ) throws NotFoundException;
    public abstract Response generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest
 ) throws NotFoundException;
    public abstract Response generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest
 ,ReportFormatType format
 ) throws NotFoundException;
    public abstract Response getReportInfo(String reportId
 ) throws NotFoundException;
}
