package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetBusinessBuyerInfoResponse
import org.openapitools.model.GetBusinessDocumentsInfoResponse

class OrderBusinessInformationApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getOrderBusinessBuyerInfo ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/business-buyer"

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
                    "POST", "",
                    GetBusinessBuyerInfoResponse.class )

    }

    def getOrderBusinessDocumentsInfo ( Long campaignId, Long orderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/documents"

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
                    "POST", "",
                    GetBusinessDocumentsInfoResponse.class )

    }

}
