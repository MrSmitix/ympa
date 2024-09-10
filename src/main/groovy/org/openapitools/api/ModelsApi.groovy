package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.CurrencyType
import org.openapitools.model.GetModelsOffersResponse
import org.openapitools.model.GetModelsRequest
import org.openapitools.model.GetModelsResponse
import org.openapitools.model.SearchModelsResponse
import org.openapitools.model.SortOrderType

class ModelsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getModel ( Long modelId, Long regionId, CurrencyType currency, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/${modelId}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (modelId == null) {
            throw new RuntimeException("missing required params modelId")
        }
        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }

        if (regionId != null) {
            queryParams.put("regionId", regionId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetModelsResponse.class )

    }

    def getModelOffers ( Long modelId, Long regionId, CurrencyType currency, SortOrderType orderByPrice, Integer count, Integer page, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/${modelId}/offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (modelId == null) {
            throw new RuntimeException("missing required params modelId")
        }
        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }

        if (regionId != null) {
            queryParams.put("regionId", regionId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }
        if (orderByPrice != null) {
            queryParams.put("orderByPrice", orderByPrice)
        }
        if (count != null) {
            queryParams.put("count", count)
        }
        if (page != null) {
            queryParams.put("page", page)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetModelsOffersResponse.class )

    }

    def getModels ( Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }
        // verify required params are set
        if (getModelsRequest == null) {
            throw new RuntimeException("missing required params getModelsRequest")
        }

        if (regionId != null) {
            queryParams.put("regionId", regionId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }


        contentType = 'application/json';
        bodyParams = getModelsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetModelsResponse.class )

    }

    def getModelsOffers ( Long regionId, GetModelsRequest getModelsRequest, CurrencyType currency, SortOrderType orderByPrice, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models/offers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }
        // verify required params are set
        if (getModelsRequest == null) {
            throw new RuntimeException("missing required params getModelsRequest")
        }

        if (regionId != null) {
            queryParams.put("regionId", regionId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }
        if (orderByPrice != null) {
            queryParams.put("orderByPrice", orderByPrice)
        }


        contentType = 'application/json';
        bodyParams = getModelsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetModelsOffersResponse.class )

    }

    def searchModels ( String query, Long regionId, CurrencyType currency, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/models"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (query == null) {
            throw new RuntimeException("missing required params query")
        }
        // verify required params are set
        if (regionId == null) {
            throw new RuntimeException("missing required params regionId")
        }

        if (query != null) {
            queryParams.put("query", query)
        }
        if (regionId != null) {
            queryParams.put("regionId", regionId)
        }
        if (currency != null) {
            queryParams.put("currency", currency)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    SearchModelsResponse.class )

    }

}
