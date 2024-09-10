package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetCampaignLoginsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignRegionResponse;
import org.openapitools.vertxweb.server.model.GetCampaignResponse;
import org.openapitools.vertxweb.server.model.GetCampaignSettingsResponse;
import org.openapitools.vertxweb.server.model.GetCampaignsResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class CampaignsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CampaignsApiHandler.class);

    private final CampaignsApi api;

    public CampaignsApiHandler(CampaignsApi api) {
        this.api = api;
    }

    @Deprecated
    public CampaignsApiHandler() {
        this(new CampaignsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getCampaign").handler(this::getCampaign);
        builder.operation("getCampaignLogins").handler(this::getCampaignLogins);
        builder.operation("getCampaignRegion").handler(this::getCampaignRegion);
        builder.operation("getCampaignSettings").handler(this::getCampaignSettings);
        builder.operation("getCampaigns").handler(this::getCampaigns);
        builder.operation("getCampaignsByLogin").handler(this::getCampaignsByLogin);
    }

    private void getCampaign(RoutingContext routingContext) {
        logger.info("getCampaign()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaign(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignLogins(RoutingContext routingContext) {
        logger.info("getCampaignLogins()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaignLogins(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignRegion(RoutingContext routingContext) {
        logger.info("getCampaignRegion()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaignRegion(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignSettings(RoutingContext routingContext) {
        logger.info("getCampaignSettings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getCampaignSettings(campaignId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaigns(RoutingContext routingContext) {
        logger.info("getCampaigns()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getCampaigns(page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getCampaignsByLogin(RoutingContext routingContext) {
        logger.info("getCampaignsByLogin()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String login = requestParameters.pathParameter("login") != null ? requestParameters.pathParameter("login").getString() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter login is {}", login);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getCampaignsByLogin(login, page, pageSize)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
