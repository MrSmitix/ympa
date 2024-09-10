package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLockedErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.FeedIndexLogsStatusType;
import org.openapitools.vertxweb.server.model.GetFeedIndexLogsResponse;
import org.openapitools.vertxweb.server.model.GetFeedResponse;
import org.openapitools.vertxweb.server.model.GetFeedsResponse;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.SetFeedParamsRequest;

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

public class FeedsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(FeedsApiHandler.class);

    private final FeedsApi api;

    public FeedsApiHandler(FeedsApi api) {
        this.api = api;
    }

    @Deprecated
    public FeedsApiHandler() {
        this(new FeedsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getFeed").handler(this::getFeed);
        builder.operation("getFeedIndexLogs").handler(this::getFeedIndexLogs);
        builder.operation("getFeeds").handler(this::getFeeds);
        builder.operation("refreshFeed").handler(this::refreshFeed);
        builder.operation("setFeedParams").handler(this::setFeedParams);
    }

    private void getFeed(RoutingContext routingContext) {
        logger.info("getFeed()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);

        api.getFeed(campaignId, feedId)
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

    private void getFeedIndexLogs(RoutingContext routingContext) {
        logger.info("getFeedIndexLogs()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        OffsetDateTime publishedTimeFrom = requestParameters.queryParameter("published_time_from") != null ? requestParameters.queryParameter("published_time_from").getOffsetDateTime() : null;
        OffsetDateTime publishedTimeTo = requestParameters.queryParameter("published_time_to") != null ? requestParameters.queryParameter("published_time_to").getOffsetDateTime() : null;
        FeedIndexLogsStatusType status = requestParameters.queryParameter("status") != null ? requestParameters.queryParameter("status").getFeedIndexLogsStatusType() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter publishedTimeFrom is {}", publishedTimeFrom);
        logger.debug("Parameter publishedTimeTo is {}", publishedTimeTo);
        logger.debug("Parameter status is {}", status);

        api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)
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

    private void getFeeds(RoutingContext routingContext) {
        logger.info("getFeeds()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);

        api.getFeeds(campaignId)
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

    private void refreshFeed(RoutingContext routingContext) {
        logger.info("refreshFeed()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);

        api.refreshFeed(campaignId, feedId)
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

    private void setFeedParams(RoutingContext routingContext) {
        logger.info("setFeedParams()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long feedId = requestParameters.pathParameter("feedId") != null ? requestParameters.pathParameter("feedId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetFeedParamsRequest setFeedParamsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetFeedParamsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter feedId is {}", feedId);
        logger.debug("Parameter setFeedParamsRequest is {}", setFeedParamsRequest);

        api.setFeedParams(campaignId, feedId, setFeedParamsRequest)
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
