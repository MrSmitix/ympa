package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.ChangeOutletRequest
import org.openapitools.model.CreateOutletResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetOutletResponse
import org.openapitools.model.GetOutletsResponse

class OutletsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createOutlet ( Long campaignId, ChangeOutletRequest changeOutletRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets"

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
        if (changeOutletRequest == null) {
            throw new RuntimeException("missing required params changeOutletRequest")
        }



        contentType = 'application/json';
        bodyParams = changeOutletRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateOutletResponse.class )

    }

    def deleteOutlet ( Long campaignId, Long outletId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets/${outletId}"

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
        if (outletId == null) {
            throw new RuntimeException("missing required params outletId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    EmptyApiResponse.class )

    }

    def getOutlet ( Long campaignId, Long outletId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets/${outletId}"

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
        if (outletId == null) {
            throw new RuntimeException("missing required params outletId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOutletResponse.class )

    }

    def getOutlets ( Long campaignId, String pageToken, Long regionId, String shopOutletCode, Long regionId2, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets"

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
        if (regionId != null) {
            queryParams.put("region_id", regionId)
        }
        if (shopOutletCode != null) {
            queryParams.put("shop_outlet_code", shopOutletCode)
        }
        if (regionId2 != null) {
            queryParams.put("regionId", regionId2)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOutletsResponse.class )

    }

    def updateOutlet ( Long campaignId, Long outletId, ChangeOutletRequest changeOutletRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/outlets/${outletId}"

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
        if (outletId == null) {
            throw new RuntimeException("missing required params outletId")
        }
        // verify required params are set
        if (changeOutletRequest == null) {
            throw new RuntimeException("missing required params changeOutletRequest")
        }



        contentType = 'application/json';
        bodyParams = changeOutletRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

}
