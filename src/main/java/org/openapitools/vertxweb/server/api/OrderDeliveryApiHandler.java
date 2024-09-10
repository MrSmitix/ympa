package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOrderBuyerInfoResponse;
import org.openapitools.vertxweb.server.model.SetOrderDeliveryDateRequest;
import org.openapitools.vertxweb.server.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.vertxweb.server.model.UpdateOrderStorageLimitRequest;
import org.openapitools.vertxweb.server.model.VerifyOrderEacRequest;
import org.openapitools.vertxweb.server.model.VerifyOrderEacResponse;

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

public class OrderDeliveryApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrderDeliveryApiHandler.class);

    private final OrderDeliveryApi api;

    public OrderDeliveryApiHandler(OrderDeliveryApi api) {
        this.api = api;
    }

    @Deprecated
    public OrderDeliveryApiHandler() {
        this(new OrderDeliveryApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getOrderBuyerInfo").handler(this::getOrderBuyerInfo);
        builder.operation("setOrderDeliveryDate").handler(this::setOrderDeliveryDate);
        builder.operation("setOrderDeliveryTrackCode").handler(this::setOrderDeliveryTrackCode);
        builder.operation("updateOrderStorageLimit").handler(this::updateOrderStorageLimit);
        builder.operation("verifyOrderEac").handler(this::verifyOrderEac);
    }

    private void getOrderBuyerInfo(RoutingContext routingContext) {
        logger.info("getOrderBuyerInfo()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrderBuyerInfo(campaignId, orderId)
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

    private void setOrderDeliveryDate(RoutingContext routingContext) {
        logger.info("setOrderDeliveryDate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetOrderDeliveryDateRequest setOrderDeliveryDateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetOrderDeliveryDateRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter setOrderDeliveryDateRequest is {}", setOrderDeliveryDateRequest);

        api.setOrderDeliveryDate(campaignId, orderId, setOrderDeliveryDateRequest)
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

    private void setOrderDeliveryTrackCode(RoutingContext routingContext) {
        logger.info("setOrderDeliveryTrackCode()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetOrderDeliveryTrackCodeRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter setOrderDeliveryTrackCodeRequest is {}", setOrderDeliveryTrackCodeRequest);

        api.setOrderDeliveryTrackCode(campaignId, orderId, setOrderDeliveryTrackCodeRequest)
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

    private void updateOrderStorageLimit(RoutingContext routingContext) {
        logger.info("updateOrderStorageLimit()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOrderStorageLimitRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter updateOrderStorageLimitRequest is {}", updateOrderStorageLimitRequest);

        api.updateOrderStorageLimit(campaignId, orderId, updateOrderStorageLimitRequest)
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

    private void verifyOrderEac(RoutingContext routingContext) {
        logger.info("verifyOrderEac()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        VerifyOrderEacRequest verifyOrderEacRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<VerifyOrderEacRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter verifyOrderEacRequest is {}", verifyOrderEacRequest);

        api.verifyOrderEac(campaignId, orderId, verifyOrderEacRequest)
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
