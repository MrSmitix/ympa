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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportsApiController extends Controller {
    private final ReportsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ReportsApiController(Config configuration, ReportsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result generateBoostConsolidatedReport(Http.Request request) throws Exception {
        JsonNode nodegenerateBoostConsolidatedRequest = request.body().asJson();
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest;
        if (nodegenerateBoostConsolidatedRequest != null) {
            generateBoostConsolidatedRequest = mapper.readValue(nodegenerateBoostConsolidatedRequest.toString(), GenerateBoostConsolidatedRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateBoostConsolidatedRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateBoostConsolidatedRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateBoostConsolidatedReportHttp(request, generateBoostConsolidatedRequest, format);
    }

    @ApiAction
    public Result generateCompetitorsPositionReport(Http.Request request) throws Exception {
        JsonNode nodegenerateCompetitorsPositionReportRequest = request.body().asJson();
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest;
        if (nodegenerateCompetitorsPositionReportRequest != null) {
            generateCompetitorsPositionReportRequest = mapper.readValue(nodegenerateCompetitorsPositionReportRequest.toString(), GenerateCompetitorsPositionReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateCompetitorsPositionReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateCompetitorsPositionReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateCompetitorsPositionReportHttp(request, generateCompetitorsPositionReportRequest, format);
    }

    @ApiAction
    public Result generateGoodsFeedbackReport(Http.Request request) throws Exception {
        JsonNode nodegenerateGoodsFeedbackRequest = request.body().asJson();
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest;
        if (nodegenerateGoodsFeedbackRequest != null) {
            generateGoodsFeedbackRequest = mapper.readValue(nodegenerateGoodsFeedbackRequest.toString(), GenerateGoodsFeedbackRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateGoodsFeedbackRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateGoodsFeedbackRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateGoodsFeedbackReportHttp(request, generateGoodsFeedbackRequest, format);
    }

    @ApiAction
    public Result generateGoodsMovementReport(Http.Request request) throws Exception {
        JsonNode nodegenerateGoodsMovementReportRequest = request.body().asJson();
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest;
        if (nodegenerateGoodsMovementReportRequest != null) {
            generateGoodsMovementReportRequest = mapper.readValue(nodegenerateGoodsMovementReportRequest.toString(), GenerateGoodsMovementReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateGoodsMovementReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateGoodsMovementReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateGoodsMovementReportHttp(request, generateGoodsMovementReportRequest, format);
    }

    @ApiAction
    public Result generateGoodsRealizationReport(Http.Request request) throws Exception {
        JsonNode nodegenerateGoodsRealizationReportRequest = request.body().asJson();
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest;
        if (nodegenerateGoodsRealizationReportRequest != null) {
            generateGoodsRealizationReportRequest = mapper.readValue(nodegenerateGoodsRealizationReportRequest.toString(), GenerateGoodsRealizationReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateGoodsRealizationReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateGoodsRealizationReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateGoodsRealizationReportHttp(request, generateGoodsRealizationReportRequest, format);
    }

    @ApiAction
    public Result generateGoodsTurnoverReport(Http.Request request) throws Exception {
        JsonNode nodegenerateGoodsTurnoverRequest = request.body().asJson();
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest;
        if (nodegenerateGoodsTurnoverRequest != null) {
            generateGoodsTurnoverRequest = mapper.readValue(nodegenerateGoodsTurnoverRequest.toString(), GenerateGoodsTurnoverRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateGoodsTurnoverRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateGoodsTurnoverRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateGoodsTurnoverReportHttp(request, generateGoodsTurnoverRequest, format);
    }

    @ApiAction
    public Result generateMassOrderLabelsReport(Http.Request request) throws Exception {
        JsonNode nodegenerateMassOrderLabelsRequest = request.body().asJson();
        GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest;
        if (nodegenerateMassOrderLabelsRequest != null) {
            generateMassOrderLabelsRequest = mapper.readValue(nodegenerateMassOrderLabelsRequest.toString(), GenerateMassOrderLabelsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateMassOrderLabelsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateMassOrderLabelsRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        PageFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateMassOrderLabelsReportHttp(request, generateMassOrderLabelsRequest, format);
    }

    @ApiAction
    public Result generatePricesReport(Http.Request request) throws Exception {
        JsonNode nodegeneratePricesReportRequest = request.body().asJson();
        GeneratePricesReportRequest generatePricesReportRequest;
        if (nodegeneratePricesReportRequest != null) {
            generatePricesReportRequest = mapper.readValue(nodegeneratePricesReportRequest.toString(), GeneratePricesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generatePricesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GeneratePricesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generatePricesReportHttp(request, generatePricesReportRequest, format);
    }

    @ApiAction
    public Result generateShelfsStatisticsReport(Http.Request request) throws Exception {
        JsonNode nodegenerateShelfsStatisticsRequest = request.body().asJson();
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest;
        if (nodegenerateShelfsStatisticsRequest != null) {
            generateShelfsStatisticsRequest = mapper.readValue(nodegenerateShelfsStatisticsRequest.toString(), GenerateShelfsStatisticsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateShelfsStatisticsRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateShelfsStatisticsRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateShelfsStatisticsReportHttp(request, generateShelfsStatisticsRequest, format);
    }

    @ApiAction
    public Result generateShipmentListDocumentReport(Http.Request request) throws Exception {
        JsonNode nodegenerateShipmentListDocumentReportRequest = request.body().asJson();
        GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest;
        if (nodegenerateShipmentListDocumentReportRequest != null) {
            generateShipmentListDocumentReportRequest = mapper.readValue(nodegenerateShipmentListDocumentReportRequest.toString(), GenerateShipmentListDocumentReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateShipmentListDocumentReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateShipmentListDocumentReportRequest' parameter is required");
        }
        return imp.generateShipmentListDocumentReportHttp(request, generateShipmentListDocumentReportRequest);
    }

    @ApiAction
    public Result generateShowsSalesReport(Http.Request request) throws Exception {
        JsonNode nodegenerateShowsSalesReportRequest = request.body().asJson();
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest;
        if (nodegenerateShowsSalesReportRequest != null) {
            generateShowsSalesReportRequest = mapper.readValue(nodegenerateShowsSalesReportRequest.toString(), GenerateShowsSalesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateShowsSalesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateShowsSalesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateShowsSalesReportHttp(request, generateShowsSalesReportRequest, format);
    }

    @ApiAction
    public Result generateStocksOnWarehousesReport(Http.Request request) throws Exception {
        JsonNode nodegenerateStocksOnWarehousesReportRequest = request.body().asJson();
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest;
        if (nodegenerateStocksOnWarehousesReportRequest != null) {
            generateStocksOnWarehousesReportRequest = mapper.readValue(nodegenerateStocksOnWarehousesReportRequest.toString(), GenerateStocksOnWarehousesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateStocksOnWarehousesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateStocksOnWarehousesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateStocksOnWarehousesReportHttp(request, generateStocksOnWarehousesReportRequest, format);
    }

    @ApiAction
    public Result generateUnitedMarketplaceServicesReport(Http.Request request) throws Exception {
        JsonNode nodegenerateUnitedMarketplaceServicesReportRequest = request.body().asJson();
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest;
        if (nodegenerateUnitedMarketplaceServicesReportRequest != null) {
            generateUnitedMarketplaceServicesReportRequest = mapper.readValue(nodegenerateUnitedMarketplaceServicesReportRequest.toString(), GenerateUnitedMarketplaceServicesReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateUnitedMarketplaceServicesReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateUnitedMarketplaceServicesReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateUnitedMarketplaceServicesReportHttp(request, generateUnitedMarketplaceServicesReportRequest, format);
    }

    @ApiAction
    public Result generateUnitedNettingReport(Http.Request request) throws Exception {
        JsonNode nodegenerateUnitedNettingReportRequest = request.body().asJson();
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest;
        if (nodegenerateUnitedNettingReportRequest != null) {
            generateUnitedNettingReportRequest = mapper.readValue(nodegenerateUnitedNettingReportRequest.toString(), GenerateUnitedNettingReportRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateUnitedNettingReportRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateUnitedNettingReportRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateUnitedNettingReportHttp(request, generateUnitedNettingReportRequest, format);
    }

    @ApiAction
    public Result generateUnitedOrdersReport(Http.Request request) throws Exception {
        JsonNode nodegenerateUnitedOrdersRequest = request.body().asJson();
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest;
        if (nodegenerateUnitedOrdersRequest != null) {
            generateUnitedOrdersRequest = mapper.readValue(nodegenerateUnitedOrdersRequest.toString(), GenerateUnitedOrdersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(generateUnitedOrdersRequest);
            }
        } else {
            throw new IllegalArgumentException("'GenerateUnitedOrdersRequest' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        ReportFormatType format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        return imp.generateUnitedOrdersReportHttp(request, generateUnitedOrdersRequest, format);
    }

    @ApiAction
    public Result getReportInfo(Http.Request request, String reportId) throws Exception {
        return imp.getReportInfoHttp(request, reportId);
    }

}
