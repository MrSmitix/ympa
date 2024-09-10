package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public abstract class ReportsApiService {
    public abstract Response generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest,PageFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest,ReportFormatType format,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getReportInfo(String reportId,SecurityContext securityContext) throws NotFoundException;
}
