package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetBidsInfoRequest
import org.openapitools.model.GetBidsInfoResponse
import org.openapitools.model.GetBidsRecommendationsRequest
import org.openapitools.model.GetBidsRecommendationsResponse
import org.openapitools.model.PutSkuBidsRequest

class BidsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getBidsInfoForBusiness ( Long businessId, String pageToken, Integer limit, GetBidsInfoRequest getBidsInfoRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/bids/info"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getBidsInfoRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBidsInfoResponse.class )

    }

    def getBidsRecommendations ( Long businessId, GetBidsRecommendationsRequest getBidsRecommendationsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/bids/recommendations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (getBidsRecommendationsRequest == null) {
            throw new RuntimeException("missing required params getBidsRecommendationsRequest")
        }



        contentType = 'application/json';
        bodyParams = getBidsRecommendationsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetBidsRecommendationsResponse.class )

    }

    def putBidsForBusiness ( Long businessId, PutSkuBidsRequest putSkuBidsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/bids"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (putSkuBidsRequest == null) {
            throw new RuntimeException("missing required params putSkuBidsRequest")
        }



        contentType = 'application/json';
        bodyParams = putSkuBidsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

    def putBidsForCampaign ( Long campaignId, PutSkuBidsRequest putSkuBidsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/bids"

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
        if (putSkuBidsRequest == null) {
            throw new RuntimeException("missing required params putSkuBidsRequest")
        }



        contentType = 'application/json';
        bodyParams = putSkuBidsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

}
