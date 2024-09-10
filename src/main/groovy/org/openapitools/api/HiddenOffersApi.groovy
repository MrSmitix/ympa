package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AddHiddenOffersRequest
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.DeleteHiddenOffersRequest
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetHiddenOffersResponse

class HiddenOffersApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addHiddenOffers ( Long campaignId, AddHiddenOffersRequest addHiddenOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/hidden-offers"

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
        if (addHiddenOffersRequest == null) {
            throw new RuntimeException("missing required params addHiddenOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = addHiddenOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def deleteHiddenOffers ( Long campaignId, DeleteHiddenOffersRequest deleteHiddenOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/hidden-offers/delete"

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
        if (deleteHiddenOffersRequest == null) {
            throw new RuntimeException("missing required params deleteHiddenOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteHiddenOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def getHiddenOffers ( Long campaignId, List<String> offerId, String pageToken, Integer limit, Integer offset, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/hidden-offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (offerId != null) {
            queryParams.put("offer_id", offerId)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetHiddenOffersResponse.class )

    }

}
