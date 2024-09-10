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
import org.openapitools.server.api.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OfferAvailabilityStatusType;
import org.openapitools.server.api.model.OfferMappingKindType;
import org.openapitools.server.api.model.OfferProcessingStatusType;
import org.openapitools.server.api.model.UpdateOfferMappingEntryRequest;

import java.util.List;
import java.util.Map;

public class OfferMappingsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OfferMappingsApiVerticle.class);

    static final String GETOFFERMAPPINGENTRIES_SERVICE_ID = "getOfferMappingEntries";
    static final String GETSUGGESTEDOFFERMAPPINGENTRIES_SERVICE_ID = "getSuggestedOfferMappingEntries";
    static final String UPDATEOFFERMAPPINGENTRIES_SERVICE_ID = "updateOfferMappingEntries";
    
    final OfferMappingsApi service;

    public OfferMappingsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OfferMappingsApiImpl");
            service = (OfferMappingsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OfferMappingsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getOfferMappingEntries
        vertx.eventBus().<JsonObject> consumer(GETOFFERMAPPINGENTRIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferMappingEntries";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray offerIdParam = message.body().getJsonArray("offer_id");
                List<String> offerId = (offerIdParam == null) ? null : Json.mapper.readValue(offerIdParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray shopSkuParam = message.body().getJsonArray("shop_sku");
                List<String> shopSku = (shopSkuParam == null) ? null : Json.mapper.readValue(shopSkuParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonObject mappingKindParam = message.body().getJsonObject("mapping_kind");
                if (mappingKindParam == null) {
                    manageError(message, new MainApiException(400, "mapping_kind is required"), serviceId);
                    return;
                }
                OfferMappingKindType mappingKind = Json.mapper.readValue(mappingKindParam.encode(), OfferMappingKindType.class);
                JsonArray statusParam = message.body().getJsonArray("status");
                List<OfferProcessingStatusType> status = (statusParam == null) ? null : Json.mapper.readValue(statusParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OfferProcessingStatusType.class));
                JsonArray availabilityParam = message.body().getJsonArray("availability");
                List<OfferAvailabilityStatusType> availability = (availabilityParam == null) ? null : Json.mapper.readValue(availabilityParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OfferAvailabilityStatusType.class));
                JsonArray categoryIdParam = message.body().getJsonArray("category_id");
                List<Integer> categoryId = (categoryIdParam == null) ? null : Json.mapper.readValue(categoryIdParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                JsonArray vendorParam = message.body().getJsonArray("vendor");
                List<String> vendor = (vendorParam == null) ? null : Json.mapper.readValue(vendorParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferMappingEntries");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferMappingEntries", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getSuggestedOfferMappingEntries
        vertx.eventBus().<JsonObject> consumer(GETSUGGESTEDOFFERMAPPINGENTRIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getSuggestedOfferMappingEntries";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject getSuggestedOfferMappingEntriesRequestParam = message.body().getJsonObject("GetSuggestedOfferMappingEntriesRequest");
                if (getSuggestedOfferMappingEntriesRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetSuggestedOfferMappingEntriesRequest is required"), serviceId);
                    return;
                }
                GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = Json.mapper.readValue(getSuggestedOfferMappingEntriesRequestParam.encode(), GetSuggestedOfferMappingEntriesRequest.class);
                service.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getSuggestedOfferMappingEntries");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getSuggestedOfferMappingEntries", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOfferMappingEntries
        vertx.eventBus().<JsonObject> consumer(UPDATEOFFERMAPPINGENTRIES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOfferMappingEntries";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject updateOfferMappingEntryRequestParam = message.body().getJsonObject("UpdateOfferMappingEntryRequest");
                if (updateOfferMappingEntryRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOfferMappingEntryRequest is required"), serviceId);
                    return;
                }
                UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = Json.mapper.readValue(updateOfferMappingEntryRequestParam.encode(), UpdateOfferMappingEntryRequest.class);
                service.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOfferMappingEntries");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOfferMappingEntries", e);
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
