package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetReturnResponse
import org.openapitools.model.GetReturnsResponse
import org.openapitools.model.RefundStatusType
import org.openapitools.model.ReturnType
import org.openapitools.model.SetReturnDecisionRequest

class ReturnsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getReturn ( Long campaignId, Long orderId, Long returnId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}"

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
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetReturnResponse.class )

    }

    def getReturnApplication ( Long campaignId, Long orderId, Long returnId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/application"

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
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getReturnPhoto ( Long campaignId, Long orderId, Long returnId, Long itemId, String imageHash, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/${itemId}/image/${imageHash}"

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
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }
        // verify required params are set
        if (itemId == null) {
            throw new RuntimeException("missing required params itemId")
        }
        // verify required params are set
        if (imageHash == null) {
            throw new RuntimeException("missing required params imageHash")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    File.class )

    }

    def getReturns ( Long campaignId, String pageToken, Integer limit, List<Long> orderIds, List<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/returns"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (orderIds != null) {
            queryParams.put("orderIds", orderIds)
        }
        if (statuses != null) {
            queryParams.put("statuses", statuses)
        }
        if (type != null) {
            queryParams.put("type", type)
        }
        if (fromDate != null) {
            queryParams.put("fromDate", fromDate)
        }
        if (toDate != null) {
            queryParams.put("toDate", toDate)
        }
        if (fromDate2 != null) {
            queryParams.put("from_date", fromDate2)
        }
        if (toDate2 != null) {
            queryParams.put("to_date", toDate2)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetReturnsResponse.class )

    }

    def setReturnDecision ( Long campaignId, Long orderId, Long returnId, SetReturnDecisionRequest setReturnDecisionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision"

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
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }
        // verify required params are set
        if (setReturnDecisionRequest == null) {
            throw new RuntimeException("missing required params setReturnDecisionRequest")
        }



        contentType = 'application/json';
        bodyParams = setReturnDecisionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def submitReturnDecision ( Long campaignId, Long orderId, Long returnId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/orders/${orderId}/returns/${returnId}/decision/submit"

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
        if (returnId == null) {
            throw new RuntimeException("missing required params returnId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
