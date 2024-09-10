package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AcceptOrderCancellationRequest;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOrderResponse;
import org.openapitools.server.api.model.GetOrdersResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.OrderBuyerType;
import org.openapitools.server.api.model.OrderDeliveryDispatchType;
import org.openapitools.server.api.model.OrderStatusType;
import org.openapitools.server.api.model.OrderSubstatusType;
import org.openapitools.server.api.model.ProvideOrderDigitalCodesRequest;
import org.openapitools.server.api.model.ProvideOrderItemIdentifiersRequest;
import org.openapitools.server.api.model.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import org.openapitools.server.api.model.SetOrderBoxLayoutRequest;
import org.openapitools.server.api.model.SetOrderBoxLayoutResponse;
import org.openapitools.server.api.model.SetOrderShipmentBoxesRequest;
import org.openapitools.server.api.model.SetOrderShipmentBoxesResponse;
import org.openapitools.server.api.model.UpdateOrderItemRequest;
import org.openapitools.server.api.model.UpdateOrderStatusRequest;
import org.openapitools.server.api.model.UpdateOrderStatusResponse;
import org.openapitools.server.api.model.UpdateOrderStatusesRequest;
import org.openapitools.server.api.model.UpdateOrderStatusesResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OrdersApi  {
    //acceptOrderCancellation
    void acceptOrderCancellation(Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //getOrder
    void getOrder(Long campaignId, Long orderId, Handler<AsyncResult<GetOrderResponse>> handler);

    //getOrders
    void getOrders(Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit, Handler<AsyncResult<GetOrdersResponse>> handler);

    //provideOrderDigitalCodes
    void provideOrderDigitalCodes(Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //provideOrderItemIdentifiers
    void provideOrderItemIdentifiers(Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest, Handler<AsyncResult<ProvideOrderItemIdentifiersResponse>> handler);

    //setOrderBoxLayout
    void setOrderBoxLayout(Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest, Handler<AsyncResult<SetOrderBoxLayoutResponse>> handler);

    //setOrderShipmentBoxes
    void setOrderShipmentBoxes(Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest, Handler<AsyncResult<SetOrderShipmentBoxesResponse>> handler);

    //updateOrderItems
    void updateOrderItems(Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest, Handler<AsyncResult<Void>> handler);

    //updateOrderStatus
    void updateOrderStatus(Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest, Handler<AsyncResult<UpdateOrderStatusResponse>> handler);

    //updateOrderStatuses
    void updateOrderStatuses(Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest, Handler<AsyncResult<UpdateOrderStatusesResponse>> handler);

}
