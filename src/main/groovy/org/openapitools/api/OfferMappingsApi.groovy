package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiLockedErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetOfferMappingEntriesResponse
import org.openapitools.model.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.model.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.model.OfferAvailabilityStatusType
import org.openapitools.model.OfferMappingKindType
import org.openapitools.model.OfferProcessingStatusType
import org.openapitools.model.UpdateOfferMappingEntryRequest

class OfferMappingsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getOfferMappingEntries ( Long campaignId, List<String> offerId, List<String> shopSku, OfferMappingKindType mappingKind, List<OfferProcessingStatusType> status, List<OfferAvailabilityStatusType> availability, List<Integer> categoryId, List<String> vendor, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-mapping-entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }

        if (offerId != null) {
            queryParams.put("offer_id", offerId)
        }
        if (shopSku != null) {
            queryParams.put("shop_sku", shopSku)
        }
        if (mappingKind != null) {
            queryParams.put("mapping_kind", mappingKind)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (availability != null) {
            queryParams.put("availability", availability)
        }
        if (categoryId != null) {
            queryParams.put("category_id", categoryId)
        }
        if (vendor != null) {
            queryParams.put("vendor", vendor)
        }
        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetOfferMappingEntriesResponse.class )

    }

    def getSuggestedOfferMappingEntries ( Long campaignId, GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-mapping-entries/suggestions"

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
        if (getSuggestedOfferMappingEntriesRequest == null) {
            throw new RuntimeException("missing required params getSuggestedOfferMappingEntriesRequest")
        }



        contentType = 'application/json';
        bodyParams = getSuggestedOfferMappingEntriesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetSuggestedOfferMappingEntriesResponse.class )

    }

    def updateOfferMappingEntries ( Long campaignId, UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/offer-mapping-entries/updates"

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
        if (updateOfferMappingEntryRequest == null) {
            throw new RuntimeException("missing required params updateOfferMappingEntryRequest")
        }



        contentType = 'application/json';
        bodyParams = updateOfferMappingEntryRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
