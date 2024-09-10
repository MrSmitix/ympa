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
import java.io.File;
import org.openapitools.server.api.model.GetOrderLabelsDataResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageFormatType;

import java.util.List;
import java.util.Map;

public class OrderLabelsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OrderLabelsApiVerticle.class);

    static final String GENERATEORDERLABEL_SERVICE_ID = "generateOrderLabel";
    static final String GENERATEORDERLABELS_SERVICE_ID = "generateOrderLabels";
    static final String GETORDERLABELSDATA_SERVICE_ID = "getOrderLabelsData";
    
    final OrderLabelsApi service;

    public OrderLabelsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OrderLabelsApiImpl");
            service = (OrderLabelsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OrderLabelsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for generateOrderLabel
        vertx.eventBus().<JsonObject> consumer(GENERATEORDERLABEL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateOrderLabel";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                String shipmentIdParam = message.body().getString("shipmentId");
                if(shipmentIdParam == null) {
                    manageError(message, new MainApiException(400, "shipmentId is required"), serviceId);
                    return;
                }
                Long shipmentId = Json.mapper.readValue(shipmentIdParam, Long.class);
                String boxIdParam = message.body().getString("boxId");
                if(boxIdParam == null) {
                    manageError(message, new MainApiException(400, "boxId is required"), serviceId);
                    return;
                }
                Long boxId = Json.mapper.readValue(boxIdParam, Long.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                PageFormatType format = Json.mapper.readValue(formatParam.encode(), PageFormatType.class);
                service.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateOrderLabel");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateOrderLabel", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for generateOrderLabels
        vertx.eventBus().<JsonObject> consumer(GENERATEORDERLABELS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "generateOrderLabels";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                PageFormatType format = Json.mapper.readValue(formatParam.encode(), PageFormatType.class);
                service.generateOrderLabels(campaignId, orderId, format, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "generateOrderLabels");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("generateOrderLabels", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrderLabelsData
        vertx.eventBus().<JsonObject> consumer(GETORDERLABELSDATA_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrderLabelsData";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String orderIdParam = message.body().getString("orderId");
                if(orderIdParam == null) {
                    manageError(message, new MainApiException(400, "orderId is required"), serviceId);
                    return;
                }
                Long orderId = Json.mapper.readValue(orderIdParam, Long.class);
                service.getOrderLabelsData(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrderLabelsData");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrderLabelsData", e);
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
