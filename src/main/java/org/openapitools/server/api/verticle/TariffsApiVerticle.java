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
import org.openapitools.server.api.model.CalculateTariffsRequest;
import org.openapitools.server.api.model.CalculateTariffsResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class TariffsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(TariffsApiVerticle.class);

    static final String CALCULATETARIFFS_SERVICE_ID = "calculateTariffs";
    
    final TariffsApi service;

    public TariffsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.TariffsApiImpl");
            service = (TariffsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("TariffsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for calculateTariffs
        vertx.eventBus().<JsonObject> consumer(CALCULATETARIFFS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "calculateTariffs";
                JsonObject calculateTariffsRequestParam = message.body().getJsonObject("CalculateTariffsRequest");
                if (calculateTariffsRequestParam == null) {
                    manageError(message, new MainApiException(400, "CalculateTariffsRequest is required"), serviceId);
                    return;
                }
                CalculateTariffsRequest calculateTariffsRequest = Json.mapper.readValue(calculateTariffsRequestParam.encode(), CalculateTariffsRequest.class);
                service.calculateTariffs(calculateTariffsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "calculateTariffs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("calculateTariffs", e);
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
