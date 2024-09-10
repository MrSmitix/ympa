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
import org.openapitools.server.api.model.DeletePromoOffersRequest;
import org.openapitools.server.api.model.DeletePromoOffersResponse;
import org.openapitools.server.api.model.GetPromoOffersRequest;
import org.openapitools.server.api.model.GetPromoOffersResponse;
import org.openapitools.server.api.model.GetPromosRequest;
import org.openapitools.server.api.model.GetPromosResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdatePromoOffersRequest;
import org.openapitools.server.api.model.UpdatePromoOffersResponse;

import java.util.List;
import java.util.Map;

public class PromosApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(PromosApiVerticle.class);

    static final String DELETEPROMOOFFERS_SERVICE_ID = "deletePromoOffers";
    static final String GETPROMOOFFERS_SERVICE_ID = "getPromoOffers";
    static final String GETPROMOS_SERVICE_ID = "getPromos";
    static final String UPDATEPROMOOFFERS_SERVICE_ID = "updatePromoOffers";
    
    final PromosApi service;

    public PromosApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PromosApiImpl");
            service = (PromosApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PromosApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deletePromoOffers
        vertx.eventBus().<JsonObject> consumer(DELETEPROMOOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deletePromoOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deletePromoOffersRequestParam = message.body().getJsonObject("DeletePromoOffersRequest");
                if (deletePromoOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeletePromoOffersRequest is required"), serviceId);
                    return;
                }
                DeletePromoOffersRequest deletePromoOffersRequest = Json.mapper.readValue(deletePromoOffersRequestParam.encode(), DeletePromoOffersRequest.class);
                service.deletePromoOffers(businessId, deletePromoOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deletePromoOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deletePromoOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPromoOffers
        vertx.eventBus().<JsonObject> consumer(GETPROMOOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPromoOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getPromoOffersRequestParam = message.body().getJsonObject("GetPromoOffersRequest");
                if (getPromoOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetPromoOffersRequest is required"), serviceId);
                    return;
                }
                GetPromoOffersRequest getPromoOffersRequest = Json.mapper.readValue(getPromoOffersRequestParam.encode(), GetPromoOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPromoOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPromoOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPromos
        vertx.eventBus().<JsonObject> consumer(GETPROMOS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPromos";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getPromosRequestParam = message.body().getJsonObject("GetPromosRequest");
                if (getPromosRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetPromosRequest is required"), serviceId);
                    return;
                }
                GetPromosRequest getPromosRequest = Json.mapper.readValue(getPromosRequestParam.encode(), GetPromosRequest.class);
                service.getPromos(businessId, getPromosRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPromos");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPromos", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updatePromoOffers
        vertx.eventBus().<JsonObject> consumer(UPDATEPROMOOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updatePromoOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updatePromoOffersRequestParam = message.body().getJsonObject("UpdatePromoOffersRequest");
                if (updatePromoOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdatePromoOffersRequest is required"), serviceId);
                    return;
                }
                UpdatePromoOffersRequest updatePromoOffersRequest = Json.mapper.readValue(updatePromoOffersRequestParam.encode(), UpdatePromoOffersRequest.class);
                service.updatePromoOffers(businessId, updatePromoOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updatePromoOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updatePromoOffers", e);
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
