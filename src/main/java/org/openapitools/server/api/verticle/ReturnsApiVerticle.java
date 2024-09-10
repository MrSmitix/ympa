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
import java.io.File;
import org.openapitools.server.api.model.GetReturnResponse;
import org.openapitools.server.api.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RefundStatusType;
import org.openapitools.server.api.model.ReturnType;
import org.openapitools.server.api.model.SetReturnDecisionRequest;

import java.util.List;
import java.util.Map;

public class ReturnsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ReturnsApiVerticle.class);

    static final String GETRETURN_SERVICE_ID = "getReturn";
    static final String GETRETURNAPPLICATION_SERVICE_ID = "getReturnApplication";
    static final String GETRETURNPHOTO_SERVICE_ID = "getReturnPhoto";
    static final String GETRETURNS_SERVICE_ID = "getReturns";
    static final String SETRETURNDECISION_SERVICE_ID = "setReturnDecision";
    static final String SUBMITRETURNDECISION_SERVICE_ID = "submitReturnDecision";
    
    final ReturnsApi service;

    public ReturnsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ReturnsApiImpl");
            service = (ReturnsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ReturnsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getReturn
        vertx.eventBus().<JsonObject> consumer(GETRETURN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturn";
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
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                service.getReturn(campaignId, orderId, returnId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturn");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturn", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReturnApplication
        vertx.eventBus().<JsonObject> consumer(GETRETURNAPPLICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturnApplication";
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
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                service.getReturnApplication(campaignId, orderId, returnId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturnApplication");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturnApplication", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReturnPhoto
        vertx.eventBus().<JsonObject> consumer(GETRETURNPHOTO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturnPhoto";
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
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                String itemIdParam = message.body().getString("itemId");
                if(itemIdParam == null) {
                    manageError(message, new MainApiException(400, "itemId is required"), serviceId);
                    return;
                }
                Long itemId = Json.mapper.readValue(itemIdParam, Long.class);
                String imageHashParam = message.body().getString("imageHash");
                if(imageHashParam == null) {
                    manageError(message, new MainApiException(400, "imageHash is required"), serviceId);
                    return;
                }
                String imageHash = imageHashParam;
                service.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturnPhoto");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturnPhoto", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getReturns
        vertx.eventBus().<JsonObject> consumer(GETRETURNS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getReturns";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonArray orderIdsParam = message.body().getJsonArray("orderIds");
                List<Long> orderIds = (orderIdsParam == null) ? null : Json.mapper.readValue(orderIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                JsonArray statusesParam = message.body().getJsonArray("statuses");
                List<RefundStatusType> statuses = (statusesParam == null) ? null : Json.mapper.readValue(statusesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, RefundStatusType.class));
                JsonObject typeParam = message.body().getJsonObject("type");
                if (typeParam == null) {
                    manageError(message, new MainApiException(400, "type is required"), serviceId);
                    return;
                }
                ReturnType type = Json.mapper.readValue(typeParam.encode(), ReturnType.class);
                String fromDateParam = message.body().getString("fromDate");
                LocalDate fromDate = (fromDateParam == null) ? null : Json.mapper.readValue(fromDateParam, LocalDate.class);
                String toDateParam = message.body().getString("toDate");
                LocalDate toDate = (toDateParam == null) ? null : Json.mapper.readValue(toDateParam, LocalDate.class);
                String fromDate2Param = message.body().getString("from_date");
                LocalDate fromDate2 = (fromDate2Param == null) ? null : Json.mapper.readValue(fromDate2Param, LocalDate.class);
                String toDate2Param = message.body().getString("to_date");
                LocalDate toDate2 = (toDate2Param == null) ? null : Json.mapper.readValue(toDate2Param, LocalDate.class);
                service.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getReturns");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getReturns", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setReturnDecision
        vertx.eventBus().<JsonObject> consumer(SETRETURNDECISION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setReturnDecision";
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
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                JsonObject setReturnDecisionRequestParam = message.body().getJsonObject("SetReturnDecisionRequest");
                if (setReturnDecisionRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetReturnDecisionRequest is required"), serviceId);
                    return;
                }
                SetReturnDecisionRequest setReturnDecisionRequest = Json.mapper.readValue(setReturnDecisionRequestParam.encode(), SetReturnDecisionRequest.class);
                service.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setReturnDecision");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setReturnDecision", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for submitReturnDecision
        vertx.eventBus().<JsonObject> consumer(SUBMITRETURNDECISION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "submitReturnDecision";
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
                String returnIdParam = message.body().getString("returnId");
                if(returnIdParam == null) {
                    manageError(message, new MainApiException(400, "returnId is required"), serviceId);
                    return;
                }
                Long returnId = Json.mapper.readValue(returnIdParam, Long.class);
                service.submitReturnDecision(campaignId, orderId, returnId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "submitReturnDecision");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("submitReturnDecision", e);
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
