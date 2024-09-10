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
import org.openapitools.server.api.model.GetCampaignLoginsResponse;
import org.openapitools.server.api.model.GetCampaignRegionResponse;
import org.openapitools.server.api.model.GetCampaignResponse;
import org.openapitools.server.api.model.GetCampaignSettingsResponse;
import org.openapitools.server.api.model.GetCampaignsResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CampaignsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CampaignsApiVerticle.class);

    static final String GETCAMPAIGN_SERVICE_ID = "getCampaign";
    static final String GETCAMPAIGNLOGINS_SERVICE_ID = "getCampaignLogins";
    static final String GETCAMPAIGNREGION_SERVICE_ID = "getCampaignRegion";
    static final String GETCAMPAIGNSETTINGS_SERVICE_ID = "getCampaignSettings";
    static final String GETCAMPAIGNS_SERVICE_ID = "getCampaigns";
    static final String GETCAMPAIGNSBYLOGIN_SERVICE_ID = "getCampaignsByLogin";
    
    final CampaignsApi service;

    public CampaignsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CampaignsApiImpl");
            service = (CampaignsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CampaignsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getCampaign
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaign";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaign(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaign");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaign", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignLogins
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNLOGINS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignLogins";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaignLogins(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignLogins");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignLogins", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignRegion
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNREGION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignRegion";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaignRegion(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignRegion");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignRegion", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignSettings
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNSETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignSettings";
                String campaignIdParam = message.body().getString("campaignId");
                if(campaignIdParam == null) {
                    manageError(message, new MainApiException(400, "campaignId is required"), serviceId);
                    return;
                }
                Long campaignId = Json.mapper.readValue(campaignIdParam, Long.class);
                service.getCampaignSettings(campaignId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignSettings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignSettings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaigns
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaigns";
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getCampaigns(page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaigns");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaigns", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCampaignsByLogin
        vertx.eventBus().<JsonObject> consumer(GETCAMPAIGNSBYLOGIN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCampaignsByLogin";
                String loginParam = message.body().getString("login");
                if(loginParam == null) {
                    manageError(message, new MainApiException(400, "login is required"), serviceId);
                    return;
                }
                String login = loginParam;
                String pageParam = message.body().getString("page");
                Integer page = (pageParam == null) ? 1 : Json.mapper.readValue(pageParam, Integer.class);
                String pageSizeParam = message.body().getString("pageSize");
                Integer pageSize = (pageSizeParam == null) ? null : Json.mapper.readValue(pageSizeParam, Integer.class);
                service.getCampaignsByLogin(login, page, pageSize, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCampaignsByLogin");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCampaignsByLogin", e);
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
