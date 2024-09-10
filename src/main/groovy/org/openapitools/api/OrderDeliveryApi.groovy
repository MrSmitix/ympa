package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetOrderBuyerInfoResponse
import org.openapitools.model.SetOrderDeliveryDateRequest
import org.openapitools.model.SetOrderDeliveryTrackCodeRequest
import org.openapitools.model.UpdateOrderStorageLimitRequest
import org.openapitools.model.VerifyOrderEacRequest
import org.openapitools.model.VerifyOrderEacResponse

class OrderDeliveryApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getOrderBuyerInfo ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/buyer"

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
                    GetOrderBuyerInfoResponse.class )

    }

    def setOrderDeliveryDate ( Long campaignId, Long orderId, SetOrderDeliveryDateRequest setOrderDeliveryDateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/date"

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
        if (setOrderDeliveryDateRequest == null) {
            throw new RuntimeException("missing required params setOrderDeliveryDateRequest")
        }



        contentType = 'application/json';
        bodyParams = setOrderDeliveryDateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def setOrderDeliveryTrackCode ( Long campaignId, Long orderId, SetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/track"

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
        if (setOrderDeliveryTrackCodeRequest == null) {
            throw new RuntimeException("missing required params setOrderDeliveryTrackCodeRequest")
        }



        contentType = 'application/json';
        bodyParams = setOrderDeliveryTrackCodeRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updateOrderStorageLimit ( Long campaignId, Long orderId, UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/storage-limit"

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
        if (updateOrderStorageLimitRequest == null) {
            throw new RuntimeException("missing required params updateOrderStorageLimitRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOrderStorageLimitRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def verifyOrderEac ( Long campaignId, Long orderId, VerifyOrderEacRequest verifyOrderEacRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/verifyEac"

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
        if (verifyOrderEacRequest == null) {
            throw new RuntimeException("missing required params verifyOrderEacRequest")
        }



        contentType = 'application/json';
        bodyParams = verifyOrderEacRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    VerifyOrderEacResponse.class )

    }

}
