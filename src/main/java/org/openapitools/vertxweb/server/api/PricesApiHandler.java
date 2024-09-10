package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetPricesByOfferIdsRequest;
import org.openapitools.vertxweb.server.model.GetPricesByOfferIdsResponse;
import org.openapitools.vertxweb.server.model.GetPricesResponse;
import org.openapitools.vertxweb.server.model.SuggestPricesRequest;
import org.openapitools.vertxweb.server.model.SuggestPricesResponse;
import org.openapitools.vertxweb.server.model.UpdateBusinessPricesRequest;
import org.openapitools.vertxweb.server.model.UpdatePricesRequest;

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

public class PricesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(PricesApiHandler.class);

    private final PricesApi api;

    public PricesApiHandler(PricesApi api) {
        this.api = api;
    }

    @Deprecated
    public PricesApiHandler() {
        this(new PricesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getPrices").handler(this::getPrices);
        builder.operation("getPricesByOfferIds").handler(this::getPricesByOfferIds);
        builder.operation("getSuggestedPrices").handler(this::getSuggestedPrices);
        builder.operation("updateBusinessPrices").handler(this::updateBusinessPrices);
        builder.operation("updatePrices").handler(this::updatePrices);
    }

    private void getPrices(RoutingContext routingContext) {
        logger.info("getPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Boolean archived = requestParameters.queryParameter("archived") != null ? requestParameters.queryParameter("archived").getBoolean() : false;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter archived is {}", archived);

        api.getPrices(campaignId, pageToken, limit, archived)
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

    private void getPricesByOfferIds(RoutingContext routingContext) {
        logger.info("getPricesByOfferIds()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetPricesByOfferIdsRequest getPricesByOfferIdsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetPricesByOfferIdsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getPricesByOfferIdsRequest is {}", getPricesByOfferIdsRequest);

        api.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)
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

    private void getSuggestedPrices(RoutingContext routingContext) {
        logger.info("getSuggestedPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SuggestPricesRequest suggestPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SuggestPricesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter suggestPricesRequest is {}", suggestPricesRequest);

        api.getSuggestedPrices(campaignId, suggestPricesRequest)
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

    private void updateBusinessPrices(RoutingContext routingContext) {
        logger.info("updateBusinessPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateBusinessPricesRequest updateBusinessPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateBusinessPricesRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateBusinessPricesRequest is {}", updateBusinessPricesRequest);

        api.updateBusinessPrices(businessId, updateBusinessPricesRequest)
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

    private void updatePrices(RoutingContext routingContext) {
        logger.info("updatePrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdatePricesRequest updatePricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdatePricesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updatePricesRequest is {}", updatePricesRequest);

        api.updatePrices(campaignId, updatePricesRequest)
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
