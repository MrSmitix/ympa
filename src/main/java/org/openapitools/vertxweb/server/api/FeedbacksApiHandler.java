package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetFeedbackListResponse;
import java.time.LocalDate;

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

public class FeedbacksApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(FeedbacksApiHandler.class);

    private final FeedbacksApi api;

    public FeedbacksApiHandler(FeedbacksApi api) {
        this.api = api;
    }

    @Deprecated
    public FeedbacksApiHandler() {
        this(new FeedbacksApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getFeedbackAndCommentUpdates").handler(this::getFeedbackAndCommentUpdates);
    }

    private void getFeedbackAndCommentUpdates(RoutingContext routingContext) {
        logger.info("getFeedbackAndCommentUpdates()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        LocalDate fromDate = requestParameters.queryParameter("from_date") != null ? requestParameters.queryParameter("from_date").getLocalDate() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter fromDate is {}", fromDate);

        api.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)
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
