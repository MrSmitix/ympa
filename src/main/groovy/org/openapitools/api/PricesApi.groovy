package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetPricesByOfferIdsRequest
import org.openapitools.model.GetPricesByOfferIdsResponse
import org.openapitools.model.GetPricesResponse
import org.openapitools.model.SuggestPricesRequest
import org.openapitools.model.SuggestPricesResponse
import org.openapitools.model.UpdateBusinessPricesRequest
import org.openapitools.model.UpdatePricesRequest

class PricesApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getPrices ( Long campaignId, String pageToken, Integer limit, Boolean archived, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices"

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
        if (archived != null) {
            queryParams.put("archived", archived)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetPricesResponse.class )

    }

    def getPricesByOfferIds ( Long campaignId, String pageToken, Integer limit, GetPricesByOfferIdsRequest getPricesByOfferIdsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices"

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


        contentType = 'application/json';
        bodyParams = getPricesByOfferIdsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetPricesByOfferIdsResponse.class )

    }

    def getSuggestedPrices ( Long campaignId, SuggestPricesRequest suggestPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices/suggestions"

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
        if (suggestPricesRequest == null) {
            throw new RuntimeException("missing required params suggestPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = suggestPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    SuggestPricesResponse.class )

    }

    def updateBusinessPrices ( Long businessId, UpdateBusinessPricesRequest updateBusinessPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-prices/updates"

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
        if (updateBusinessPricesRequest == null) {
            throw new RuntimeException("missing required params updateBusinessPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = updateBusinessPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updatePrices ( Long campaignId, UpdatePricesRequest updatePricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-prices/updates"

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
        if (updatePricesRequest == null) {
            throw new RuntimeException("missing required params updatePricesRequest")
        }



        contentType = 'application/json';
        bodyParams = updatePricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
