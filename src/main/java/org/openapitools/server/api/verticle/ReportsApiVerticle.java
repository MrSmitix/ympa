package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

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

import java.util.List;
import java.util.Map;

public class ReportsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ReportsApiVerticle.class);

    static final String GENERATEBOOSTCONSOLIDATEDREPORT_SERVICE_ID = "generateBoostConsolidatedReport";
    static final String GENERATECOMPETITORSPOSITIONREPORT_SERVICE_ID = "generateCompetitorsPositionReport";
    static final String GENERATEGOODSFEEDBACKREPORT_SERVICE_ID = "generateGoodsFeedbackReport";
    static final String GENERATEGOODSMOVEMENTREPORT_SERVICE_ID = "generateGoodsMovementReport";
    static final String GENERATEGOODSREALIZATIONREPORT_SERVICE_ID = "generateGoodsRealizationReport";
    static final String GENERATEGOODSTURNOVERREPORT_SERVICE_ID = "generateGoodsTurnoverReport";
    static final String GENERATEMASSORDERLABELSREPORT_SERVICE_ID = "generateMassOrderLabelsReport";
    static final String GENERATEPRICESREPORT_SERVICE_ID = "generatePricesReport";
    static final String GENERATESHELFSSTATISTICSREPORT_SERVICE_ID = "generateShelfsStatisticsReport";
    static final String GENERATESHIPMENTLISTDOCUMENTREPORT_SERVICE_ID = "generateShipmentListDocumentReport";
    static final String GENERATESHOWSSALESREPORT_SERVICE_ID = "generateShowsSalesReport";
    static final String GENERATESTOCKSONWAREHOUSESREPORT_SERVICE_ID = "generateStocksOnWarehousesReport";
    static final String GENERATEUNITEDMARKETPLACESERVICESREPORT_SERVICE_ID = "generateUnitedMarketplaceServicesReport";
    static final String GENERATEUNITEDNETTINGREPORT_SERVICE_ID = "generateUnitedNettingReport";
    static final String GENERATEUNITEDORDERSREPORT_SERVICE_ID = "generateUnitedOrdersReport";
    static final String GETREPORTINFO_SERVICE_ID = "getReportInfo";
    
    final ReportsApi service;

    public ReportsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ReportsApiImpl");
            service = (ReportsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ReportsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for generateBoostConsolidatedReport
        vertx.eventBus().<JsonObject> consumer(GENERATEBOOSTCONSOLIDATEDREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateBoostConsolidatedReport";
                JsonObject generateBoostConsolidatedRequestParam = message.body().getJsonObject("GenerateBoostConsolidatedRequest");
                if (generateBoostConsolidatedRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateBoostConsolidatedRequest is required"), serviceId);
                    return;
                }
                GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = Json.mapper.readValue(generateBoostConsolidatedRequestParam.encode(), GenerateBoostConsolidatedRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateBoostConsolidatedReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateBoostConsolidatedReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateCompetitorsPositionReport
        vertx.eventBus().<JsonObject> consumer(GENERATECOMPETITORSPOSITIONREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateCompetitorsPositionReport";
                JsonObject generateCompetitorsPositionReportRequestParam = message.body().getJsonObject("GenerateCompetitorsPositionReportRequest");
                if (generateCompetitorsPositionReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateCompetitorsPositionReportRequest is required"), serviceId);
                    return;
                }
                GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = Json.mapper.readValue(generateCompetitorsPositionReportRequestParam.encode(), GenerateCompetitorsPositionReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateCompetitorsPositionReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateCompetitorsPositionReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsFeedbackReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSFEEDBACKREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsFeedbackReport";
                JsonObject generateGoodsFeedbackRequestParam = message.body().getJsonObject("GenerateGoodsFeedbackRequest");
                if (generateGoodsFeedbackRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsFeedbackRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = Json.mapper.readValue(generateGoodsFeedbackRequestParam.encode(), GenerateGoodsFeedbackRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsFeedbackReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsFeedbackReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsMovementReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSMOVEMENTREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsMovementReport";
                JsonObject generateGoodsMovementReportRequestParam = message.body().getJsonObject("GenerateGoodsMovementReportRequest");
                if (generateGoodsMovementReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsMovementReportRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = Json.mapper.readValue(generateGoodsMovementReportRequestParam.encode(), GenerateGoodsMovementReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsMovementReport(generateGoodsMovementReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsMovementReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsMovementReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsRealizationReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSREALIZATIONREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsRealizationReport";
                JsonObject generateGoodsRealizationReportRequestParam = message.body().getJsonObject("GenerateGoodsRealizationReportRequest");
                if (generateGoodsRealizationReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsRealizationReportRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = Json.mapper.readValue(generateGoodsRealizationReportRequestParam.encode(), GenerateGoodsRealizationReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsRealizationReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsRealizationReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateGoodsTurnoverReport
        vertx.eventBus().<JsonObject> consumer(GENERATEGOODSTURNOVERREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateGoodsTurnoverReport";
                JsonObject generateGoodsTurnoverRequestParam = message.body().getJsonObject("GenerateGoodsTurnoverRequest");
                if (generateGoodsTurnoverRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateGoodsTurnoverRequest is required"), serviceId);
                    return;
                }
                GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = Json.mapper.readValue(generateGoodsTurnoverRequestParam.encode(), GenerateGoodsTurnoverRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateGoodsTurnoverReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateGoodsTurnoverReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateMassOrderLabelsReport
        vertx.eventBus().<JsonObject> consumer(GENERATEMASSORDERLABELSREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateMassOrderLabelsReport";
                JsonObject generateMassOrderLabelsRequestParam = message.body().getJsonObject("GenerateMassOrderLabelsRequest");
                if (generateMassOrderLabelsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateMassOrderLabelsRequest is required"), serviceId);
                    return;
                }
                GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = Json.mapper.readValue(generateMassOrderLabelsRequestParam.encode(), GenerateMassOrderLabelsRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                PageFormatType format = Json.mapper.readValue(formatParam.encode(), PageFormatType.class);
                service.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateMassOrderLabelsReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateMassOrderLabelsReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generatePricesReport
        vertx.eventBus().<JsonObject> consumer(GENERATEPRICESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generatePricesReport";
                JsonObject generatePricesReportRequestParam = message.body().getJsonObject("GeneratePricesReportRequest");
                if (generatePricesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GeneratePricesReportRequest is required"), serviceId);
                    return;
                }
                GeneratePricesReportRequest generatePricesReportRequest = Json.mapper.readValue(generatePricesReportRequestParam.encode(), GeneratePricesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generatePricesReport(generatePricesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generatePricesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generatePricesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateShelfsStatisticsReport
        vertx.eventBus().<JsonObject> consumer(GENERATESHELFSSTATISTICSREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateShelfsStatisticsReport";
                JsonObject generateShelfsStatisticsRequestParam = message.body().getJsonObject("GenerateShelfsStatisticsRequest");
                if (generateShelfsStatisticsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateShelfsStatisticsRequest is required"), serviceId);
                    return;
                }
                GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = Json.mapper.readValue(generateShelfsStatisticsRequestParam.encode(), GenerateShelfsStatisticsRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateShelfsStatisticsReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateShelfsStatisticsReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateShipmentListDocumentReport
        vertx.eventBus().<JsonObject> consumer(GENERATESHIPMENTLISTDOCUMENTREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateShipmentListDocumentReport";
                JsonObject generateShipmentListDocumentReportRequestParam = message.body().getJsonObject("GenerateShipmentListDocumentReportRequest");
                if (generateShipmentListDocumentReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateShipmentListDocumentReportRequest is required"), serviceId);
                    return;
                }
                GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = Json.mapper.readValue(generateShipmentListDocumentReportRequestParam.encode(), GenerateShipmentListDocumentReportRequest.class);
                service.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateShipmentListDocumentReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateShipmentListDocumentReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateShowsSalesReport
        vertx.eventBus().<JsonObject> consumer(GENERATESHOWSSALESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateShowsSalesReport";
                JsonObject generateShowsSalesReportRequestParam = message.body().getJsonObject("GenerateShowsSalesReportRequest");
                if (generateShowsSalesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateShowsSalesReportRequest is required"), serviceId);
                    return;
                }
                GenerateShowsSalesReportRequest generateShowsSalesReportRequest = Json.mapper.readValue(generateShowsSalesReportRequestParam.encode(), GenerateShowsSalesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateShowsSalesReport(generateShowsSalesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateShowsSalesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateShowsSalesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateStocksOnWarehousesReport
        vertx.eventBus().<JsonObject> consumer(GENERATESTOCKSONWAREHOUSESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateStocksOnWarehousesReport";
                JsonObject generateStocksOnWarehousesReportRequestParam = message.body().getJsonObject("GenerateStocksOnWarehousesReportRequest");
                if (generateStocksOnWarehousesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateStocksOnWarehousesReportRequest is required"), serviceId);
                    return;
                }
                GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = Json.mapper.readValue(generateStocksOnWarehousesReportRequestParam.encode(), GenerateStocksOnWarehousesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateStocksOnWarehousesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateStocksOnWarehousesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateUnitedMarketplaceServicesReport
        vertx.eventBus().<JsonObject> consumer(GENERATEUNITEDMARKETPLACESERVICESREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateUnitedMarketplaceServicesReport";
                JsonObject generateUnitedMarketplaceServicesReportRequestParam = message.body().getJsonObject("GenerateUnitedMarketplaceServicesReportRequest");
                if (generateUnitedMarketplaceServicesReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateUnitedMarketplaceServicesReportRequest is required"), serviceId);
                    return;
                }
                GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = Json.mapper.readValue(generateUnitedMarketplaceServicesReportRequestParam.encode(), GenerateUnitedMarketplaceServicesReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateUnitedMarketplaceServicesReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateUnitedMarketplaceServicesReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateUnitedNettingReport
        vertx.eventBus().<JsonObject> consumer(GENERATEUNITEDNETTINGREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateUnitedNettingReport";
                JsonObject generateUnitedNettingReportRequestParam = message.body().getJsonObject("GenerateUnitedNettingReportRequest");
                if (generateUnitedNettingReportRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateUnitedNettingReportRequest is required"), serviceId);
                    return;
                }
                GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = Json.mapper.readValue(generateUnitedNettingReportRequestParam.encode(), GenerateUnitedNettingReportRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateUnitedNettingReport(generateUnitedNettingReportRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateUnitedNettingReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateUnitedNettingReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateUnitedOrdersReport
        vertx.eventBus().<JsonObject> consumer(GENERATEUNITEDORDERSREPORT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateUnitedOrdersReport";
                JsonObject generateUnitedOrdersRequestParam = message.body().getJsonObject("GenerateUnitedOrdersRequest");
                if (generateUnitedOrdersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GenerateUnitedOrdersRequest is required"), serviceId);
                    return;
                }
                GenerateUnitedOrdersRequest generateUnitedOrdersRequest = Json.mapper.readValue(generateUnitedOrdersRequestParam.encode(), GenerateUnitedOrdersRequest.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                ReportFormatType format = Json.mapper.readValue(formatParam.encode(), ReportFormatType.class);
                service.generateUnitedOrdersReport(generateUnitedOrdersRequest, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateUnitedOrdersReport");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateUnitedOrdersReport", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReportInfo
        vertx.eventBus().<JsonObject> consumer(GETREPORTINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReportInfo";
                String reportIdParam = message.body().getString("reportId");
                if(reportIdParam == null) {
                    manageError(message, new MainApiException(400, "reportId is required"), serviceId);
                    return;
                }
                String reportId = reportIdParam;
                service.getReportInfo(reportId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReportInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReportInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
