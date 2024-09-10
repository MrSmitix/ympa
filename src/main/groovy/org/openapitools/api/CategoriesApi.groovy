package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetCategoriesMaxSaleQuantumRequest
import org.openapitools.model.GetCategoriesMaxSaleQuantumResponse
import org.openapitools.model.GetCategoriesRequest
import org.openapitools.model.GetCategoriesResponse

class CategoriesApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getCategoriesMaxSaleQuantum ( GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/categories/max-sale-quantum"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (getCategoriesMaxSaleQuantumRequest == null) {
            throw new RuntimeException("missing required params getCategoriesMaxSaleQuantumRequest")
        }



        contentType = 'application/json';
        bodyParams = getCategoriesMaxSaleQuantumRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCategoriesMaxSaleQuantumResponse.class )

    }

    def getCategoriesTree ( GetCategoriesRequest getCategoriesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/categories/tree"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType




        contentType = 'application/json';
        bodyParams = getCategoriesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetCategoriesResponse.class )

    }

}
