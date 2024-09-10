package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AddHiddenOffersRequest;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteHiddenOffersRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetHiddenOffersResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class HiddenOffersApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(HiddenOffersApiVerticle.class);

    static final String ADDHIDDENOFFERS_SERVICE_ID = "addHiddenOffers";
    static final String DELETEHIDDENOFFERS_SERVICE_ID = "deleteHiddenOffers";
    static final String GETHIDDENOFFERS_SERVICE_ID = "getHiddenOffers";
    
    final HiddenOffersApi service;

    public HiddenOffersApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.HiddenOffersApiImpl");
            service = (HiddenOffersApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("HiddenOffersApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for addHiddenOffers
        vertx.eventBus().<JsonObject> consumer(ADDHIDDENOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "addHiddenOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject addHiddenOffersRequestParam = message.body().getJsonObject("AddHiddenOffersRequest");
                if (addHiddenOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "AddHiddenOffersRequest is required"), serviceId);
                    return;
                }
                AddHiddenOffersRequest addHiddenOffersRequest = Json.mapper.readValue(addHiddenOffersRequestParam.encode(), AddHiddenOffersRequest.class);
                service.addHiddenOffers(campaignId, addHiddenOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "addHiddenOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("addHiddenOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteHiddenOffers
        vertx.eventBus().<JsonObject> consumer(DELETEHIDDENOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteHiddenOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonObject deleteHiddenOffersRequestParam = message.body().getJsonObject("DeleteHiddenOffersRequest");
                if (deleteHiddenOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteHiddenOffersRequest is required"), serviceId);
                    return;
                }
                DeleteHiddenOffersRequest deleteHiddenOffersRequest = Json.mapper.readValue(deleteHiddenOffersRequestParam.encode(), DeleteHiddenOffersRequest.class);
                service.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteHiddenOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteHiddenOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getHiddenOffers
        vertx.eventBus().<JsonObject> consumer(GETHIDDENOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getHiddenOffers";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                JsonArray offerIdParam = message.body().getJsonArray("offer_id");
                List<String> offerId = (offerIdParam == null) ? null : Json.mapper.readValue(offerIdParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String pageTokenParam = message.body().getString("page_token");
                String pageToken = (pageTokenParam == null) ? null : pageTokenParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String offsetParam = message.body().getString("offset");
                Integer offset = (offsetParam == null) ? null : Json.mapper.readValue(offsetParam, Integer.class);
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getHiddenOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getHiddenOffers", e);
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
