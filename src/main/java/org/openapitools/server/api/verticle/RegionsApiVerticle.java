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
import org.openapitools.server.api.model.GetRegionWithChildrenResponse;
import org.openapitools.server.api.model.GetRegionsResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class RegionsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(RegionsApiVerticle.class);

    static final String SEARCHREGIONCHILDREN_SERVICE_ID = "searchRegionChildren";
    static final String SEARCHREGIONSBYID_SERVICE_ID = "searchRegionsById";
    static final String SEARCHREGIONSBYNAME_SERVICE_ID = "searchRegionsByName";
    
    final RegionsApi service;

    public RegionsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.RegionsApiImpl");
            service = (RegionsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("RegionsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for searchRegionChildren
        vertx.eventBus().<JsonObject> consumer(SEARCHREGIONCHILDREN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchRegionChildren";
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.searchRegionChildren(regionId, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchRegionChildren");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchRegionChildren", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchRegionsById
        vertx.eventBus().<JsonObject> consumer(SEARCHREGIONSBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchRegionsById";
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                service.searchRegionsById(regionId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchRegionsById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchRegionsById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchRegionsByName
        vertx.eventBus().<JsonObject> consumer(SEARCHREGIONSBYNAME_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchRegionsByName";
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.searchRegionsByName(name, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchRegionsByName");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchRegionsByName", e);
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
