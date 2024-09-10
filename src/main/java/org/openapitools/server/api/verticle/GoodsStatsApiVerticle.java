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
import org.openapitools.server.api.model.GetGoodsStatsRequest;
import org.openapitools.server.api.model.GetGoodsStatsResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class GoodsStatsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(GoodsStatsApiVerticle.class);

    static final String GETGOODSSTATS_SERVICE_ID = "getGoodsStats";
    
    final GoodsStatsApi service;

    public GoodsStatsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.GoodsStatsApiImpl");
            service = (GoodsStatsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("GoodsStatsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getGoodsStats
        vertx.eventBus().<JsonObject> consumer(GETGOODSSTATS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getGoodsStats";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getGoodsStatsRequestParam = message.body().getJsonObject("GetGoodsStatsRequest");
                if (getGoodsStatsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetGoodsStatsRequest is required"), serviceId);
                    return;
                }
                GetGoodsStatsRequest getGoodsStatsRequest = Json.mapper.readValue(getGoodsStatsRequestParam.encode(), GetGoodsStatsRequest.class);
                service.getGoodsStats(campaignId, getGoodsStatsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getGoodsStats");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getGoodsStats", e);
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
