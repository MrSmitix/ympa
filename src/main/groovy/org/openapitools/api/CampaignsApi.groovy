package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetCampaignLoginsResponse
import org.openapitools.model.GetCampaignRegionResponse
import org.openapitools.model.GetCampaignResponse
import org.openapitools.model.GetCampaignSettingsResponse
import org.openapitools.model.GetCampaignsResponse

class CampaignsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getCampaign ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}"

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
                    "GET", "",
                    GetCampaignResponse.class )

    }

    def getCampaignLogins ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/logins"

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
                    "GET", "",
                    GetCampaignLoginsResponse.class )

    }

    def getCampaignRegion ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/region"

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
                    "GET", "",
                    GetCampaignRegionResponse.class )

    }

    def getCampaignSettings ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/settings"

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
                    "GET", "",
                    GetCampaignSettingsResponse.class )

    }

    def getCampaigns ( Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignsResponse.class )

    }

    def getCampaignsByLogin ( String login, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/by_login/${login}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (login == null) {
            throw new RuntimeException("missing required params login")
        }

        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCampaignsResponse.class )

    }

}
