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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ReportsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result generateBoostConsolidatedReportHttp(Http.Request request, GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateBoostConsolidatedReport(request, generateBoostConsolidatedRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateBoostConsolidatedReport(Http.Request request, GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) throws Exception;

    public Result generateCompetitorsPositionReportHttp(Http.Request request, GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateCompetitorsPositionReport(request, generateCompetitorsPositionReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateCompetitorsPositionReport(Http.Request request, GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) throws Exception;

    public Result generateGoodsFeedbackReportHttp(Http.Request request, GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateGoodsFeedbackReport(request, generateGoodsFeedbackRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateGoodsFeedbackReport(Http.Request request, GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) throws Exception;

    public Result generateGoodsMovementReportHttp(Http.Request request, GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateGoodsMovementReport(request, generateGoodsMovementReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateGoodsMovementReport(Http.Request request, GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) throws Exception;

    public Result generateGoodsRealizationReportHttp(Http.Request request, GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateGoodsRealizationReport(request, generateGoodsRealizationReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateGoodsRealizationReport(Http.Request request, GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) throws Exception;

    public Result generateGoodsTurnoverReportHttp(Http.Request request, GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateGoodsTurnoverReport(request, generateGoodsTurnoverRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateGoodsTurnoverReport(Http.Request request, GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) throws Exception;

    public Result generateMassOrderLabelsReportHttp(Http.Request request, GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateMassOrderLabelsReport(request, generateMassOrderLabelsRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateMassOrderLabelsReport(Http.Request request, GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) throws Exception;

    public Result generatePricesReportHttp(Http.Request request, GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generatePricesReport(request, generatePricesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generatePricesReport(Http.Request request, GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) throws Exception;

    public Result generateShelfsStatisticsReportHttp(Http.Request request, GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateShelfsStatisticsReport(request, generateShelfsStatisticsRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateShelfsStatisticsReport(Http.Request request, GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) throws Exception;

    public Result generateShipmentListDocumentReportHttp(Http.Request request, GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateShipmentListDocumentReport(request, generateShipmentListDocumentReportRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateShipmentListDocumentReport(Http.Request request, GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) throws Exception;

    public Result generateShowsSalesReportHttp(Http.Request request, GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateShowsSalesReport(request, generateShowsSalesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateShowsSalesReport(Http.Request request, GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) throws Exception;

    public Result generateStocksOnWarehousesReportHttp(Http.Request request, GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateStocksOnWarehousesReport(request, generateStocksOnWarehousesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateStocksOnWarehousesReport(Http.Request request, GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) throws Exception;

    public Result generateUnitedMarketplaceServicesReportHttp(Http.Request request, GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateUnitedMarketplaceServicesReport(request, generateUnitedMarketplaceServicesReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateUnitedMarketplaceServicesReport(Http.Request request, GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) throws Exception;

    public Result generateUnitedNettingReportHttp(Http.Request request, GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateUnitedNettingReport(request, generateUnitedNettingReportRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateUnitedNettingReport(Http.Request request, GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) throws Exception;

    public Result generateUnitedOrdersReportHttp(Http.Request request, GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GenerateReportResponse obj = generateUnitedOrdersReport(request, generateUnitedOrdersRequest, format);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerateReportResponse generateUnitedOrdersReport(Http.Request request, GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) throws Exception;

    public Result getReportInfoHttp(Http.Request request, String reportId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetReportInfoResponse obj = getReportInfo(request, reportId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetReportInfoResponse getReportInfo(Http.Request request, String reportId) throws Exception;

}
