package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetOrderLabelsDataResponse
import org.openapitools.model.PageFormatType

class OrderLabelsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def generateOrderLabel ( Long campaignId, Long orderId, Long shipmentId, Long boxId, PageFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/shipments/${shipmentId}/boxes/${boxId}/label"

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
        if (boxId == null) {
            throw new RuntimeException("missing required params boxId")
        }

        if (format != null) {
            queryParams.put("format", format)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def generateOrderLabels ( Long campaignId, Long orderId, PageFormatType format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/labels"

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

        if (format != null) {
            queryParams.put("format", format)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getOrderLabelsData ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/delivery/labels/data"

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
                    GetOrderLabelsDataResponse.class )

    }

}
