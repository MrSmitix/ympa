package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.CurrencyType
import org.openapitools.model.DeleteCampaignOffersRequest
import org.openapitools.model.DeleteCampaignOffersResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetAllOffersResponse
import org.openapitools.model.GetCampaignOffersRequest
import org.openapitools.model.GetCampaignOffersResponse
import org.openapitools.model.GetOfferRecommendationsRequest
import org.openapitools.model.GetOfferRecommendationsResponse
import org.openapitools.model.GetOffersResponse
import org.openapitools.model.UpdateCampaignOffersRequest

class OffersApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteCampaignOffers ( Long campaignId, DeleteCampaignOffersRequest deleteCampaignOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/delete"

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
        if (deleteCampaignOffersRequest == null) {
            throw new RuntimeException("missing required params deleteCampaignOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteCampaignOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeleteCampaignOffersResponse.class )

    }

    def getAllOffers ( Long campaignId, Long feedId, Integer chunk, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/all"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (feedId != null) {
            queryParams.put("feedId", feedId)
        }
        if (chunk != null) {
            queryParams.put("chunk", chunk)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetAllOffersResponse.class )

    }

    def getCampaignOffers ( Long campaignId, GetCampaignOffersRequest getCampaignOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers"

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
        if (getCampaignOffersRequest == null) {
            throw new RuntimeException("missing required params getCampaignOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getCampaignOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCampaignOffersResponse.class )

    }

    def getOfferRecommendations ( Long businessId, GetOfferRecommendationsRequest getOfferRecommendationsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offers/recommendations"

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
        if (getOfferRecommendationsRequest == null) {
            throw new RuntimeException("missing required params getOfferRecommendationsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getOfferRecommendationsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOfferRecommendationsResponse.class )

    }

    def getOffers ( Long campaignId, String query, Long feedId, String shopCategoryId, CurrencyType currency, Boolean matched, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (query != null) {
            queryParams.put("query", query)
        }
        if (feedId != null) {
            queryParams.put("feedId", feedId)
        }
        if (shopCategoryId != null) {
            queryParams.put("shopCategoryId", shopCategoryId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }
        if (matched != null) {
            queryParams.put("matched", matched)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOffersResponse.class )

    }

    def updateCampaignOffers ( Long campaignId, UpdateCampaignOffersRequest updateCampaignOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/update"

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
        if (updateCampaignOffersRequest == null) {
            throw new RuntimeException("missing required params updateCampaignOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = updateCampaignOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
