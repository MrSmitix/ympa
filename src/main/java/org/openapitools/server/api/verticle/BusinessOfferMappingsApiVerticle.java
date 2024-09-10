package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.AddOffersToArchiveRequest;
import org.openapitools.server.api.model.AddOffersToArchiveResponse;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.api.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.api.model.DeleteOffersRequest;
import org.openapitools.server.api.model.DeleteOffersResponse;
import org.openapitools.server.api.model.GetOfferMappingsRequest;
import org.openapitools.server.api.model.GetOfferMappingsResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateOfferMappingsRequest;
import org.openapitools.server.api.model.UpdateOfferMappingsResponse;

import java.util.List;
import java.util.Map;

public class BusinessOfferMappingsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BusinessOfferMappingsApiVerticle.class);

    static final String ADDOFFERSTOARCHIVE_SERVICE_ID = "addOffersToArchive";
    static final String DELETEOFFERS_SERVICE_ID = "deleteOffers";
    static final String DELETEOFFERSFROMARCHIVE_SERVICE_ID = "deleteOffersFromArchive";
    static final String GETOFFERMAPPINGS_SERVICE_ID = "getOfferMappings";
    static final String GETSUGGESTEDOFFERMAPPINGS_SERVICE_ID = "getSuggestedOfferMappings";
    static final String UPDATEOFFERMAPPINGS_SERVICE_ID = "updateOfferMappings";
    
    final BusinessOfferMappingsApi service;

    public BusinessOfferMappingsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BusinessOfferMappingsApiImpl");
            service = (BusinessOfferMappingsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BusinessOfferMappingsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for addOffersToArchive
        vertx.eventBus().<JsonObject> consumer(ADDOFFERSTOARCHIVE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "addOffersToArchive";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject addOffersToArchiveRequestParam = message.body().getJsonObject("AddOffersToArchiveRequest");
                if (addOffersToArchiveRequestParam == null) {
                    manageError(message, new MainApiException(400, "AddOffersToArchiveRequest is required"), serviceId);
                    return;
                }
                AddOffersToArchiveRequest addOffersToArchiveRequest = Json.mapper.readValue(addOffersToArchiveRequestParam.encode(), AddOffersToArchiveRequest.class);
                service.addOffersToArchive(businessId, addOffersToArchiveRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "addOffersToArchive");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("addOffersToArchive", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteOffers
        vertx.eventBus().<JsonObject> consumer(DELETEOFFERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteOffers";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deleteOffersRequestParam = message.body().getJsonObject("DeleteOffersRequest");
                if (deleteOffersRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteOffersRequest is required"), serviceId);
                    return;
                }
                DeleteOffersRequest deleteOffersRequest = Json.mapper.readValue(deleteOffersRequestParam.encode(), DeleteOffersRequest.class);
                service.deleteOffers(businessId, deleteOffersRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteOffers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteOffers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteOffersFromArchive
        vertx.eventBus().<JsonObject> consumer(DELETEOFFERSFROMARCHIVE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteOffersFromArchive";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject deleteOffersFromArchiveRequestParam = message.body().getJsonObject("DeleteOffersFromArchiveRequest");
                if (deleteOffersFromArchiveRequestParam == null) {
                    manageError(message, new MainApiException(400, "DeleteOffersFromArchiveRequest is required"), serviceId);
                    return;
                }
                DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = Json.mapper.readValue(deleteOffersFromArchiveRequestParam.encode(), DeleteOffersFromArchiveRequest.class);
                service.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteOffersFromArchive");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteOffersFromArchive", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getOfferMappings
        vertx.eventBus().<JsonObject> consumer(GETOFFERMAPPINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOfferMappings";
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
                JsonObject getOfferMappingsRequestParam = message.body().getJsonObject("GetOfferMappingsRequest");
                if (getOfferMappingsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetOfferMappingsRequest is required"), serviceId);
                    return;
                }
                GetOfferMappingsRequest getOfferMappingsRequest = Json.mapper.readValue(getOfferMappingsRequestParam.encode(), GetOfferMappingsRequest.class);
                service.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOfferMappings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOfferMappings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getSuggestedOfferMappings
        vertx.eventBus().<JsonObject> consumer(GETSUGGESTEDOFFERMAPPINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getSuggestedOfferMappings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject getSuggestedOfferMappingsRequestParam = message.body().getJsonObject("GetSuggestedOfferMappingsRequest");
                if (getSuggestedOfferMappingsRequestParam == null) {
                    manageError(message, new MainApiException(400, "GetSuggestedOfferMappingsRequest is required"), serviceId);
                    return;
                }
                GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = Json.mapper.readValue(getSuggestedOfferMappingsRequestParam.encode(), GetSuggestedOfferMappingsRequest.class);
                service.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getSuggestedOfferMappings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getSuggestedOfferMappings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateOfferMappings
        vertx.eventBus().<JsonObject> consumer(UPDATEOFFERMAPPINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateOfferMappings";
                String businessIdParam = message.body().getString("businessId");
                if(businessIdParam == null) {
                    manageError(message, new MainApiException(400, "businessId is required"), serviceId);
                    return;
                }
                Long businessId = Json.mapper.readValue(businessIdParam, Long.class);
                JsonObject updateOfferMappingsRequestParam = message.body().getJsonObject("UpdateOfferMappingsRequest");
                if (updateOfferMappingsRequestParam == null) {
                    manageError(message, new MainApiException(400, "UpdateOfferMappingsRequest is required"), serviceId);
                    return;
                }
                UpdateOfferMappingsRequest updateOfferMappingsRequest = Json.mapper.readValue(updateOfferMappingsRequestParam.encode(), UpdateOfferMappingsRequest.class);
                service.updateOfferMappings(businessId, updateOfferMappingsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateOfferMappings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateOfferMappings", e);
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
