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
import org.openapitools.server.api.model.GetBusinessBuyerInfoResponse;
import org.openapitools.server.api.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class OrderBusinessInformationApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OrderBusinessInformationApiVerticle.class);

    static final String GETORDERBUSINESSBUYERINFO_SERVICE_ID = "getOrderBusinessBuyerInfo";
    static final String GETORDERBUSINESSDOCUMENTSINFO_SERVICE_ID = "getOrderBusinessDocumentsInfo";
    
    final OrderBusinessInformationApi service;

    public OrderBusinessInformationApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OrderBusinessInformationApiImpl");
            service = (OrderBusinessInformationApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OrderBusinessInformationApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getOrderBusinessBuyerInfo
        vertx.eventBus().<JsonObject> consumer(GETORDERBUSINESSBUYERINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrderBusinessBuyerInfo";
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
                service.getOrderBusinessBuyerInfo(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrderBusinessBuyerInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrderBusinessBuyerInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOrderBusinessDocumentsInfo
        vertx.eventBus().<JsonObject> consumer(GETORDERBUSINESSDOCUMENTSINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrderBusinessDocumentsInfo";
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
                service.getOrderBusinessDocumentsInfo(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrderBusinessDocumentsInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrderBusinessDocumentsInfo", e);
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
