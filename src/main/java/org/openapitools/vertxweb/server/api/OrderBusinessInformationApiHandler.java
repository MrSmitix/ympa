package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.GetBusinessBuyerInfoResponse;
import org.openapitools.vertxweb.server.model.GetBusinessDocumentsInfoResponse;

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

public class OrderBusinessInformationApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrderBusinessInformationApiHandler.class);

    private final OrderBusinessInformationApi api;

    public OrderBusinessInformationApiHandler(OrderBusinessInformationApi api) {
        this.api = api;
    }

    @Deprecated
    public OrderBusinessInformationApiHandler() {
        this(new OrderBusinessInformationApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getOrderBusinessBuyerInfo").handler(this::getOrderBusinessBuyerInfo);
        builder.operation("getOrderBusinessDocumentsInfo").handler(this::getOrderBusinessDocumentsInfo);
    }

    private void getOrderBusinessBuyerInfo(RoutingContext routingContext) {
        logger.info("getOrderBusinessBuyerInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrderBusinessBuyerInfo(campaignId, orderId)
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

    private void getOrderBusinessDocumentsInfo(RoutingContext routingContext) {
        logger.info("getOrderBusinessDocumentsInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrderBusinessDocumentsInfo(campaignId, orderId)
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
