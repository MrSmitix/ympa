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
import org.openapitools.model.FeedIndexLogsStatusType
import org.openapitools.model.GetFeedIndexLogsResponse
import org.openapitools.model.GetFeedResponse
import org.openapitools.model.GetFeedsResponse
import org.openapitools.model.SetFeedParamsRequest

class FeedsApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getFeed ( Long campaignId, Long feedId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}"

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
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFeedResponse.class )

    }

    def getFeedIndexLogs ( Long campaignId, Long feedId, Integer limit, Date publishedTimeFrom, Date publishedTimeTo, FeedIndexLogsStatusType status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}/index-logs"

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
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (publishedTimeFrom != null) {
            queryParams.put("published_time_from", publishedTimeFrom)
        }
        if (publishedTimeTo != null) {
            queryParams.put("published_time_to", publishedTimeTo)
        }
        if (status != null) {
            queryParams.put("status", status)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFeedIndexLogsResponse.class )

    }

    def getFeeds ( Long campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds"

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
                    GetFeedsResponse.class )

    }

    def refreshFeed ( Long campaignId, Long feedId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}/refresh"

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
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def setFeedParams ( Long campaignId, Long feedId, SetFeedParamsRequest setFeedParamsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/campaigns/${campaignId}/feeds/${feedId}/params"

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
        if (feedId == null) {
            throw new RuntimeException("missing required params feedId")
        }
        // verify required params are set
        if (setFeedParamsRequest == null) {
            throw new RuntimeException("missing required params setFeedParamsRequest")
        }



        contentType = 'application/json';
        bodyParams = setFeedParamsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

}
