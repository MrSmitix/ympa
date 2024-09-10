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
import org.openapitools.server.api.model.GetBidsInfoRequest;
import org.openapitools.server.api.model.GetBidsInfoResponse;
import org.openapitools.server.api.model.GetBidsRecommendationsRequest;
import org.openapitools.server.api.model.GetBidsRecommendationsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PutSkuBidsRequest;

import java.util.List;
import java.util.Map;

public class BidsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BidsApiVerticle.class);

    static final String GETBIDSINFOFORBUSINESS_SERVICE_ID = "getBidsInfoForBusiness";
    static final String GETBIDSRECOMMENDATIONS_SERVICE_ID = "getBidsRecommendations";
    static final String PUTBIDSFORBUSINESS_SERVICE_ID = "putBidsForBusiness";
    static final String PUTBIDSFORCAMPAIGN_SERVICE_ID = "putBidsForCampaign";
    
    final BidsApi service;

    public BidsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BidsApiImpl");
            service = (BidsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BidsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getBidsInfoForBusiness
        vertx.eventBus().<JsonObject> consumer(GETBIDSINFOFORBUSINESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBidsInfoForBusiness";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                JsonObject getBidsInfoRequestParam = message.body().getJsonObject("GetBidsInfoRequest");
                if (getBidsInfoRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetBidsInfoRequest is required"), serviceId);
                    return;
                }
                GetBidsInfoRequest getBidsInfoRequest = Json.mapper.readValue(getBidsInfoRequestParam.encode(), GetBidsInfoRequest.class);
                service.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBidsInfoForBusiness");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBidsInfoForBusiness", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getBidsRecommendations
        vertx.eventBus().<JsonObject> consumer(GETBIDSRECOMMENDATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBidsRecommendations";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getBidsRecommendationsRequestParam = message.body().getJsonObject("GetBidsRecommendationsRequest");
                if (getBidsRecommendationsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetBidsRecommendationsRequest is required"), serviceId);
                    return;
                }
                GetBidsRecommendationsRequest getBidsRecommendationsRequest = Json.mapper.readValue(getBidsRecommendationsRequestParam.encode(), GetBidsRecommendationsRequest.class);
                service.getBidsRecommendations(businessId, getBidsRecommendationsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBidsRecommendations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBidsRecommendations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for putBidsForBusiness
        vertx.eventBus().<JsonObject> consumer(PUTBIDSFORBUSINESS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "putBidsForBusiness";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject putSkuBidsRequestParam = message.body().getJsonObject("PutSkuBidsRequest");
                if (putSkuBidsRequestParam == null) {
                    manageError(message, new MainApiException(400, "PutSkuBidsRequest is required"), serviceId);
                    return;
                }
                PutSkuBidsRequest putSkuBidsRequest = Json.mapper.readValue(putSkuBidsRequestParam.encode(), PutSkuBidsRequest.class);
                service.putBidsForBusiness(businessId, putSkuBidsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "putBidsForBusiness");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("putBidsForBusiness", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for putBidsForCampaign
        vertx.eventBus().<JsonObject> consumer(PUTBIDSFORCAMPAIGN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "putBidsForCampaign";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject putSkuBidsRequestParam = message.body().getJsonObject("PutSkuBidsRequest");
                if (putSkuBidsRequestParam == null) {
                    manageError(message, new MainApiException(400, "PutSkuBidsRequest is required"), serviceId);
                    return;
                }
                PutSkuBidsRequest putSkuBidsRequest = Json.mapper.readValue(putSkuBidsRequestParam.encode(), PutSkuBidsRequest.class);
                service.putBidsForCampaign(campaignId, putSkuBidsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "putBidsForCampaign");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("putBidsForCampaign", e);
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
