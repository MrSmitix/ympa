package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AddOffersToArchiveRequest;
import org.openapitools.vertxweb.server.model.AddOffersToArchiveResponse;
import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeleteOffersFromArchiveRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersFromArchiveResponse;
import org.openapitools.vertxweb.server.model.DeleteOffersRequest;
import org.openapitools.vertxweb.server.model.DeleteOffersResponse;
import org.openapitools.vertxweb.server.model.GetOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.GetOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingsRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingsResponse;

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

public class BusinessOfferMappingsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BusinessOfferMappingsApiHandler.class);

    private final BusinessOfferMappingsApi api;

    public BusinessOfferMappingsApiHandler(BusinessOfferMappingsApi api) {
        this.api = api;
    }

    @Deprecated
    public BusinessOfferMappingsApiHandler() {
        this(new BusinessOfferMappingsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("addOffersToArchive").handler(this::addOffersToArchive);
        builder.operation("deleteOffers").handler(this::deleteOffers);
        builder.operation("deleteOffersFromArchive").handler(this::deleteOffersFromArchive);
        builder.operation("getOfferMappings").handler(this::getOfferMappings);
        builder.operation("getSuggestedOfferMappings").handler(this::getSuggestedOfferMappings);
        builder.operation("updateOfferMappings").handler(this::updateOfferMappings);
    }

    private void addOffersToArchive(RoutingContext routingContext) {
        logger.info("addOffersToArchive()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        AddOffersToArchiveRequest addOffersToArchiveRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AddOffersToArchiveRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter addOffersToArchiveRequest is {}", addOffersToArchiveRequest);

        api.addOffersToArchive(businessId, addOffersToArchiveRequest)
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

    private void deleteOffers(RoutingContext routingContext) {
        logger.info("deleteOffers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteOffersRequest deleteOffersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteOffersRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteOffersRequest is {}", deleteOffersRequest);

        api.deleteOffers(businessId, deleteOffersRequest)
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

    private void deleteOffersFromArchive(RoutingContext routingContext) {
        logger.info("deleteOffersFromArchive()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<DeleteOffersFromArchiveRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter deleteOffersFromArchiveRequest is {}", deleteOffersFromArchiveRequest);

        api.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)
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

    private void getOfferMappings(RoutingContext routingContext) {
        logger.info("getOfferMappings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetOfferMappingsRequest getOfferMappingsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOfferMappingsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getOfferMappingsRequest is {}", getOfferMappingsRequest);

        api.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)
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

    private void getSuggestedOfferMappings(RoutingContext routingContext) {
        logger.info("getSuggestedOfferMappings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetSuggestedOfferMappingsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter getSuggestedOfferMappingsRequest is {}", getSuggestedOfferMappingsRequest);

        api.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)
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

    private void updateOfferMappings(RoutingContext routingContext) {
        logger.info("updateOfferMappings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOfferMappingsRequest updateOfferMappingsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOfferMappingsRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateOfferMappingsRequest is {}", updateOfferMappingsRequest);

        api.updateOfferMappings(businessId, updateOfferMappingsRequest)
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
