package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeletePromoOffersRequest;
import org.openapitools.vertxweb.server.model.DeletePromoOffersResponse;
import org.openapitools.vertxweb.server.model.GetPromoOffersRequest;
import org.openapitools.vertxweb.server.model.GetPromoOffersResponse;
import org.openapitools.vertxweb.server.model.GetPromosRequest;
import org.openapitools.vertxweb.server.model.GetPromosResponse;
import org.openapitools.vertxweb.server.model.UpdatePromoOffersRequest;
import org.openapitools.vertxweb.server.model.UpdatePromoOffersResponse;

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

public class PromosApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(PromosApiHandler.class);

    private final PromosApi api;

    public PromosApiHandler(PromosApi api) {
        this.api = api;
    }

    @Deprecated
    public PromosApiHandler() {
        this(new PromosApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deletePromoOffers").handler(this::deletePromoOffers);
        builder.operation("getPromoOffers").handler(this::getPromoOffers);
        builder.operation("getPromos").handler(this::getPromos);
        builder.operation("updatePromoOffers").handler(this::updatePromoOffers);
    }

    private void deletePromoOffers(RoutingContext routingContext) {
        logger.info("deletePromoOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeletePromoOffersRequest deletePromoOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeletePromoOffersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deletePromoOffersRequest is {}", deletePromoOffersRequest);

        api.deletePromoOffers(businessId, deletePromoOffersRequest)
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

    private void getPromoOffers(RoutingContext routingContext) {
        logger.info("getPromoOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetPromoOffersRequest getPromoOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetPromoOffersRequest>(){}) : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getPromoOffersRequest is {}", getPromoOffersRequest);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)
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

    private void getPromos(RoutingContext routingContext) {
        logger.info("getPromos()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetPromosRequest getPromosRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetPromosRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getPromosRequest is {}", getPromosRequest);

        api.getPromos(businessId, getPromosRequest)
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

    private void updatePromoOffers(RoutingContext routingContext) {
        logger.info("updatePromoOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdatePromoOffersRequest updatePromoOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdatePromoOffersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updatePromoOffersRequest is {}", updatePromoOffersRequest);

        api.updatePromoOffers(businessId, updatePromoOffersRequest)
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
