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

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OrdersApiImpl implements OrdersApi {
    public Future<ApiResponse<EmptyApiResponse>> acceptOrderCancellation(Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOrderResponse>> getOrder(Long campaignId, Long orderId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetOrdersResponse>> getOrders(Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> provideOrderDigitalCodes(Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProvideOrderItemIdentifiersResponse>> provideOrderItemIdentifiers(Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SetOrderBoxLayoutResponse>> setOrderBoxLayout(Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SetOrderShipmentBoxesResponse>> setOrderShipmentBoxes(Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> updateOrderItems(Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateOrderStatusResponse>> updateOrderStatus(Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateOrderStatusesResponse>> updateOrderStatuses(Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
