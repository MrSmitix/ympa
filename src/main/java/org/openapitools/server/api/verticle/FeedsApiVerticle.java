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
import org.openapitools.server.api.model.FeedIndexLogsStatusType;
import org.openapitools.server.api.model.GetFeedIndexLogsResponse;
import org.openapitools.server.api.model.GetFeedResponse;
import org.openapitools.server.api.model.GetFeedsResponse;
import org.openapitools.server.api.MainApiException;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.SetFeedParamsRequest;

import java.util.List;
import java.util.Map;

public class FeedsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(FeedsApiVerticle.class);

    static final String GETFEED_SERVICE_ID = "getFeed";
    static final String GETFEEDINDEXLOGS_SERVICE_ID = "getFeedIndexLogs";
    static final String GETFEEDS_SERVICE_ID = "getFeeds";
    static final String REFRESHFEED_SERVICE_ID = "refreshFeed";
    static final String SETFEEDPARAMS_SERVICE_ID = "setFeedParams";
    
    final FeedsApi service;

    public FeedsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.FeedsApiImpl");
            service = (FeedsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FeedsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getFeed
        vertx.eventBus().<JsonObject> consumer(GETFEED_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeed";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                service.getFeed(campaignId, feedId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeed");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeed", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFeedIndexLogs
        vertx.eventBus().<JsonObject> consumer(GETFEEDINDEXLOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeedIndexLogs";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String publishedTimeFromParam = message.body().getString("published_time_from");
                OffsetDateTime publishedTimeFrom = (publishedTimeFromParam == null) ? null : Json.mapper.readValue(publishedTimeFromParam, OffsetDateTime.class);
                String publishedTimeToParam = message.body().getString("published_time_to");
                OffsetDateTime publishedTimeTo = (publishedTimeToParam == null) ? null : Json.mapper.readValue(publishedTimeToParam, OffsetDateTime.class);
                JsonObject statusParam = message.body().getJsonObject("status");
                if (statusParam == null) {
                    manageError(message, new MainApiException(400, "status is required"), serviceId);
                    return;
                }
                FeedIndexLogsStatusType status = Json.mapper.readValue(statusParam.encode(), FeedIndexLogsStatusType.class);
                service.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeedIndexLogs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeedIndexLogs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getFeeds
        vertx.eventBus().<JsonObject> consumer(GETFEEDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getFeeds";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getFeeds(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getFeeds");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getFeeds", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for refreshFeed
        vertx.eventBus().<JsonObject> consumer(REFRESHFEED_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "refreshFeed";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                service.refreshFeed(campaignId, feedId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "refreshFeed");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("refreshFeed", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for setFeedParams
        vertx.eventBus().<JsonObject> consumer(SETFEEDPARAMS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "setFeedParams";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                String feedIdParam = message.body().getString("feedId");
                if(feedIdParam == null) {
                    manageError(message, new MainApiException(400, "feedId is required"), serviceId);
                    return;
                }
                Long feedId = Json.mapper.readValue(feedIdParam, Long.class);
                JsonObject setFeedParamsRequestParam = message.body().getJsonObject("SetFeedParamsRequest");
                if (setFeedParamsRequestParam == null) {
                    manageError(message, new MainApiException(400, "SetFeedParamsRequest is required"), serviceId);
                    return;
                }
                SetFeedParamsRequest setFeedParamsRequest = Json.mapper.readValue(setFeedParamsRequestParam.encode(), SetFeedParamsRequest.class);
                service.setFeedParams(campaignId, feedId, setFeedParamsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "setFeedParams");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("setFeedParams", e);
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
