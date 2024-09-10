package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.DeletePromoOffersRequest
import org.openapitools.model.DeletePromoOffersResponse
import org.openapitools.model.GetPromoOffersRequest
import org.openapitools.model.GetPromoOffersResponse
import org.openapitools.model.GetPromosRequest
import org.openapitools.model.GetPromosResponse
import org.openapitools.model.UpdatePromoOffersRequest
import org.openapitools.model.UpdatePromoOffersResponse

class PromosApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deletePromoOffers ( Long businessId, DeletePromoOffersRequest deletePromoOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos/offers/delete"

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
        if (deletePromoOffersRequest == null) {
            throw new RuntimeException("missing required params deletePromoOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deletePromoOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeletePromoOffersResponse.class )

    }

    def getPromoOffers ( Long businessId, GetPromoOffersRequest getPromoOffersRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos/offers"

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
        if (getPromoOffersRequest == null) {
            throw new RuntimeException("missing required params getPromoOffersRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getPromoOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetPromoOffersResponse.class )

    }

    def getPromos ( Long businessId, GetPromosRequest getPromosRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }



        contentType = 'application/json';
        bodyParams = getPromosRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetPromosResponse.class )

    }

    def updatePromoOffers ( Long businessId, UpdatePromoOffersRequest updatePromoOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/promos/offers/update"

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
        if (updatePromoOffersRequest == null) {
            throw new RuntimeException("missing required params updatePromoOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = updatePromoOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdatePromoOffersResponse.class )

    }

}
