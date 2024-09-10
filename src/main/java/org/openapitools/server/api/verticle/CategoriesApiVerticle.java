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
import org.openapitools.server.api.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.server.api.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.server.api.model.GetCategoriesRequest;
import org.openapitools.server.api.model.GetCategoriesResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CategoriesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CategoriesApiVerticle.class);

    static final String GETCATEGORIESMAXSALEQUANTUM_SERVICE_ID = "getCategoriesMaxSaleQuantum";
    static final String GETCATEGORIESTREE_SERVICE_ID = "getCategoriesTree";
    
    final CategoriesApi service;

    public CategoriesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CategoriesApiImpl");
            service = (CategoriesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CategoriesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getCategoriesMaxSaleQuantum
        vertx.eventBus().<JsonObject> consumer(GETCATEGORIESMAXSALEQUANTUM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCategoriesMaxSaleQuantum";
                JsonObject getCategoriesMaxSaleQuantumRequestParam = message.body().getJsonObject("GetCategoriesMaxSaleQuantumRequest");
                if (getCategoriesMaxSaleQuantumRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetCategoriesMaxSaleQuantumRequest is required"), serviceId);
                    return;
                }
                GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = Json.mapper.readValue(getCategoriesMaxSaleQuantumRequestParam.encode(), GetCategoriesMaxSaleQuantumRequest.class);
                service.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCategoriesMaxSaleQuantum");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCategoriesMaxSaleQuantum", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCategoriesTree
        vertx.eventBus().<JsonObject> consumer(GETCATEGORIESTREE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCategoriesTree";
                JsonObject getCategoriesRequestParam = message.body().getJsonObject("GetCategoriesRequest");
                if (getCategoriesRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetCategoriesRequest is required"), serviceId);
                    return;
                }
                GetCategoriesRequest getCategoriesRequest = Json.mapper.readValue(getCategoriesRequestParam.encode(), GetCategoriesRequest.class);
                service.getCategoriesTree(getCategoriesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCategoriesTree");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCategoriesTree", e);
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
