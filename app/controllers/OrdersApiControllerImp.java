package controllers;

import apimodels.AcceptOrderCancellationRequest;
import apimodels.ApiClientDataErrorResponse;
import apimodels.ApiForbiddenErrorResponse;
import apimodels.ApiLimitErrorResponse;
import apimodels.ApiNotFoundErrorResponse;
import apimodels.ApiServerErrorResponse;
import apimodels.ApiUnauthorizedErrorResponse;
import apimodels.EmptyApiResponse;
import apimodels.GetOrderResponse;
import apimodels.GetOrdersResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import apimodels.OrderBuyerType;
import apimodels.OrderDeliveryDispatchType;
import apimodels.OrderStatusType;
import apimodels.OrderSubstatusType;
import apimodels.ProvideOrderDigitalCodesRequest;
import apimodels.ProvideOrderItemIdentifiersRequest;
import apimodels.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import apimodels.SetOrderBoxLayoutRequest;
import apimodels.SetOrderBoxLayoutResponse;
import apimodels.SetOrderShipmentBoxesRequest;
import apimodels.SetOrderShipmentBoxesResponse;
import apimodels.UpdateOrderItemRequest;
import apimodels.UpdateOrderStatusRequest;
import apimodels.UpdateOrderStatusResponse;
import apimodels.UpdateOrderStatusesRequest;
import apimodels.UpdateOrderStatusesResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersApiControllerImp extends OrdersApiControllerImpInterface {
    @Override
    public EmptyApiResponse acceptOrderCancellation(Http.Request request, Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public GetOrderResponse getOrder(Http.Request request, Long campaignId, Long orderId) throws Exception {
        //Do your magic!!!
        return new GetOrderResponse();
    }

    @Override
    public GetOrdersResponse getOrders(Http.Request request, Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType,  @Max(10000)Integer page, Integer pageSize, String pageToken, Integer limit) throws Exception {
        //Do your magic!!!
        return new GetOrdersResponse();
    }

    @Override
    public EmptyApiResponse provideOrderDigitalCodes(Http.Request request, Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) throws Exception {
        //Do your magic!!!
        return new EmptyApiResponse();
    }

    @Override
    public ProvideOrderItemIdentifiersResponse provideOrderItemIdentifiers(Http.Request request, Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) throws Exception {
        //Do your magic!!!
        return new ProvideOrderItemIdentifiersResponse();
    }

    @Override
    public SetOrderBoxLayoutResponse setOrderBoxLayout(Http.Request request, Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) throws Exception {
        //Do your magic!!!
        return new SetOrderBoxLayoutResponse();
    }

    @Override
    public SetOrderShipmentBoxesResponse setOrderShipmentBoxes(Http.Request request, Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) throws Exception {
        //Do your magic!!!
        return new SetOrderShipmentBoxesResponse();
    }

    @Override
    public void updateOrderItems(Http.Request request, Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) throws Exception {
        //Do your magic!!!
    }

    @Override
    public UpdateOrderStatusResponse updateOrderStatus(Http.Request request, Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOrderStatusResponse();
    }

    @Override
    public UpdateOrderStatusesResponse updateOrderStatuses(Http.Request request, Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) throws Exception {
        //Do your magic!!!
        return new UpdateOrderStatusesResponse();
    }

}
