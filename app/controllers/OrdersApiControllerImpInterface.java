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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class OrdersApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result acceptOrderCancellationHttp(Http.Request request, Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = acceptOrderCancellation(request, campaignId, orderId, acceptOrderCancellationRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse acceptOrderCancellation(Http.Request request, Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest) throws Exception;

    public Result getOrderHttp(Http.Request request, Long campaignId, Long orderId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrderResponse obj = getOrder(request, campaignId, orderId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrderResponse getOrder(Http.Request request, Long campaignId, Long orderId) throws Exception;

    public Result getOrdersHttp(Http.Request request, Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType,  @Max(10000)Integer page, Integer pageSize, String pageToken, Integer limit) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        GetOrdersResponse obj = getOrders(request, campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GetOrdersResponse getOrders(Http.Request request, Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, LocalDate fromDate, LocalDate toDate, LocalDate supplierShipmentDateFrom, LocalDate supplierShipmentDateTo, OffsetDateTime updatedAtFrom, OffsetDateTime updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType,  @Max(10000)Integer page, Integer pageSize, String pageToken, Integer limit) throws Exception;

    public Result provideOrderDigitalCodesHttp(Http.Request request, Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        EmptyApiResponse obj = provideOrderDigitalCodes(request, campaignId, orderId, provideOrderDigitalCodesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EmptyApiResponse provideOrderDigitalCodes(Http.Request request, Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest) throws Exception;

    public Result provideOrderItemIdentifiersHttp(Http.Request request, Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        ProvideOrderItemIdentifiersResponse obj = provideOrderItemIdentifiers(request, campaignId, orderId, provideOrderItemIdentifiersRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProvideOrderItemIdentifiersResponse provideOrderItemIdentifiers(Http.Request request, Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest) throws Exception;

    public Result setOrderBoxLayoutHttp(Http.Request request, Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SetOrderBoxLayoutResponse obj = setOrderBoxLayout(request, campaignId, orderId, setOrderBoxLayoutRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SetOrderBoxLayoutResponse setOrderBoxLayout(Http.Request request, Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest) throws Exception;

    public Result setOrderShipmentBoxesHttp(Http.Request request, Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        SetOrderShipmentBoxesResponse obj = setOrderShipmentBoxes(request, campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SetOrderShipmentBoxesResponse setOrderShipmentBoxes(Http.Request request, Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest) throws Exception;

    public Result updateOrderItemsHttp(Http.Request request, Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        updateOrderItems(request, campaignId, orderId, updateOrderItemRequest);
        return ok();

    }

    public abstract void updateOrderItems(Http.Request request, Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest) throws Exception;

    public Result updateOrderStatusHttp(Http.Request request, Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOrderStatusResponse obj = updateOrderStatus(request, campaignId, orderId, updateOrderStatusRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOrderStatusResponse updateOrderStatus(Http.Request request, Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest) throws Exception;

    public Result updateOrderStatusesHttp(Http.Request request, Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "OAuth")) {
            return unauthorized();
        }

        UpdateOrderStatusesResponse obj = updateOrderStatuses(request, campaignId, updateOrderStatusesRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UpdateOrderStatusesResponse updateOrderStatuses(Http.Request request, Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest) throws Exception;

}
