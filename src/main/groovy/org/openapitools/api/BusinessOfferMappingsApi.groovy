package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AddOffersToArchiveRequest
import org.openapitools.model.AddOffersToArchiveResponse
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.DeleteOffersFromArchiveRequest
import org.openapitools.model.DeleteOffersFromArchiveResponse
import org.openapitools.model.DeleteOffersRequest
import org.openapitools.model.DeleteOffersResponse
import org.openapitools.model.GetOfferMappingsRequest
import org.openapitools.model.GetOfferMappingsResponse
import org.openapitools.model.GetSuggestedOfferMappingsRequest
import org.openapitools.model.GetSuggestedOfferMappingsResponse
import org.openapitools.model.UpdateOfferMappingsRequest
import org.openapitools.model.UpdateOfferMappingsResponse

class BusinessOfferMappingsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addOffersToArchive ( Long businessId, AddOffersToArchiveRequest addOffersToArchiveRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/archive"

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
        if (addOffersToArchiveRequest == null) {
            throw new RuntimeException("missing required params addOffersToArchiveRequest")
        }



        contentType = 'application/json';
        bodyParams = addOffersToArchiveRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AddOffersToArchiveResponse.class )

    }

    def deleteOffers ( Long businessId, DeleteOffersRequest deleteOffersRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/delete"

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
        if (deleteOffersRequest == null) {
            throw new RuntimeException("missing required params deleteOffersRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteOffersRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeleteOffersResponse.class )

    }

    def deleteOffersFromArchive ( Long businessId, DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/unarchive"

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
        if (deleteOffersFromArchiveRequest == null) {
            throw new RuntimeException("missing required params deleteOffersFromArchiveRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteOffersFromArchiveRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    DeleteOffersFromArchiveResponse.class )

    }

    def getOfferMappings ( Long businessId, String pageToken, Integer limit, GetOfferMappingsRequest getOfferMappingsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getOfferMappingsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetOfferMappingsResponse.class )

    }

    def getSuggestedOfferMappings ( Long businessId, GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/suggestions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }



        contentType = 'application/json';
        bodyParams = getSuggestedOfferMappingsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetSuggestedOfferMappingsResponse.class )

    }

    def updateOfferMappings ( Long businessId, UpdateOfferMappingsRequest updateOfferMappingsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/offer-mappings/update"

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
        if (updateOfferMappingsRequest == null) {
            throw new RuntimeException("missing required params updateOfferMappingsRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOfferMappingsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateOfferMappingsResponse.class )

    }

}
