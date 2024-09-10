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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersApiController extends Controller {
    private final OrdersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OrdersApiController(Config configuration, OrdersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result acceptOrderCancellation(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeacceptOrderCancellationRequest = request.body().asJson();
        AcceptOrderCancellationRequest acceptOrderCancellationRequest;
        if (nodeacceptOrderCancellationRequest != null) {
            acceptOrderCancellationRequest = mapper.readValue(nodeacceptOrderCancellationRequest.toString(), AcceptOrderCancellationRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(acceptOrderCancellationRequest);
            }
        } else {
            throw new IllegalArgumentException("'AcceptOrderCancellationRequest' parameter is required");
        }
        return imp.acceptOrderCancellationHttp(request, campaignId, orderId, acceptOrderCancellationRequest);
    }

    @ApiAction
    public Result getOrder(Http.Request request, Long campaignId,Long orderId) throws Exception {
        return imp.getOrderHttp(request, campaignId, orderId);
    }

    @ApiAction
    public Result getOrders(Http.Request request, Long campaignId) throws Exception {
        String[] orderIdsArray = request.queryString().get("orderIds");
        List<String> orderIdsList = OpenAPIUtils.parametersToList("csv", orderIdsArray);
        List<Long> orderIds = new ArrayList<>();
        for (String curParam : orderIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                orderIds.add(Long.parseLong(curParam));
            }
        }
        String[] statusArray = request.queryString().get("status");
        List<String> statusList = OpenAPIUtils.parametersToList("csv", statusArray);
        Set<OrderStatusType> status = new LinkedHashSet<>();
        for (String curParam : statusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                status.add(curParam);
            }
        }
        String[] substatusArray = request.queryString().get("substatus");
        List<String> substatusList = OpenAPIUtils.parametersToList("csv", substatusArray);
        Set<OrderSubstatusType> substatus = new LinkedHashSet<>();
        for (String curParam : substatusList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                substatus.add(curParam);
            }
        }
        String valuefromDate = request.getQueryString("fromDate");
        LocalDate fromDate;
        if (valuefromDate != null) {
            fromDate = LocalDate.parse(valuefromDate);
        } else {
            fromDate = null;
        }
        String valuetoDate = request.getQueryString("toDate");
        LocalDate toDate;
        if (valuetoDate != null) {
            toDate = LocalDate.parse(valuetoDate);
        } else {
            toDate = null;
        }
        String valuesupplierShipmentDateFrom = request.getQueryString("supplierShipmentDateFrom");
        LocalDate supplierShipmentDateFrom;
        if (valuesupplierShipmentDateFrom != null) {
            supplierShipmentDateFrom = LocalDate.parse(valuesupplierShipmentDateFrom);
        } else {
            supplierShipmentDateFrom = null;
        }
        String valuesupplierShipmentDateTo = request.getQueryString("supplierShipmentDateTo");
        LocalDate supplierShipmentDateTo;
        if (valuesupplierShipmentDateTo != null) {
            supplierShipmentDateTo = LocalDate.parse(valuesupplierShipmentDateTo);
        } else {
            supplierShipmentDateTo = null;
        }
        String valueupdatedAtFrom = request.getQueryString("updatedAtFrom");
        OffsetDateTime updatedAtFrom;
        if (valueupdatedAtFrom != null) {
            updatedAtFrom = OffsetDateTime.parse(valueupdatedAtFrom);
        } else {
            updatedAtFrom = null;
        }
        String valueupdatedAtTo = request.getQueryString("updatedAtTo");
        OffsetDateTime updatedAtTo;
        if (valueupdatedAtTo != null) {
            updatedAtTo = OffsetDateTime.parse(valueupdatedAtTo);
        } else {
            updatedAtTo = null;
        }
        String valuedispatchType = request.getQueryString("dispatchType");
        OrderDeliveryDispatchType dispatchType;
        if (valuedispatchType != null) {
            dispatchType = valuedispatchType;
        } else {
            dispatchType = null;
        }
        String valuefake = request.getQueryString("fake");
        Boolean fake;
        if (valuefake != null) {
            fake = Boolean.valueOf(valuefake);
        } else {
            fake = false;
        }
        String valuehasCis = request.getQueryString("hasCis");
        Boolean hasCis;
        if (valuehasCis != null) {
            hasCis = Boolean.valueOf(valuehasCis);
        } else {
            hasCis = false;
        }
        String valueonlyWaitingForCancellationApprove = request.getQueryString("onlyWaitingForCancellationApprove");
        Boolean onlyWaitingForCancellationApprove;
        if (valueonlyWaitingForCancellationApprove != null) {
            onlyWaitingForCancellationApprove = Boolean.valueOf(valueonlyWaitingForCancellationApprove);
        } else {
            onlyWaitingForCancellationApprove = false;
        }
        String valueonlyEstimatedDelivery = request.getQueryString("onlyEstimatedDelivery");
        Boolean onlyEstimatedDelivery;
        if (valueonlyEstimatedDelivery != null) {
            onlyEstimatedDelivery = Boolean.valueOf(valueonlyEstimatedDelivery);
        } else {
            onlyEstimatedDelivery = false;
        }
        String valuebuyerType = request.getQueryString("buyerType");
        OrderBuyerType buyerType;
        if (valuebuyerType != null) {
            buyerType = valuebuyerType;
        } else {
            buyerType = null;
        }
        String valuepage = request.getQueryString("page");
        Integer page;
        if (valuepage != null) {
            page = Integer.parseInt(valuepage);
        } else {
            page = 1;
        }
        String valuepageSize = request.getQueryString("pageSize");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = null;
        }
        String valuepageToken = request.getQueryString("page_token");
        String pageToken;
        if (valuepageToken != null) {
            pageToken = valuepageToken;
        } else {
            pageToken = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        return imp.getOrdersHttp(request, campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit);
    }

    @ApiAction
    public Result provideOrderDigitalCodes(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeprovideOrderDigitalCodesRequest = request.body().asJson();
        ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest;
        if (nodeprovideOrderDigitalCodesRequest != null) {
            provideOrderDigitalCodesRequest = mapper.readValue(nodeprovideOrderDigitalCodesRequest.toString(), ProvideOrderDigitalCodesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(provideOrderDigitalCodesRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProvideOrderDigitalCodesRequest' parameter is required");
        }
        return imp.provideOrderDigitalCodesHttp(request, campaignId, orderId, provideOrderDigitalCodesRequest);
    }

    @ApiAction
    public Result provideOrderItemIdentifiers(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeprovideOrderItemIdentifiersRequest = request.body().asJson();
        ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest;
        if (nodeprovideOrderItemIdentifiersRequest != null) {
            provideOrderItemIdentifiersRequest = mapper.readValue(nodeprovideOrderItemIdentifiersRequest.toString(), ProvideOrderItemIdentifiersRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(provideOrderItemIdentifiersRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProvideOrderItemIdentifiersRequest' parameter is required");
        }
        return imp.provideOrderItemIdentifiersHttp(request, campaignId, orderId, provideOrderItemIdentifiersRequest);
    }

    @ApiAction
    public Result setOrderBoxLayout(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodesetOrderBoxLayoutRequest = request.body().asJson();
        SetOrderBoxLayoutRequest setOrderBoxLayoutRequest;
        if (nodesetOrderBoxLayoutRequest != null) {
            setOrderBoxLayoutRequest = mapper.readValue(nodesetOrderBoxLayoutRequest.toString(), SetOrderBoxLayoutRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderBoxLayoutRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderBoxLayoutRequest' parameter is required");
        }
        return imp.setOrderBoxLayoutHttp(request, campaignId, orderId, setOrderBoxLayoutRequest);
    }

    @ApiAction
    public Result setOrderShipmentBoxes(Http.Request request, Long campaignId,Long orderId,Long shipmentId) throws Exception {
        JsonNode nodesetOrderShipmentBoxesRequest = request.body().asJson();
        SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest;
        if (nodesetOrderShipmentBoxesRequest != null) {
            setOrderShipmentBoxesRequest = mapper.readValue(nodesetOrderShipmentBoxesRequest.toString(), SetOrderShipmentBoxesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(setOrderShipmentBoxesRequest);
            }
        } else {
            throw new IllegalArgumentException("'SetOrderShipmentBoxesRequest' parameter is required");
        }
        return imp.setOrderShipmentBoxesHttp(request, campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest);
    }

    @ApiAction
    public Result updateOrderItems(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeupdateOrderItemRequest = request.body().asJson();
        UpdateOrderItemRequest updateOrderItemRequest;
        if (nodeupdateOrderItemRequest != null) {
            updateOrderItemRequest = mapper.readValue(nodeupdateOrderItemRequest.toString(), UpdateOrderItemRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderItemRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderItemRequest' parameter is required");
        }
        return imp.updateOrderItemsHttp(request, campaignId, orderId, updateOrderItemRequest);
    }

    @ApiAction
    public Result updateOrderStatus(Http.Request request, Long campaignId,Long orderId) throws Exception {
        JsonNode nodeupdateOrderStatusRequest = request.body().asJson();
        UpdateOrderStatusRequest updateOrderStatusRequest;
        if (nodeupdateOrderStatusRequest != null) {
            updateOrderStatusRequest = mapper.readValue(nodeupdateOrderStatusRequest.toString(), UpdateOrderStatusRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderStatusRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderStatusRequest' parameter is required");
        }
        return imp.updateOrderStatusHttp(request, campaignId, orderId, updateOrderStatusRequest);
    }

    @ApiAction
    public Result updateOrderStatuses(Http.Request request, Long campaignId) throws Exception {
        JsonNode nodeupdateOrderStatusesRequest = request.body().asJson();
        UpdateOrderStatusesRequest updateOrderStatusesRequest;
        if (nodeupdateOrderStatusesRequest != null) {
            updateOrderStatusesRequest = mapper.readValue(nodeupdateOrderStatusesRequest.toString(), UpdateOrderStatusesRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateOrderStatusesRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateOrderStatusesRequest' parameter is required");
        }
        return imp.updateOrderStatusesHttp(request, campaignId, updateOrderStatusesRequest);
    }

}
