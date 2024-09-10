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
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.DeleteCampaignOffersRequest;
import org.openapitools.server.api.model.DeleteCampaignOffersResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetAllOffersResponse;
import org.openapitools.server.api.model.GetCampaignOffersRequest;
import org.openapitools.server.api.model.GetCampaignOffersResponse;
import org.openapitools.server.api.model.GetOfferRecommendationsRequest;
import org.openapitools.server.api.model.GetOfferRecommendationsResponse;
import org.openapitools.server.api.model.GetOffersResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateCampaignOffersRequest;

import java.util.List;
import java.util.Map;

public class OffersApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OffersApiVerticle.class);

    static final String DELETECAMPAIGNOFFERS_SERVICE_ID = "deleteCampaignOffers";
    static final String GETALLOFFERS_SERVICE_ID = "getAllOffers";
    static final String GETCAMPAIGNOFFERS_SERVICE_ID = "getCampaignOffers";
    static final String GETOFFERRECOMMENDATIONS_SERVICE_ID = "getOfferRecommendations";
    static final String GETOFFERS_SERVICE_ID = "getOffers";
    static final String UPDATECAMPAIGNOFFERS_SERVICE_ID = "updateCampaignOffers";
    
    final OffersApi service;

    public OffersApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OffersApiImpl");
            service = (OffersApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OffersApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteCampaignOffers
        vertx.eventBus().<JsonObject> consumer(DELETECAMPAIGNOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteCampaignOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject deleteCampaignOffersRequestParam = message.body().getJsonObject("DeleteCampaignOffersRequest");
                if (deleteCampaignOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteCampaignOffersRequest is required"), serviceId);
                    return;
                }
                DeleteCampaignOffersRequest deleteCampaignOffersRequest = Json.mapper.readValue(deleteCampaignOffersRequestParam.encode(), DeleteCampaignOffersRequest.class);
                service.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteCampaignOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteCampaignOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAllOffers
        vertx.eventBus().<JsonObject> consumer(GETALLOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAllOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                Long feedId = (feedIdParam == null) ? null : Json.mapper.readValue(feedIdParam, Long.class);
                String chunkParam = message.body().getString("chunk");
                Integer chunk = (chunkParam == null) ? null : Json.mapper.readValue(chunkParam, Integer.class);
                service.getAllOffers(campaignId, feedId, chunk, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAllOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAllOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignOffers
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getCampaignOffersRequestParam = message.body().getJsonObject("GetCampaignOffersRequest");
                if (getCampaignOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetCampaignOffersRequest is required"), serviceId);
                    return;
                }
                GetCampaignOffersRequest getCampaignOffersRequest = Json.mapper.readValue(getCampaignOffersRequestParam.encode(), GetCampaignOffersRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferRecommendations
        vertx.eventBus().<JsonObject> consumer(GETOFFERRECOMMENDATIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferRecommendations";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getOfferRecommendationsRequestParam = message.body().getJsonObject("GetOfferRecommendationsRequest");
                if (getOfferRecommendationsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOfferRecommendationsRequest is required"), serviceId);
                    return;
                }
                GetOfferRecommendationsRequest getOfferRecommendationsRequest = Json.mapper.readValue(getOfferRecommendationsRequestParam.encode(), GetOfferRecommendationsRequest.class);
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferRecommendations");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferRecommendations", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOffers
        vertx.eventBus().<JsonObject> consumer(GETOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String queryParam = message.body().getString("query");
                String query = (queryParam == null) ? null : queryParam;
                String feedIdParam = message.body().getString("feedId");
                Long feedId = (feedIdParam == null) ? null : Json.mapper.readValue(feedIdParam, Long.class);
                String shopCategoryIdParam = message.body().getString("shopCategoryId");
                String shopCategoryId = (shopCategoryIdParam == null) ? null : shopCategoryIdParam;
                JsonObject currencyParam = message.body().getJsonObject("currency");
                if (currencyParam == null) {
                    manageError(message, new MainApiException(400, "currency is required"), serviceId);
                    return;
                }
                CurrencyType currency = Json.mapper.readValue(currencyParam.encode(), CurrencyType.class);
                String matchedParam = message.body().getString("matched");
                Boolean matched = (matchedParam == null) ? null : Json.mapper.readValue(matchedParam, Boolean.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateCampaignOffers
        vertx.eventBus().<JsonObject> consumer(UPDATECAMPAIGNOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateCampaignOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateCampaignOffersRequestParam = message.body().getJsonObject("UpdateCampaignOffersRequest");
                if (updateCampaignOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateCampaignOffersRequest is required"), serviceId);
                    return;
                }
                UpdateCampaignOffersRequest updateCampaignOffersRequest = Json.mapper.readValue(updateCampaignOffersRequestParam.encode(), UpdateCampaignOffersRequest.class);
                service.updateCampaignOffers(campaignId, updateCampaignOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateCampaignOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateCampaignOffers", e);
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
