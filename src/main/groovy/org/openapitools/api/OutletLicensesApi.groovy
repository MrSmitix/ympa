package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetOutletLicensesResponse
import java.util.Set
import org.openapitools.model.UpdateOutletLicenseRequest

class OutletLicensesApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteOutletLicenses ( Long campaignId, Set<Long> ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets/licenses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (ids != null) {
            queryParams.put("ids", ids)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    EmptyApiResponse.class )

    }

    def getOutletLicenses ( Long campaignId, Set<Long> outletIds, Set<Long> ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets/licenses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (outletIds != null) {
            queryParams.put("outletIds", outletIds)
        }
        if (ids != null) {
            queryParams.put("ids", ids)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOutletLicensesResponse.class )

    }

    def updateOutletLicenses ( Long campaignId, UpdateOutletLicenseRequest updateOutletLicenseRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets/licenses"

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
        if (updateOutletLicenseRequest == null) {
            throw new RuntimeException("missing required params updateOutletLicenseRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOutletLicenseRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
