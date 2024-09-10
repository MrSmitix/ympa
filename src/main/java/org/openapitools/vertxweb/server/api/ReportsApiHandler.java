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

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class ReportsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ReportsApiHandler.class);

    private final ReportsApi api;

    public ReportsApiHandler(ReportsApi api) {
        this.api = api;
    }

    @Deprecated
    public ReportsApiHandler() {
        this(new ReportsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("generateBoostConsolidatedReport").handler(this::generateBoostConsolidatedReport);
        builder.operation("generateCompetitorsPositionReport").handler(this::generateCompetitorsPositionReport);
        builder.operation("generateGoodsFeedbackReport").handler(this::generateGoodsFeedbackReport);
        builder.operation("generateGoodsMovementReport").handler(this::generateGoodsMovementReport);
        builder.operation("generateGoodsRealizationReport").handler(this::generateGoodsRealizationReport);
        builder.operation("generateGoodsTurnoverReport").handler(this::generateGoodsTurnoverReport);
        builder.operation("generateMassOrderLabelsReport").handler(this::generateMassOrderLabelsReport);
        builder.operation("generatePricesReport").handler(this::generatePricesReport);
        builder.operation("generateShelfsStatisticsReport").handler(this::generateShelfsStatisticsReport);
        builder.operation("generateShipmentListDocumentReport").handler(this::generateShipmentListDocumentReport);
        builder.operation("generateShowsSalesReport").handler(this::generateShowsSalesReport);
        builder.operation("generateStocksOnWarehousesReport").handler(this::generateStocksOnWarehousesReport);
        builder.operation("generateUnitedMarketplaceServicesReport").handler(this::generateUnitedMarketplaceServicesReport);
        builder.operation("generateUnitedNettingReport").handler(this::generateUnitedNettingReport);
        builder.operation("generateUnitedOrdersReport").handler(this::generateUnitedOrdersReport);
        builder.operation("getReportInfo").handler(this::getReportInfo);
    }

    private void generateBoostConsolidatedReport(RoutingContext routingContext) {
        logger.info("generateBoostConsolidatedReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateBoostConsolidatedRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateBoostConsolidatedRequest is {}", generateBoostConsolidatedRequest);
        logger.debug("Parameter format is {}", format);

        api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateCompetitorsPositionReport(RoutingContext routingContext) {
        logger.info("generateCompetitorsPositionReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateCompetitorsPositionReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateCompetitorsPositionReportRequest is {}", generateCompetitorsPositionReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsFeedbackReport(RoutingContext routingContext) {
        logger.info("generateGoodsFeedbackReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsFeedbackRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsFeedbackRequest is {}", generateGoodsFeedbackRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsMovementReport(RoutingContext routingContext) {
        logger.info("generateGoodsMovementReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsMovementReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsMovementReportRequest is {}", generateGoodsMovementReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsMovementReport(generateGoodsMovementReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsRealizationReport(RoutingContext routingContext) {
        logger.info("generateGoodsRealizationReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsRealizationReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsRealizationReportRequest is {}", generateGoodsRealizationReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateGoodsTurnoverReport(RoutingContext routingContext) {
        logger.info("generateGoodsTurnoverReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateGoodsTurnoverRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateGoodsTurnoverRequest is {}", generateGoodsTurnoverRequest);
        logger.debug("Parameter format is {}", format);

        api.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateMassOrderLabelsReport(RoutingContext routingContext) {
        logger.info("generateMassOrderLabelsReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateMassOrderLabelsRequest>(){}) : null;
        PageFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getPageFormatType() : null;

        logger.debug("Parameter generateMassOrderLabelsRequest is {}", generateMassOrderLabelsRequest);
        logger.debug("Parameter format is {}", format);

        api.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generatePricesReport(RoutingContext routingContext) {
        logger.info("generatePricesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GeneratePricesReportRequest generatePricesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GeneratePricesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generatePricesReportRequest is {}", generatePricesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generatePricesReport(generatePricesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateShelfsStatisticsReport(RoutingContext routingContext) {
        logger.info("generateShelfsStatisticsReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateShelfsStatisticsRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateShelfsStatisticsRequest is {}", generateShelfsStatisticsRequest);
        logger.debug("Parameter format is {}", format);

        api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateShipmentListDocumentReport(RoutingContext routingContext) {
        logger.info("generateShipmentListDocumentReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateShipmentListDocumentReportRequest>(){}) : null;

        logger.debug("Parameter generateShipmentListDocumentReportRequest is {}", generateShipmentListDocumentReportRequest);

        api.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateShowsSalesReport(RoutingContext routingContext) {
        logger.info("generateShowsSalesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateShowsSalesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateShowsSalesReportRequest is {}", generateShowsSalesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateShowsSalesReport(generateShowsSalesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateStocksOnWarehousesReport(RoutingContext routingContext) {
        logger.info("generateStocksOnWarehousesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateStocksOnWarehousesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateStocksOnWarehousesReportRequest is {}", generateStocksOnWarehousesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateUnitedMarketplaceServicesReport(RoutingContext routingContext) {
        logger.info("generateUnitedMarketplaceServicesReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateUnitedMarketplaceServicesReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateUnitedMarketplaceServicesReportRequest is {}", generateUnitedMarketplaceServicesReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateUnitedNettingReport(RoutingContext routingContext) {
        logger.info("generateUnitedNettingReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateUnitedNettingReportRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateUnitedNettingReportRequest is {}", generateUnitedNettingReportRequest);
        logger.debug("Parameter format is {}", format);

        api.generateUnitedNettingReport(generateUnitedNettingReportRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void generateUnitedOrdersReport(RoutingContext routingContext) {
        logger.info("generateUnitedOrdersReport()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GenerateUnitedOrdersRequest>(){}) : null;
        ReportFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getReportFormatType() : null;

        logger.debug("Parameter generateUnitedOrdersRequest is {}", generateUnitedOrdersRequest);
        logger.debug("Parameter format is {}", format);

        api.generateUnitedOrdersReport(generateUnitedOrdersRequest, format)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getReportInfo(RoutingContext routingContext) {
        logger.info("getReportInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String reportId = requestParameters.pathParameter("reportId") != null ? requestParameters.pathParameter("reportId").getString() : null;

        logger.debug("Parameter reportId is {}", reportId);

        api.getReportInfo(reportId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
