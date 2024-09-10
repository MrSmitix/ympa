package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.ConfirmShipmentRequest
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetShipmentOrdersInfoResponse
import org.openapitools.model.GetShipmentResponse
import org.openapitools.model.SearchShipmentsRequest
import org.openapitools.model.SearchShipmentsResponse
import org.openapitools.model.SetShipmentPalletsCountRequest
import org.openapitools.model.ShipmentPalletLabelPageFormatType
import org.openapitools.model.TransferOrdersFromShipmentRequest

class ShipmentsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def confirmShipment ( Long campaignId, Long shipmentId, ConfirmShipmentRequest confirmShipmentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/confirm"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }



        contentType = 'application/json';
        bodyParams = confirmShipmentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def downloadShipmentAct ( Long campaignId, Long shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/act"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def downloadShipmentDiscrepancyAct ( Long campaignId, Long shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/discrepancy-act"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def downloadShipmentInboundAct ( Long campaignId, Long shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/inbound-act"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def downloadShipmentPalletLabels ( Long campaignId, Long shipmentId, ShipmentPalletLabelPageFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/pallet/labels"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }

        if (format != null) {
            queryParams.put("format", format)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def downloadShipmentReceptionTransferAct ( Long campaignId, Integer warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/shipments/reception-transfer-act"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (warehouseId != null) {
            queryParams.put("warehouse_id", warehouseId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def downloadShipmentTransportationWaybill ( Long campaignId, Long shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/transportation-waybill"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getShipment ( Long campaignId, Long shipmentId, Boolean cancelledOrders, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }

        if (cancelledOrders != null) {
            queryParams.put("cancelledOrders", cancelledOrders)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetShipmentResponse.class )

    }

    def getShipmentOrdersInfo ( Long campaignId, Long shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/orders/info"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetShipmentOrdersInfoResponse.class )

    }

    def searchShipments ( Long campaignId, SearchShipmentsRequest searchShipmentsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments"

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
        if (searchShipmentsRequest == null) {
            throw new RuntimeException("missing required params searchShipmentsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = searchShipmentsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    SearchShipmentsResponse.class )

    }

    def setShipmentPalletsCount ( Long campaignId, Long shipmentId, SetShipmentPalletsCountRequest setShipmentPalletsCountRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/pallets"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }
        // verify required params are set
        if (setShipmentPalletsCountRequest == null) {
            throw new RuntimeException("missing required params setShipmentPalletsCountRequest")
        }



        contentType = 'application/json';
        bodyParams = setShipmentPalletsCountRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def transferOrdersFromShipment ( Long campaignId, Long shipmentId, TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/first-mile/shipments/${shipmentId}/orders/transfer"

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
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }
        // verify required params are set
        if (transferOrdersFromShipmentRequest == null) {
            throw new RuntimeException("missing required params transferOrdersFromShipmentRequest")
        }



        contentType = 'application/json';
        bodyParams = transferOrdersFromShipmentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
