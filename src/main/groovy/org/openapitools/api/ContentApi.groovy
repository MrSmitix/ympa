package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetCategoryContentParametersResponse
import org.openapitools.model.GetOfferCardsContentStatusRequest
import org.openapitools.model.GetOfferCardsContentStatusResponse
import org.openapitools.model.UpdateOfferContentRequest
import org.openapitools.model.UpdateOfferContentResponse

class ContentApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getCategoryContentParameters ( Long categoryId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/category/${categoryId}/parameters"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCategoryContentParametersResponse.class )

    }

    def getOfferCardsContentStatus ( Long businessId, String pageToken, Integer limit, GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-cards"

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
        bodyParams = getOfferCardsContentStatusRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOfferCardsContentStatusResponse.class )

    }

    def updateOfferContent ( Long businessId, UpdateOfferContentRequest updateOfferContentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-cards/update"

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
        if (updateOfferContentRequest == null) {
            throw new RuntimeException("missing required params updateOfferContentRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOfferContentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateOfferContentResponse.class )

    }

}
