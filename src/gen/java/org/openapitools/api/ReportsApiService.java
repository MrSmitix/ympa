package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public interface ReportsApiService {
      Response generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest,PageFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest,ReportFormatType format,SecurityContext securityContext)
      throws NotFoundException;
      Response getReportInfo(String reportId,SecurityContext securityContext)
      throws NotFoundException;
}
