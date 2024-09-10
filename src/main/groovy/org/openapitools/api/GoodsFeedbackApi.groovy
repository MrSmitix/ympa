package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiClientDataErrorResponse
import org.openapitools.model.ApiForbiddenErrorResponse
import org.openapitools.model.ApiLimitErrorResponse
import org.openapitools.model.ApiNotFoundErrorResponse
import org.openapitools.model.ApiServerErrorResponse
import org.openapitools.model.ApiUnauthorizedErrorResponse
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest
import org.openapitools.model.EmptyApiResponse
import org.openapitools.model.GetGoodsFeedbackCommentsRequest
import org.openapitools.model.GetGoodsFeedbackCommentsResponse
import org.openapitools.model.GetGoodsFeedbackRequest
import org.openapitools.model.GetGoodsFeedbackResponse
import org.openapitools.model.SkipGoodsFeedbackReactionRequest
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse

class GoodsFeedbackApi {
    String basePath = "https://api.partner.market.yandex.ru"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteGoodsFeedbackComment ( Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/comments/delete"

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
        if (deleteGoodsFeedbackCommentRequest == null) {
            throw new RuntimeException("missing required params deleteGoodsFeedbackCommentRequest")
        }



        contentType = 'application/json';
        bodyParams = deleteGoodsFeedbackCommentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def getGoodsFeedbackComments ( Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/comments"

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
        if (getGoodsFeedbackCommentsRequest == null) {
            throw new RuntimeException("missing required params getGoodsFeedbackCommentsRequest")
        }

        if (pageToken != null) {
            queryParams.put("page_token", pageToken)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }


        contentType = 'application/json';
        bodyParams = getGoodsFeedbackCommentsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetGoodsFeedbackCommentsResponse.class )

    }

    def getGoodsFeedbacks ( Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback"

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
        bodyParams = getGoodsFeedbackRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    GetGoodsFeedbackResponse.class )

    }

    def skipGoodsFeedbacksReaction ( Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/skip-reaction"

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
        if (skipGoodsFeedbackReactionRequest == null) {
            throw new RuntimeException("missing required params skipGoodsFeedbackReactionRequest")
        }



        contentType = 'application/json';
        bodyParams = skipGoodsFeedbackReactionRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    EmptyApiResponse.class )

    }

    def updateGoodsFeedbackComment ( Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${businessId}/goods-feedback/comments/update"

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
        if (updateGoodsFeedbackCommentRequest == null) {
            throw new RuntimeException("missing required params updateGoodsFeedbackCommentRequest")
        }



        contentType = 'application/json';
        bodyParams = updateGoodsFeedbackCommentRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateGoodsFeedbackCommentResponse.class )

    }

}
