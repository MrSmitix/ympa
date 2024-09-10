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
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetPricesByOfferIdsRequest;
import org.openapitools.server.api.model.GetPricesByOfferIdsResponse;
import org.openapitools.server.api.model.GetPricesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SuggestPricesRequest;
import org.openapitools.server.api.model.SuggestPricesResponse;
import org.openapitools.server.api.model.UpdateBusinessPricesRequest;
import org.openapitools.server.api.model.UpdatePricesRequest;

import java.util.List;
import java.util.Map;

public class PricesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(PricesApiVerticle.class);

    static final String GETPRICES_SERVICE_ID = "getPrices";
    static final String GETPRICESBYOFFERIDS_SERVICE_ID = "getPricesByOfferIds";
    static final String GETSUGGESTEDPRICES_SERVICE_ID = "getSuggestedPrices";
    static final String UPDATEBUSINESSPRICES_SERVICE_ID = "updateBusinessPrices";
    static final String UPDATEPRICES_SERVICE_ID = "updatePrices";
    
    final PricesApi service;

    public PricesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PricesApiImpl");
            service = (PricesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PricesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getPrices
        vertx.eventBus().<JsonObject> consumer(GETPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPrices";
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
                String archivedParam = message.body().getString("archived");
                Boolean archived = (archivedParam == null) ? false : Json.mapper.readValue(archivedParam, Boolean.class);
                service.getPrices(campaignId, pageToken, limit, archived, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPricesByOfferIds
        vertx.eventBus().<JsonObject> consumer(GETPRICESBYOFFERIDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPricesByOfferIds";
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
                JsonObject getPricesByOfferIdsRequestParam = message.body().getJsonObject("GetPricesByOfferIdsRequest");
                if (getPricesByOfferIdsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetPricesByOfferIdsRequest is required"), serviceId);
                    return;
                }
                GetPricesByOfferIdsRequest getPricesByOfferIdsRequest = Json.mapper.readValue(getPricesByOfferIdsRequestParam.encode(), GetPricesByOfferIdsRequest.class);
                service.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPricesByOfferIds");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPricesByOfferIds", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getSuggestedPrices
        vertx.eventBus().<JsonObject> consumer(GETSUGGESTEDPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getSuggestedPrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject suggestPricesRequestParam = message.body().getJsonObject("SuggestPricesRequest");
                if (suggestPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "SuggestPricesRequest is required"), serviceId);
                    return;
                }
                SuggestPricesRequest suggestPricesRequest = Json.mapper.readValue(suggestPricesRequestParam.encode(), SuggestPricesRequest.class);
                service.getSuggestedPrices(campaignId, suggestPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getSuggestedPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getSuggestedPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateBusinessPrices
        vertx.eventBus().<JsonObject> consumer(UPDATEBUSINESSPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateBusinessPrices";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateBusinessPricesRequestParam = message.body().getJsonObject("UpdateBusinessPricesRequest");
                if (updateBusinessPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateBusinessPricesRequest is required"), serviceId);
                    return;
                }
                UpdateBusinessPricesRequest updateBusinessPricesRequest = Json.mapper.readValue(updateBusinessPricesRequestParam.encode(), UpdateBusinessPricesRequest.class);
                service.updateBusinessPrices(businessId, updateBusinessPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateBusinessPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateBusinessPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updatePrices
        vertx.eventBus().<JsonObject> consumer(UPDATEPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updatePrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updatePricesRequestParam = message.body().getJsonObject("UpdatePricesRequest");
                if (updatePricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdatePricesRequest is required"), serviceId);
                    return;
                }
                UpdatePricesRequest updatePricesRequest = Json.mapper.readValue(updatePricesRequestParam.encode(), UpdatePricesRequest.class);
                service.updatePrices(campaignId, updatePricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updatePrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updatePrices", e);
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
