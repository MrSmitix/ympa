package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetCategoryContentParametersResponse;
import org.openapitools.vertxweb.server.model.GetOfferCardsContentStatusRequest;
import org.openapitools.vertxweb.server.model.GetOfferCardsContentStatusResponse;
import org.openapitools.vertxweb.server.model.UpdateOfferContentRequest;
import org.openapitools.vertxweb.server.model.UpdateOfferContentResponse;

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

public class ContentApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ContentApiHandler.class);

    private final ContentApi api;

    public ContentApiHandler(ContentApi api) {
        this.api = api;
    }

    @Deprecated
    public ContentApiHandler() {
        this(new ContentApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getCategoryContentParameters").handler(this::getCategoryContentParameters);
        builder.operation("getOfferCardsContentStatus").handler(this::getOfferCardsContentStatus);
        builder.operation("updateOfferContent").handler(this::updateOfferContent);
    }

    private void getCategoryContentParameters(RoutingContext routingContext) {
        logger.info("getCategoryContentParameters()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long categoryId = requestParameters.pathParameter("categoryId") != null ? requestParameters.pathParameter("categoryId").getLong() : null;

        logger.debug("Parameter categoryId is {}", categoryId);

        api.getCategoryContentParameters(categoryId)
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

    private void getOfferCardsContentStatus(RoutingContext routingContext) {
        logger.info("getOfferCardsContentStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOfferCardsContentStatusRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getOfferCardsContentStatusRequest is {}", getOfferCardsContentStatusRequest);

        api.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)
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

    private void updateOfferContent(RoutingContext routingContext) {
        logger.info("updateOfferContent()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long businessId = requestParameters.pathParameter("businessId") != null ? requestParameters.pathParameter("businessId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOfferContentRequest updateOfferContentRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOfferContentRequest>(){}) : null;

        logger.debug("Parameter businessId is {}", businessId);
        logger.debug("Parameter updateOfferContentRequest is {}", updateOfferContentRequest);

        api.updateOfferContent(businessId, updateOfferContentRequest)
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
