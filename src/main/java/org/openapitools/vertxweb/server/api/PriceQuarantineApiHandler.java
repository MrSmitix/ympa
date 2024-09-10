package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.ConfirmPricesRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetQuarantineOffersRequest;
import org.openapitools.vertxweb.server.model.GetQuarantineOffersResponse;

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

public class PriceQuarantineApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(PriceQuarantineApiHandler.class);

    private final PriceQuarantineApi api;

    public PriceQuarantineApiHandler(PriceQuarantineApi api) {
        this.api = api;
    }

    @Deprecated
    public PriceQuarantineApiHandler() {
        this(new PriceQuarantineApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("confirmBusinessPrices").handler(this::confirmBusinessPrices);
        builder.operation("confirmCampaignPrices").handler(this::confirmCampaignPrices);
        builder.operation("getBusinessQuarantineOffers").handler(this::getBusinessQuarantineOffers);
        builder.operation("getCampaignQuarantineOffers").handler(this::getCampaignQuarantineOffers);
    }

    private void confirmBusinessPrices(RoutingContext routingContext) {
        logger.info("confirmBusinessPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ConfirmPricesRequest confirmPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConfirmPricesRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter confirmPricesRequest is {}", confirmPricesRequest);

        api.confirmBusinessPrices(businessId, confirmPricesRequest)
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

    private void confirmCampaignPrices(RoutingContext routingContext) {
        logger.info("confirmCampaignPrices()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ConfirmPricesRequest confirmPricesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ConfirmPricesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter confirmPricesRequest is {}", confirmPricesRequest);

        api.confirmCampaignPrices(campaignId, confirmPricesRequest)
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

    private void getBusinessQuarantineOffers(RoutingContext routingContext) {
        logger.info("getBusinessQuarantineOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetQuarantineOffersRequest getQuarantineOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetQuarantineOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getQuarantineOffersRequest is {}", getQuarantineOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)
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

    private void getCampaignQuarantineOffers(RoutingContext routingContext) {
        logger.info("getCampaignQuarantineOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetQuarantineOffersRequest getQuarantineOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetQuarantineOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getQuarantineOffersRequest is {}", getQuarantineOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)
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
