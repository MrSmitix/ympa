package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetOrdersStatsRequest;
import org.openapitools.vertxweb.server.model.GetOrdersStatsResponse;

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

public class OrdersStatsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrdersStatsApiHandler.class);

    private final OrdersStatsApi api;

    public OrdersStatsApiHandler(OrdersStatsApi api) {
        this.api = api;
    }

    @Deprecated
    public OrdersStatsApiHandler() {
        this(new OrdersStatsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getOrdersStats").handler(this::getOrdersStats);
    }

    private void getOrdersStats(RoutingContext routingContext) {
        logger.info("getOrdersStats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        RequestParameter body = requestParameters.body();
        GetOrdersStatsRequest getOrdersStatsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetOrdersStatsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter getOrdersStatsRequest is {}", getOrdersStatsRequest);

        api.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)
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
