package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportsController  {
  /**
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext generateBoostConsolidatedReport(RequestContext request , GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateBoostConsolidatedReport(RequestContext request , GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateBoostConsolidatedReport(RequestContext request , GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateBoostConsolidatedReport(RequestContext request , GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateBoostConsolidatedReport(RequestContext request , GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateCompetitorsPositionReport(RequestContext request , GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateCompetitorsPositionReport(RequestContext request , GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateCompetitorsPositionReport(RequestContext request , GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateCompetitorsPositionReport(RequestContext request , GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateCompetitorsPositionReport(RequestContext request , GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsFeedbackReport(RequestContext request , GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsFeedbackReport(RequestContext request , GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsFeedbackReport(RequestContext request , GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsFeedbackReport(RequestContext request , GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsFeedbackReport(RequestContext request , GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsMovementReport(RequestContext request , GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsMovementReport(RequestContext request , GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsRealizationReport(RequestContext request , GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsRealizationReport(RequestContext request , GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsRealizationReport(RequestContext request , GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsRealizationReport(RequestContext request , GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsTurnoverReport(RequestContext request , GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateGoodsTurnoverReport(RequestContext request , GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateMassOrderLabelsReport(RequestContext request , GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateMassOrderLabelsReport(RequestContext request , GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateMassOrderLabelsReport(RequestContext request , GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateMassOrderLabelsReport(RequestContext request , GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generatePricesReport(RequestContext request , GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generatePricesReport(RequestContext request , GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generatePricesReport(RequestContext request , GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generatePricesReport(RequestContext request , GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generatePricesReport(RequestContext request , GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShelfsStatisticsReport(RequestContext request , GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShelfsStatisticsReport(RequestContext request , GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShelfsStatisticsReport(RequestContext request , GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShelfsStatisticsReport(RequestContext request , GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShelfsStatisticsReport(RequestContext request , GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShipmentListDocumentReport(RequestContext request , GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShipmentListDocumentReport(RequestContext request , GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShowsSalesReport(RequestContext request , GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShowsSalesReport(RequestContext request , GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShowsSalesReport(RequestContext request , GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShowsSalesReport(RequestContext request , GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateShowsSalesReport(RequestContext request , GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateStocksOnWarehousesReport(RequestContext request , GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateStocksOnWarehousesReport(RequestContext request , GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateStocksOnWarehousesReport(RequestContext request , GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateStocksOnWarehousesReport(RequestContext request , GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateStocksOnWarehousesReport(RequestContext request , GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedMarketplaceServicesReport(RequestContext request , GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedMarketplaceServicesReport(RequestContext request , GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedMarketplaceServicesReport(RequestContext request , GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedMarketplaceServicesReport(RequestContext request , GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedMarketplaceServicesReport(RequestContext request , GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedNettingReport(RequestContext request , GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedNettingReport(RequestContext request , GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedNettingReport(RequestContext request , GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedNettingReport(RequestContext request , GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedNettingReport(RequestContext request , GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedOrdersReport(RequestContext request , GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedOrdersReport(RequestContext request , GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedOrdersReport(RequestContext request , GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedOrdersReport(RequestContext request , GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext generateUnitedOrdersReport(RequestContext request , GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReportInfo(RequestContext request , String reportId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReportInfo(RequestContext request , String reportId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReportInfo(RequestContext request , String reportId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReportInfo(RequestContext request , String reportId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getReportInfo(RequestContext request , String reportId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}
