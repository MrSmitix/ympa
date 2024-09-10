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
import org.openapitools.server.api.model.GetWarehouseStocksRequest;
import org.openapitools.server.api.model.GetWarehouseStocksResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateStocksRequest;

import java.util.List;
import java.util.Map;

public class StocksApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(StocksApiVerticle.class);

    static final String GETSTOCKS_SERVICE_ID = "getStocks";
    static final String UPDATESTOCKS_SERVICE_ID = "updateStocks";
    
    final StocksApi service;

    public StocksApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.StocksApiImpl");
            service = (StocksApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("StocksApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getStocks
        vertx.eventBus().<JsonObject> consumer(GETSTOCKS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getStocks";
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
                JsonObject getWarehouseStocksRequestParam = message.body().getJsonObject("GetWarehouseStocksRequest");
                if (getWarehouseStocksRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetWarehouseStocksRequest is required"), serviceId);
                    return;
                }
                GetWarehouseStocksRequest getWarehouseStocksRequest = Json.mapper.readValue(getWarehouseStocksRequestParam.encode(), GetWarehouseStocksRequest.class);
                service.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getStocks");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getStocks", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateStocks
        vertx.eventBus().<JsonObject> consumer(UPDATESTOCKS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateStocks";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateStocksRequestParam = message.body().getJsonObject("UpdateStocksRequest");
                if (updateStocksRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateStocksRequest is required"), serviceId);
                    return;
                }
                UpdateStocksRequest updateStocksRequest = Json.mapper.readValue(updateStocksRequestParam.encode(), UpdateStocksRequest.class);
                service.updateStocks(campaignId, updateStocksRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateStocks");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateStocks", e);
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
