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
import org.openapitools.server.api.model.ConfirmPricesRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetQuarantineOffersRequest;
import org.openapitools.server.api.model.GetQuarantineOffersResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class PriceQuarantineApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(PriceQuarantineApiVerticle.class);

    static final String CONFIRMBUSINESSPRICES_SERVICE_ID = "confirmBusinessPrices";
    static final String CONFIRMCAMPAIGNPRICES_SERVICE_ID = "confirmCampaignPrices";
    static final String GETBUSINESSQUARANTINEOFFERS_SERVICE_ID = "getBusinessQuarantineOffers";
    static final String GETCAMPAIGNQUARANTINEOFFERS_SERVICE_ID = "getCampaignQuarantineOffers";
    
    final PriceQuarantineApi service;

    public PriceQuarantineApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PriceQuarantineApiImpl");
            service = (PriceQuarantineApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PriceQuarantineApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for confirmBusinessPrices
        vertx.eventBus().<JsonObject> consumer(CONFIRMBUSINESSPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "confirmBusinessPrices";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject confirmPricesRequestParam = message.body().getJsonObject("ConfirmPricesRequest");
                if (confirmPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "ConfirmPricesRequest is required"), serviceId);
                    return;
                }
                ConfirmPricesRequest confirmPricesRequest = Json.mapper.readValue(confirmPricesRequestParam.encode(), ConfirmPricesRequest.class);
                service.confirmBusinessPrices(businessId, confirmPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "confirmBusinessPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("confirmBusinessPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for confirmCampaignPrices
        vertx.eventBus().<JsonObject> consumer(CONFIRMCAMPAIGNPRICES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "confirmCampaignPrices";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject confirmPricesRequestParam = message.body().getJsonObject("ConfirmPricesRequest");
                if (confirmPricesRequestParam == null) {
                    manageError(message, new MainApiException(400, "ConfirmPricesRequest is required"), serviceId);
                    return;
                }
                ConfirmPricesRequest confirmPricesRequest = Json.mapper.readValue(confirmPricesRequestParam.encode(), ConfirmPricesRequest.class);
                service.confirmCampaignPrices(campaignId, confirmPricesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "confirmCampaignPrices");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("confirmCampaignPrices", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getBusinessQuarantineOffers
        vertx.eventBus().<JsonObject> consumer(GETBUSINESSQUARANTINEOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBusinessQuarantineOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getQuarantineOffersRequestParam = message.body().getJsonObject("GetQuarantineOffersRequest");
                if (getQuarantineOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetQuarantineOffersRequest is required"), serviceId);
                    return;
                }
                GetQuarantineOffersRequest getQuarantineOffersRequest = Json.mapper.readValue(getQuarantineOffersRequestParam.encode(), GetQuarantineOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBusinessQuarantineOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBusinessQuarantineOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignQuarantineOffers
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNQUARANTINEOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignQuarantineOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getQuarantineOffersRequestParam = message.body().getJsonObject("GetQuarantineOffersRequest");
                if (getQuarantineOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetQuarantineOffersRequest is required"), serviceId);
                    return;
                }
                GetQuarantineOffersRequest getQuarantineOffersRequest = Json.mapper.readValue(getQuarantineOffersRequestParam.encode(), GetQuarantineOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignQuarantineOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignQuarantineOffers", e);
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
