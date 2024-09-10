package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetWarehouseStocksRequest
import org.openapitools.model.GetWarehouseStocksResponse
import org.openapitools.model.UpdateStocksRequest

class StocksApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getStocks ( Long campaignId, String pageToken, Integer limit, GetWarehouseStocksRequest getWarehouseStocksRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/stocks"

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
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getWarehouseStocksRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetWarehouseStocksResponse.class )

    }

    def updateStocks ( Long campaignId, UpdateStocksRequest updateStocksRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offers/stocks"

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
        if (updateStocksRequest == null) {
            throw new RuntimeException("missing required params updateStocksRequest")
        }



        contentType = 'application/json';
        bodyParams = updateStocksRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    EmptyApiResponse.class )

    }

}
