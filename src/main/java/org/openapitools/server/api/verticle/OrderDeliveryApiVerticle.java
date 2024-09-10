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
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOrderBuyerInfoResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SetOrderDeliveryDateRequest;
import org.openapitools.server.api.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.server.api.model.UpdateOrderStorageLimitRequest;
import org.openapitools.server.api.model.VerifyOrderEacRequest;
import org.openapitools.server.api.model.VerifyOrderEacResponse;

import java.util.List;
import java.util.Map;

public class OrderDeliveryApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OrderDeliveryApiVerticle.class);

    static final String GETORDERBUYERINFO_SERVICE_ID = "getOrderBuyerInfo";
    static final String SETORDERDELIVERYDATE_SERVICE_ID = "setOrderDeliveryDate";
    static final String SETORDERDELIVERYTRACKCODE_SERVICE_ID = "setOrderDeliveryTrackCode";
    static final String UPDATEORDERSTORAGELIMIT_SERVICE_ID = "updateOrderStorageLimit";
    static final String VERIFYORDEREAC_SERVICE_ID = "verifyOrderEac";
    
    final OrderDeliveryApi service;

    public OrderDeliveryApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OrderDeliveryApiImpl");
            service = (OrderDeliveryApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OrderDeliveryApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getOrderBuyerInfo
        vertx.eventBus().<JsonObject> consumer(GETORDERBUYERINFO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrderBuyerInfo";
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
                service.getOrderBuyerInfo(campaignId, orderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrderBuyerInfo");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrderBuyerInfo", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setOrderDeliveryDate
        vertx.eventBus().<JsonObject> consumer(SETORDERDELIVERYDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setOrderDeliveryDate";
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
                JsonObject setOrderDeliveryDateRequestParam = message.body().getJsonObject("SetOrderDeliveryDateRequest");
                if (setOrderDeliveryDateRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetOrderDeliveryDateRequest is required"), serviceId);
                    return;
                }
                SetOrderDeliveryDateRequest setOrderDeliveryDateRequest = Json.mapper.readValue(setOrderDeliveryDateRequestParam.encode(), SetOrderDeliveryDateRequest.class);
                service.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setOrderDeliveryDate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setOrderDeliveryDate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setOrderDeliveryTrackCode
        vertx.eventBus().<JsonObject> consumer(SETORDERDELIVERYTRACKCODE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setOrderDeliveryTrackCode";
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
                JsonObject setOrderDeliveryTrackCodeRequestParam = message.body().getJsonObject("SetOrderDeliveryTrackCodeRequest");
                if (setOrderDeliveryTrackCodeRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetOrderDeliveryTrackCodeRequest is required"), serviceId);
                    return;
                }
                SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest = Json.mapper.readValue(setOrderDeliveryTrackCodeRequestParam.encode(), SetOrderDeliveryTrackCodeRequest.class);
                service.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setOrderDeliveryTrackCode");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setOrderDeliveryTrackCode", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOrderStorageLimit
        vertx.eventBus().<JsonObject> consumer(UPDATEORDERSTORAGELIMIT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOrderStorageLimit";
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
                JsonObject updateOrderStorageLimitRequestParam = message.body().getJsonObject("UpdateOrderStorageLimitRequest");
                if (updateOrderStorageLimitRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOrderStorageLimitRequest is required"), serviceId);
                    return;
                }
                UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest = Json.mapper.readValue(updateOrderStorageLimitRequestParam.encode(), UpdateOrderStorageLimitRequest.class);
                service.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOrderStorageLimit");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOrderStorageLimit", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for verifyOrderEac
        vertx.eventBus().<JsonObject> consumer(VERIFYORDEREAC_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "verifyOrderEac";
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
                JsonObject verifyOrderEacRequestParam = message.body().getJsonObject("VerifyOrderEacRequest");
                if (verifyOrderEacRequestParam == null) {
                    manageError(message, new MainApiException(400, "VerifyOrderEacRequest is required"), serviceId);
                    return;
                }
                VerifyOrderEacRequest verifyOrderEacRequest = Json.mapper.readValue(verifyOrderEacRequestParam.encode(), VerifyOrderEacRequest.class);
                service.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "verifyOrderEac");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("verifyOrderEac", e);
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
