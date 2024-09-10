package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AcceptOrderCancellationRequest
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetOrderResponse
import org.openapitools.model.GetOrdersResponse
import org.openapitools.model.OrderBuyerType
import org.openapitools.model.OrderDeliveryDispatchType
import org.openapitools.model.OrderStatusType
import org.openapitools.model.OrderSubstatusType
import org.openapitools.model.ProvideOrderDigitalCodesRequest
import org.openapitools.model.ProvideOrderItemIdentifiersRequest
import org.openapitools.model.ProvideOrderItemIdentifiersResponse
import java.util.Set
import org.openapitools.model.SetOrderBoxLayoutRequest
import org.openapitools.model.SetOrderBoxLayoutResponse
import org.openapitools.model.SetOrderShipmentBoxesRequest
import org.openapitools.model.SetOrderShipmentBoxesResponse
import org.openapitools.model.UpdateOrderItemRequest
import org.openapitools.model.UpdateOrderStatusRequest
import org.openapitools.model.UpdateOrderStatusResponse
import org.openapitools.model.UpdateOrderStatusesRequest
import org.openapitools.model.UpdateOrderStatusesResponse

class OrdersApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def acceptOrderCancellation ( Long campaignId, Long orderId, AcceptOrderCancellationRequest acceptOrderCancellationRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/cancellation/accept"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (acceptOrderCancellationRequest == null) {
            throw new RuntimeException("missing required params acceptOrderCancellationRequest")
        }



        contentType = 'application/json';
        bodyParams = acceptOrderCancellationRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def getOrder ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOrderResponse.class )

    }

    def getOrders ( Long campaignId, List<Long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, Date updatedAtFrom, Date updatedAtTo, OrderDeliveryDispatchType dispatchType, Boolean fake, Boolean hasCis, Boolean onlyWaitingForCancellationApprove, Boolean onlyEstimatedDelivery, OrderBuyerType buyerType, Integer page, Integer pageSize, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (orderIds != null) {
            queryParams.put("orderIds", orderIds)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (substatus != null) {
            queryParams.put("substatus", substatus)
        }
        if (fromDate != null) {
            queryParams.put("fromDate", fromDate)
        }
        if (toDate != null) {
            queryParams.put("toDate", toDate)
        }
        if (supplierShipmentDateFrom != null) {
            queryParams.put("supplierShipmentDateFrom", supplierShipmentDateFrom)
        }
        if (supplierShipmentDateTo != null) {
            queryParams.put("supplierShipmentDateTo", supplierShipmentDateTo)
        }
        if (updatedAtFrom != null) {
            queryParams.put("updatedAtFrom", updatedAtFrom)
        }
        if (updatedAtTo != null) {
            queryParams.put("updatedAtTo", updatedAtTo)
        }
        if (dispatchType != null) {
            queryParams.put("dispatchType", dispatchType)
        }
        if (fake != null) {
            queryParams.put("fake", fake)
        }
        if (hasCis != null) {
            queryParams.put("hasCis", hasCis)
        }
        if (onlyWaitingForCancellationApprove != null) {
            queryParams.put("onlyWaitingForCancellationApprove", onlyWaitingForCancellationApprove)
        }
        if (onlyEstimatedDelivery != null) {
            queryParams.put("onlyEstimatedDelivery", onlyEstimatedDelivery)
        }
        if (buyerType != null) {
            queryParams.put("buyerType", buyerType)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOrdersResponse.class )

    }

    def provideOrderDigitalCodes ( Long campaignId, Long orderId, ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/deliverDigitalGoods"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (provideOrderDigitalCodesRequest == null) {
            throw new RuntimeException("missing required params provideOrderDigitalCodesRequest")
        }



        contentType = 'application/json';
        bodyParams = provideOrderDigitalCodesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def provideOrderItemIdentifiers ( Long campaignId, Long orderId, ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/identifiers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (provideOrderItemIdentifiersRequest == null) {
            throw new RuntimeException("missing required params provideOrderItemIdentifiersRequest")
        }



        contentType = 'application/json';
        bodyParams = provideOrderItemIdentifiersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    ProvideOrderItemIdentifiersResponse.class )

    }

    def setOrderBoxLayout ( Long campaignId, Long orderId, SetOrderBoxLayoutRequest setOrderBoxLayoutRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/boxes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (setOrderBoxLayoutRequest == null) {
            throw new RuntimeException("missing required params setOrderBoxLayoutRequest")
        }



        contentType = 'application/json';
        bodyParams = setOrderBoxLayoutRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    SetOrderBoxLayoutResponse.class )

    }

    def setOrderShipmentBoxes ( Long campaignId, Long orderId, Long shipmentId, SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/shipments/${shipmentId}/boxes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }
        // verify required params are set
        if (setOrderShipmentBoxesRequest == null) {
            throw new RuntimeException("missing required params setOrderShipmentBoxesRequest")
        }



        contentType = 'application/json';
        bodyParams = setOrderShipmentBoxesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    SetOrderShipmentBoxesResponse.class )

    }

    def updateOrderItems ( Long campaignId, Long orderId, UpdateOrderItemRequest updateOrderItemRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/items"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (updateOrderItemRequest == null) {
            throw new RuntimeException("missing required params updateOrderItemRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOrderItemRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def updateOrderStatus ( Long campaignId, Long orderId, UpdateOrderStatusRequest updateOrderStatusRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (updateOrderStatusRequest == null) {
            throw new RuntimeException("missing required params updateOrderStatusRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOrderStatusRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    UpdateOrderStatusResponse.class )

    }

    def updateOrderStatuses ( Long campaignId, UpdateOrderStatusesRequest updateOrderStatusesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/status-update"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (updateOrderStatusesRequest == null) {
            throw new RuntimeException("missing required params updateOrderStatusesRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOrderStatusesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateOrderStatusesResponse.class )

    }

}
