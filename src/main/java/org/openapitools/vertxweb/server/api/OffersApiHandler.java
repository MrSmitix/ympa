package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.CurrencyType;
import org.openapitools.vertxweb.server.model.DeleteCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteCampaignOffersResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetAllOffersResponse;
import org.openapitools.vertxweb.server.model.GetCampaignOffersRequest;
import org.openapitools.vertxweb.server.model.GetCampaignOffersResponse;
import org.openapitools.vertxweb.server.model.GetOfferRecommendationsRequest;
import org.openapitools.vertxweb.server.model.GetOfferRecommendationsResponse;
import org.openapitools.vertxweb.server.model.GetOffersResponse;
import org.openapitools.vertxweb.server.model.UpdateCampaignOffersRequest;

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

public class OffersApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OffersApiHandler.class);

    private final OffersApi api;

    public OffersApiHandler(OffersApi api) {
        this.api = api;
    }

    @Deprecated
    public OffersApiHandler() {
        this(new OffersApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteCampaignOffers").handler(this::deleteCampaignOffers);
        builder.operation("getAllOffers").handler(this::getAllOffers);
        builder.operation("getCampaignOffers").handler(this::getCampaignOffers);
        builder.operation("getOfferRecommendations").handler(this::getOfferRecommendations);
        builder.operation("getOffers").handler(this::getOffers);
        builder.operation("updateCampaignOffers").handler(this::updateCampaignOffers);
    }

    private void deleteCampaignOffers(RoutingContext routingContext) {
        logger.info("deleteCampaignOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteCampaignOffersRequest deleteCampaignOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteCampaignOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter deleteCampaignOffersRequest is {}", deleteCampaignOffersRequest);

        api.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)
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

    private void getAllOffers(RoutingContext routingContext) {
        logger.info("getAllOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.queryParameter("feedId") != null ? requestParameters.queryParameter("feedId").getLong() : null;
        Integer chunk = requestParameters.queryParameter("chunk") != null ? requestParameters.queryParameter("chunk").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter chunk is {}", chunk);

        api.getAllOffers(campaignId, feedId, chunk)
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

    private void getCampaignOffers(RoutingContext routingContext) {
        logger.info("getCampaignOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetCampaignOffersRequest getCampaignOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetCampaignOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getCampaignOffersRequest is {}", getCampaignOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)
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

    private void getOfferRecommendations(RoutingContext routingContext) {
        logger.info("getOfferRecommendations()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetOfferRecommendationsRequest getOfferRecommendationsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOfferRecommendationsRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getOfferRecommendationsRequest is {}", getOfferRecommendationsRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)
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

    private void getOffers(RoutingContext routingContext) {
        logger.info("getOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String query = requestParameters.queryParameter("query") != null ? requestParameters.queryParameter("query").getString() : null;
        Long feedId = requestParameters.queryParameter("feedId") != null ? requestParameters.queryParameter("feedId").getLong() : null;
        String shopCategoryId = requestParameters.queryParameter("shopCategoryId") != null ? requestParameters.queryParameter("shopCategoryId").getString() : null;
        CurrencyType currency = requestParameters.queryParameter("currency") != null ? requestParameters.queryParameter("currency").getCurrencyType() : null;
        Boolean matched = requestParameters.queryParameter("matched") != null ? requestParameters.queryParameter("matched").getBoolean() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter query is {}", query);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter shopCategoryId is {}", shopCategoryId);
        logger.debug("Parameter currency is {}", currency);
        logger.debug("Parameter matched is {}", matched);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);

        api.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)
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

    private void updateCampaignOffers(RoutingContext routingContext) {
        logger.info("updateCampaignOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateCampaignOffersRequest updateCampaignOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateCampaignOffersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updateCampaignOffersRequest is {}", updateCampaignOffersRequest);

        api.updateCampaignOffers(campaignId, updateCampaignOffersRequest)
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
