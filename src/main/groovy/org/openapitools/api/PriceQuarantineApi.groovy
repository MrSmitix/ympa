package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.ConfirmPricesRequest
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetQuarantineOffersRequest
import org.openapitools.model.GetQuarantineOffersResponse

class PriceQuarantineApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def confirmBusinessPrices ( Long businessId, ConfirmPricesRequest confirmPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/price-quarantine/confirm"

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
        if (confirmPricesRequest == null) {
            throw new RuntimeException("missing required params confirmPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = confirmPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def confirmCampaignPrices ( Long campaignId, ConfirmPricesRequest confirmPricesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/price-quarantine/confirm"

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
        if (confirmPricesRequest == null) {
            throw new RuntimeException("missing required params confirmPricesRequest")
        }



        contentType = 'application/json';
        bodyParams = confirmPricesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def getBusinessQuarantineOffers ( Long businessId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/price-quarantine"

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
        if (getQuarantineOffersRequest == null) {
            throw new RuntimeException("missing required params getQuarantineOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getQuarantineOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQuarantineOffersResponse.class )

    }

    def getCampaignQuarantineOffers ( Long campaignId, GetQuarantineOffersRequest getQuarantineOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/price-quarantine"

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
        if (getQuarantineOffersRequest == null) {
            throw new RuntimeException("missing required params getQuarantineOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getQuarantineOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQuarantineOffersResponse.class )

    }

}
