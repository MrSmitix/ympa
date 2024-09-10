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
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.GetModelsOffersResponse;
import org.openapitools.server.api.model.GetModelsRequest;
import org.openapitools.server.api.model.GetModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SearchModelsResponse;
import org.openapitools.server.api.model.SortOrderType;

import java.util.List;
import java.util.Map;

public class ModelsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ModelsApiVerticle.class);

    static final String GETMODEL_SERVICE_ID = "getModel";
    static final String GETMODELOFFERS_SERVICE_ID = "getModelOffers";
    static final String GETMODELS_SERVICE_ID = "getModels";
    static final String GETMODELSOFFERS_SERVICE_ID = "getModelsOffers";
    static final String SEARCHMODELS_SERVICE_ID = "searchModels";
    
    final ModelsApi service;

    public ModelsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ModelsApiImpl");
            service = (ModelsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ModelsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getModel
        vertx.eventBus().<JsonObject> consumer(GETMODEL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getModel";
                String modelIdParam = message.body().getString("modelId");
                if(modelIdParam == null) {
                    manageError(message, new MainApiException(400, "modelId is required"), serviceId);
                    return;
                }
                Long modelId = Json.mapper.readValue(modelIdParam, Long.class);
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                service.getModel(modelId, regionId, currency, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getModel");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getModel", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getModelOffers
        vertx.eventBus().<JsonObject> consumer(GETMODELOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getModelOffers";
                String modelIdParam = message.body().getString("modelId");
                if(modelIdParam == null) {
                    manageError(message, new MainApiException(400, "modelId is required"), serviceId);
                    return;
                }
                Long modelId = Json.mapper.readValue(modelIdParam, Long.class);
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                JsonObject orderByPriceParam = message.body().getJsonObject("orderByPrice");
                if (orderByPriceParam == null) {
                    manageError(message, new MainApiException(400, "orderByPrice is required"), serviceId);
                    return;
                }
                SortOrderType orderByPrice = Json.mapper.readValue(orderByPriceParam.encode(), SortOrderType.class);
                String countParam = message.body().getString("count");
                Integer count = (countParam == null) ? 10 : Json.mapper.readValue(countParam, Integer.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                service.getModelOffers(modelId, regionId, currency, orderByPrice, count, page, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getModelOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getModelOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getModels
        vertx.eventBus().<JsonObject> consumer(GETMODELS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getModels";
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                JsonObject getModelsRequestParam = message.body().getJsonObject("GetModelsRequest");
                if (getModelsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetModelsRequest is required"), serviceId);
                    return;
                }
                GetModelsRequest getModelsRequest = Json.mapper.readValue(getModelsRequestParam.encode(), GetModelsRequest.class);
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                service.getModels(regionId, getModelsRequest, currency, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getModels");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getModels", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getModelsOffers
        vertx.eventBus().<JsonObject> consumer(GETMODELSOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getModelsOffers";
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                JsonObject getModelsRequestParam = message.body().getJsonObject("GetModelsRequest");
                if (getModelsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetModelsRequest is required"), serviceId);
                    return;
                }
                GetModelsRequest getModelsRequest = Json.mapper.readValue(getModelsRequestParam.encode(), GetModelsRequest.class);
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                JsonObject orderByPriceParam = message.body().getJsonObject("orderByPrice");
                if (orderByPriceParam == null) {
                    manageError(message, new MainApiException(400, "orderByPrice is required"), serviceId);
                    return;
                }
                SortOrderType orderByPrice = Json.mapper.readValue(orderByPriceParam.encode(), SortOrderType.class);
                service.getModelsOffers(regionId, getModelsRequest, currency, orderByPrice, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getModelsOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getModelsOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for searchModels
        vertx.eventBus().<JsonObject> consumer(SEARCHMODELS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "searchModels";
                String queryParam = message.body().getString("query");
                if(queryParam == null) {
                    manageError(message, new MainApiException(400, "query is required"), serviceId);
                    return;
                }
                String query = queryParam;
                String regionIdParam = message.body().getString("regionId");
                if(regionIdParam == null) {
                    manageError(message, new MainApiException(400, "regionId is required"), serviceId);
                    return;
                }
                Long regionId = Json.mapper.readValue(regionIdParam, Long.class);
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.searchModels(query, regionId, currency, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "searchModels");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("searchModels", e);
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
