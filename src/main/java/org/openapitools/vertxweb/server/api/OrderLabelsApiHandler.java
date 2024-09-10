package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.GetOrderLabelsDataResponse;
import org.openapitools.vertxweb.server.model.PageFormatType;

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

public class OrderLabelsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrderLabelsApiHandler.class);

    private final OrderLabelsApi api;

    public OrderLabelsApiHandler(OrderLabelsApi api) {
        this.api = api;
    }

    @Deprecated
    public OrderLabelsApiHandler() {
        this(new OrderLabelsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("generateOrderLabel").handler(this::generateOrderLabel);
        builder.operation("generateOrderLabels").handler(this::generateOrderLabels);
        builder.operation("getOrderLabelsData").handler(this::getOrderLabelsData);
    }

    private void generateOrderLabel(RoutingContext routingContext) {
        logger.info("generateOrderLabel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        Long boxId = requestParameters.pathParameter("boxId") != null ? requestParameters.pathParameter("boxId").getLong() : null;
        PageFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getPageFormatType() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter boxId is {}", boxId);
        logger.debug("Parameter format is {}", format);

        api.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)
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

    private void generateOrderLabels(RoutingContext routingContext) {
        logger.info("generateOrderLabels()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        PageFormatType format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getPageFormatType() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter format is {}", format);

        api.generateOrderLabels(campaignId, orderId, format)
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

    private void getOrderLabelsData(RoutingContext routingContext) {
        logger.info("getOrderLabelsData()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrderLabelsData(campaignId, orderId)
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
