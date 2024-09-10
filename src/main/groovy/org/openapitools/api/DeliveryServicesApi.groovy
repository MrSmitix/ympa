package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.GetDeliveryServicesResponse

class DeliveryServicesApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getDeliveryServices ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/delivery/services"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetDeliveryServicesResponse.class )

    }

}
