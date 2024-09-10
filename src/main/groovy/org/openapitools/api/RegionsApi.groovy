package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetRegionWithChildrenResponse
import org.openapitools.model.GetRegionsResponse

class RegionsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def searchRegionChildren ( Long regionId, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/regions/${regionId}/children"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }

        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRegionWithChildrenResponse.class )

    }

    def searchRegionsById ( Long regionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/regions/${regionId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRegionsResponse.class )

    }

    def searchRegionsByName ( String name, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/regions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }

        if (name != null) {
            queryParams.put("name", name)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRegionsResponse.class )

    }

}
