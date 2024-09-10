package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AcceptOrderCancellationRequest;
import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetOrderResponse;
import org.openapitools.vertxweb.server.model.GetOrdersResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.OrderBuyerType;
import org.openapitools.vertxweb.server.model.OrderDeliveryDispatchType;
import org.openapitools.vertxweb.server.model.OrderStatusType;
import org.openapitools.vertxweb.server.model.OrderSubstatusType;
import org.openapitools.vertxweb.server.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.vertxweb.server.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.vertxweb.server.model.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import org.openapitools.vertxweb.server.model.SetOrderBoxLayoutRequest;
import org.openapitools.vertxweb.server.model.SetOrderBoxLayoutResponse;
import org.openapitools.vertxweb.server.model.SetOrderShipmentBoxesRequest;
import org.openapitools.vertxweb.server.model.SetOrderShipmentBoxesResponse;
import org.openapitools.vertxweb.server.model.UpdateOrderItemRequest;
import org.openapitools.vertxweb.server.model.UpdateOrderStatusRequest;
import org.openapitools.vertxweb.server.model.UpdateOrderStatusResponse;
import org.openapitools.vertxweb.server.model.UpdateOrderStatusesRequest;
import org.openapitools.vertxweb.server.model.UpdateOrderStatusesResponse;

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

public class OrdersApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrdersApiHandler.class);

    private final OrdersApi api;

    public OrdersApiHandler(OrdersApi api) {
        this.api = api;
    }

    @Deprecated
    public OrdersApiHandler() {
        this(new OrdersApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("acceptOrderCancellation").handler(this::acceptOrderCancellation);
        builder.operation("getOrder").handler(this::getOrder);
        builder.operation("getOrders").handler(this::getOrders);
        builder.operation("provideOrderDigitalCodes").handler(this::provideOrderDigitalCodes);
        builder.operation("provideOrderItemIdentifiers").handler(this::provideOrderItemIdentifiers);
        builder.operation("setOrderBoxLayout").handler(this::setOrderBoxLayout);
        builder.operation("setOrderShipmentBoxes").handler(this::setOrderShipmentBoxes);
        builder.operation("updateOrderItems").handler(this::updateOrderItems);
        builder.operation("updateOrderStatus").handler(this::updateOrderStatus);
        builder.operation("updateOrderStatuses").handler(this::updateOrderStatuses);
    }

    private void acceptOrderCancellation(RoutingContext routingContext) {
        logger.info("acceptOrderCancellation()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        AcceptOrderCancellationRequest acceptOrderCancellationRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AcceptOrderCancellationRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter acceptOrderCancellationRequest is {}", acceptOrderCancellationRequest);

        api.acceptOrderCancellation(campaignId, orderId, acceptOrderCancellationRequest)
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

    private void getOrder(RoutingContext routingContext) {
        logger.info("getOrder()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);

        api.getOrder(campaignId, orderId)
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

    private void getOrders(RoutingContext routingContext) {
        logger.info("getOrders()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        List<Long> orderIds = requestParameters.queryParameter("orderIds") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("orderIds").get(), new TypeReference<List<Long>>(){}) : null;
        Set<OrderStatusType> status = requestParameters.queryParameter("status") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("status").get(), new TypeReference<Set<OrderStatusType>>(){}) : null;
        Set<OrderSubstatusType> substatus = requestParameters.queryParameter("substatus") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("substatus").get(), new TypeReference<Set<OrderSubstatusType>>(){}) : null;
        LocalDate fromDate = requestParameters.queryParameter("fromDate") != null ? requestParameters.queryParameter("fromDate").getLocalDate() : null;
        LocalDate toDate = requestParameters.queryParameter("toDate") != null ? requestParameters.queryParameter("toDate").getLocalDate() : null;
        LocalDate supplierShipmentDateFrom = requestParameters.queryParameter("supplierShipmentDateFrom") != null ? requestParameters.queryParameter("supplierShipmentDateFrom").getLocalDate() : null;
        LocalDate supplierShipmentDateTo = requestParameters.queryParameter("supplierShipmentDateTo") != null ? requestParameters.queryParameter("supplierShipmentDateTo").getLocalDate() : null;
        OffsetDateTime updatedAtFrom = requestParameters.queryParameter("updatedAtFrom") != null ? requestParameters.queryParameter("updatedAtFrom").getOffsetDateTime() : null;
        OffsetDateTime updatedAtTo = requestParameters.queryParameter("updatedAtTo") != null ? requestParameters.queryParameter("updatedAtTo").getOffsetDateTime() : null;
        OrderDeliveryDispatchType dispatchType = requestParameters.queryParameter("dispatchType") != null ? requestParameters.queryParameter("dispatchType").getOrderDeliveryDispatchType() : null;
        Boolean fake = requestParameters.queryParameter("fake") != null ? requestParameters.queryParameter("fake").getBoolean() : false;
        Boolean hasCis = requestParameters.queryParameter("hasCis") != null ? requestParameters.queryParameter("hasCis").getBoolean() : false;
        Boolean onlyWaitingForCancellationApprove = requestParameters.queryParameter("onlyWaitingForCancellationApprove") != null ? requestParameters.queryParameter("onlyWaitingForCancellationApprove").getBoolean() : false;
        Boolean onlyEstimatedDelivery = requestParameters.queryParameter("onlyEstimatedDelivery") != null ? requestParameters.queryParameter("onlyEstimatedDelivery").getBoolean() : false;
        OrderBuyerType buyerType = requestParameters.queryParameter("buyerType") != null ? requestParameters.queryParameter("buyerType").getOrderBuyerType() : null;
        Integer page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getInteger() : 1;
        Integer pageSize = requestParameters.queryParameter("pageSize") != null ? requestParameters.queryParameter("pageSize").getInteger() : null;
        String pageToken = requestParameters.queryParameter("page_token") != null ? requestParameters.queryParameter("page_token").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderIds is {}", orderIds);
        logger.debug("Parameter status is {}", status);
        logger.debug("Parameter substatus is {}", substatus);
        logger.debug("Parameter fromDate is {}", fromDate);
        logger.debug("Parameter toDate is {}", toDate);
        logger.debug("Parameter supplierShipmentDateFrom is {}", supplierShipmentDateFrom);
        logger.debug("Parameter supplierShipmentDateTo is {}", supplierShipmentDateTo);
        logger.debug("Parameter updatedAtFrom is {}", updatedAtFrom);
        logger.debug("Parameter updatedAtTo is {}", updatedAtTo);
        logger.debug("Parameter dispatchType is {}", dispatchType);
        logger.debug("Parameter fake is {}", fake);
        logger.debug("Parameter hasCis is {}", hasCis);
        logger.debug("Parameter onlyWaitingForCancellationApprove is {}", onlyWaitingForCancellationApprove);
        logger.debug("Parameter onlyEstimatedDelivery is {}", onlyEstimatedDelivery);
        logger.debug("Parameter buyerType is {}", buyerType);
        logger.debug("Parameter page is {}", page);
        logger.debug("Parameter pageSize is {}", pageSize);
        logger.debug("Parameter pageToken is {}", pageToken);
        logger.debug("Parameter limit is {}", limit);

        api.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)
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

    private void provideOrderDigitalCodes(RoutingContext routingContext) {
        logger.info("provideOrderDigitalCodes()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProvideOrderDigitalCodesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter provideOrderDigitalCodesRequest is {}", provideOrderDigitalCodesRequest);

        api.provideOrderDigitalCodes(campaignId, orderId, provideOrderDigitalCodesRequest)
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

    private void provideOrderItemIdentifiers(RoutingContext routingContext) {
        logger.info("provideOrderItemIdentifiers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProvideOrderItemIdentifiersRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter provideOrderItemIdentifiersRequest is {}", provideOrderItemIdentifiersRequest);

        api.provideOrderItemIdentifiers(campaignId, orderId, provideOrderItemIdentifiersRequest)
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

    private void setOrderBoxLayout(RoutingContext routingContext) {
        logger.info("setOrderBoxLayout()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetOrderBoxLayoutRequest setOrderBoxLayoutRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetOrderBoxLayoutRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter setOrderBoxLayoutRequest is {}", setOrderBoxLayoutRequest);

        api.setOrderBoxLayout(campaignId, orderId, setOrderBoxLayoutRequest)
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

    private void setOrderShipmentBoxes(RoutingContext routingContext) {
        logger.info("setOrderShipmentBoxes()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        Long shipmentId = requestParameters.pathParameter("shipmentId") != null ? requestParameters.pathParameter("shipmentId").getLong() : null;
        RequestParameter body = requestParameters.body();
        SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SetOrderShipmentBoxesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter shipmentId is {}", shipmentId);
        logger.debug("Parameter setOrderShipmentBoxesRequest is {}", setOrderShipmentBoxesRequest);

        api.setOrderShipmentBoxes(campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest)
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

    private void updateOrderItems(RoutingContext routingContext) {
        logger.info("updateOrderItems()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOrderItemRequest updateOrderItemRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOrderItemRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter updateOrderItemRequest is {}", updateOrderItemRequest);

        api.updateOrderItems(campaignId, orderId, updateOrderItemRequest)
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

    private void updateOrderStatus(RoutingContext routingContext) {
        logger.info("updateOrderStatus()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        Long orderId = requestParameters.pathParameter("orderId") != null ? requestParameters.pathParameter("orderId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOrderStatusRequest updateOrderStatusRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOrderStatusRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter orderId is {}", orderId);
        logger.debug("Parameter updateOrderStatusRequest is {}", updateOrderStatusRequest);

        api.updateOrderStatus(campaignId, orderId, updateOrderStatusRequest)
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

    private void updateOrderStatuses(RoutingContext routingContext) {
        logger.info("updateOrderStatuses()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Long campaignId = requestParameters.pathParameter("campaignId") != null ? requestParameters.pathParameter("campaignId").getLong() : null;
        RequestParameter body = requestParameters.body();
        UpdateOrderStatusesRequest updateOrderStatusesRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateOrderStatusesRequest>(){}) : null;

        logger.debug("Parameter campaignId is {}", campaignId);
        logger.debug("Parameter updateOrderStatusesRequest is {}", updateOrderStatusesRequest);

        api.updateOrderStatuses(campaignId, updateOrderStatusesRequest)
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
