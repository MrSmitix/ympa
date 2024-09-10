package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetQualityRatingDetailsResponse
import org.openapitools.model.GetQualityRatingRequest
import org.openapitools.model.GetQualityRatingResponse

class RatingsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getQualityRatingDetails ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/ratings/quality/details"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQualityRatingDetailsResponse.class )

    }

    def getQualityRatings ( Long businessId, GetQualityRatingRequest getQualityRatingRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/ratings/quality"

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
        if (getQualityRatingRequest == null) {
            throw new RuntimeException("missing required params getQualityRatingRequest")
        }



        contentType = 'application/json';
        bodyParams = getQualityRatingRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetQualityRatingResponse.class )

    }

}
