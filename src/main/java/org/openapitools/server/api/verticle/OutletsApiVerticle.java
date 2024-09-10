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
import org.openapitools.server.api.model.ChangeOutletRequest;
import org.openapitools.server.api.model.CreateOutletResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOutletResponse;
import org.openapitools.server.api.model.GetOutletsResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class OutletsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OutletsApiVerticle.class);

    static final String CREATEOUTLET_SERVICE_ID = "createOutlet";
    static final String DELETEOUTLET_SERVICE_ID = "deleteOutlet";
    static final String GETOUTLET_SERVICE_ID = "getOutlet";
    static final String GETOUTLETS_SERVICE_ID = "getOutlets";
    static final String UPDATEOUTLET_SERVICE_ID = "updateOutlet";
    
    final OutletsApi service;

    public OutletsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OutletsApiImpl");
            service = (OutletsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OutletsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createOutlet
        vertx.eventBus().<JsonObject> consumer(CREATEOUTLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createOutlet";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject changeOutletRequestParam = message.body().getJsonObject("ChangeOutletRequest");
                if (changeOutletRequestParam == null) {
                    manageError(message, new MainApiException(400, "ChangeOutletRequest is required"), serviceId);
                    return;
                }
                ChangeOutletRequest changeOutletRequest = Json.mapper.readValue(changeOutletRequestParam.encode(), ChangeOutletRequest.class);
                service.createOutlet(campaignId, changeOutletRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createOutlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createOutlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteOutlet
        vertx.eventBus().<JsonObject> consumer(DELETEOUTLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteOutlet";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String outletIdParam = message.body().getString("outletId");
                if(outletIdParam == null) {
                    manageError(message, new MainApiException(400, "outletId is required"), serviceId);
                    return;
                }
                Long outletId = Json.mapper.readValue(outletIdParam, Long.class);
                service.deleteOutlet(campaignId, outletId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteOutlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteOutlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOutlet
        vertx.eventBus().<JsonObject> consumer(GETOUTLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOutlet";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String outletIdParam = message.body().getString("outletId");
                if(outletIdParam == null) {
                    manageError(message, new MainApiException(400, "outletId is required"), serviceId);
                    return;
                }
                Long outletId = Json.mapper.readValue(outletIdParam, Long.class);
                service.getOutlet(campaignId, outletId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOutlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOutlet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOutlets
        vertx.eventBus().<JsonObject> consumer(GETOUTLETS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOutlets";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String regionIdParam = message.body().getString("region_id");
                Long regionId = (regionIdParam == null) ? null : Json.mapper.readValue(regionIdParam, Long.class);
                String shopOutletCodeParam = message.body().getString("shop_outlet_code");
                String shopOutletCode = (shopOutletCodeParam == null) ? null : shopOutletCodeParam;
                String regionId2Param = message.body().getString("regionId");
                Long regionId2 = (regionId2Param == null) ? null : Json.mapper.readValue(regionId2Param, Long.class);
                service.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOutlets");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOutlets", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOutlet
        vertx.eventBus().<JsonObject> consumer(UPDATEOUTLET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOutlet";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String outletIdParam = message.body().getString("outletId");
                if(outletIdParam == null) {
                    manageError(message, new MainApiException(400, "outletId is required"), serviceId);
                    return;
                }
                Long outletId = Json.mapper.readValue(outletIdParam, Long.class);
                JsonObject changeOutletRequestParam = message.body().getJsonObject("ChangeOutletRequest");
                if (changeOutletRequestParam == null) {
                    manageError(message, new MainApiException(400, "ChangeOutletRequest is required"), serviceId);
                    return;
                }
                ChangeOutletRequest changeOutletRequest = Json.mapper.readValue(changeOutletRequestParam.encode(), ChangeOutletRequest.class);
                service.updateOutlet(campaignId, outletId, changeOutletRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOutlet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOutlet", e);
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
