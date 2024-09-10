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
import org.openapitools.server.api.model.GetOutletLicensesResponse;
import org.openapitools.server.api.MainApiException;
import java.util.Set;
import org.openapitools.server.api.model.UpdateOutletLicenseRequest;

import java.util.List;
import java.util.Map;

public class OutletLicensesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OutletLicensesApiVerticle.class);

    static final String DELETEOUTLETLICENSES_SERVICE_ID = "deleteOutletLicenses";
    static final String GETOUTLETLICENSES_SERVICE_ID = "getOutletLicenses";
    static final String UPDATEOUTLETLICENSES_SERVICE_ID = "updateOutletLicenses";
    
    final OutletLicensesApi service;

    public OutletLicensesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OutletLicensesApiImpl");
            service = (OutletLicensesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OutletLicensesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteOutletLicenses
        vertx.eventBus().<JsonObject> consumer(DELETEOUTLETLICENSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteOutletLicenses";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray idsParam = message.body().getJsonArray("ids");
                Set<Long> ids = (idsParam == null) ? null : Json.mapper.readValue(idsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                service.deleteOutletLicenses(campaignId, ids, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteOutletLicenses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteOutletLicenses", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOutletLicenses
        vertx.eventBus().<JsonObject> consumer(GETOUTLETLICENSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOutletLicenses";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray outletIdsParam = message.body().getJsonArray("outletIds");
                Set<Long> outletIds = (outletIdsParam == null) ? null : Json.mapper.readValue(outletIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                JsonArray idsParam = message.body().getJsonArray("ids");
                Set<Long> ids = (idsParam == null) ? null : Json.mapper.readValue(idsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Long.class));
                service.getOutletLicenses(campaignId, outletIds, ids, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOutletLicenses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOutletLicenses", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOutletLicenses
        vertx.eventBus().<JsonObject> consumer(UPDATEOUTLETLICENSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOutletLicenses";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateOutletLicenseRequestParam = message.body().getJsonObject("UpdateOutletLicenseRequest");
                if (updateOutletLicenseRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOutletLicenseRequest is required"), serviceId);
                    return;
                }
                UpdateOutletLicenseRequest updateOutletLicenseRequest = Json.mapper.readValue(updateOutletLicenseRequestParam.encode(), UpdateOutletLicenseRequest.class);
                service.updateOutletLicenses(campaignId, updateOutletLicenseRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOutletLicenses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOutletLicenses", e);
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
