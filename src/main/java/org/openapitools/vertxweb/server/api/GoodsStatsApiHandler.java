package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetGoodsStatsRequest;
import org.openapitools.vertxweb.server.model.GetGoodsStatsResponse;

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

public class GoodsStatsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(GoodsStatsApiHandler.class);

    private final GoodsStatsApi api;

    public GoodsStatsApiHandler(GoodsStatsApi api) {
        this.api = api;
    }

    @Deprecated
    public GoodsStatsApiHandler() {
        this(new GoodsStatsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getGoodsStats").handler(this::getGoodsStats);
    }

    private void getGoodsStats(RoutingContext routingContext) {
        logger.info("getGoodsStats()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        GetGoodsStatsRequest getGoodsStatsRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<GetGoodsStatsRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter getGoodsStatsRequest is {}", getGoodsStatsRequest);

        api.getGoodsStats(campaignId, getGoodsStatsRequest)
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
