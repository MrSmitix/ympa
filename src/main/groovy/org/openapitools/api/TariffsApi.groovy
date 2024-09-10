package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.CalculateTariffsRequest
import org.openapitools.model.CalculateTariffsResponse

class TariffsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def calculateTariffs ( CalculateTariffsRequest calculateTariffsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/tariffs/calculate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (calculateTariffsRequest == null) {
            throw new RuntimeException("missing required params calculateTariffsRequest")
        }



        contentType = 'application/json';
        bodyParams = calculateTariffsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CalculateTariffsResponse.class )

    }

}
