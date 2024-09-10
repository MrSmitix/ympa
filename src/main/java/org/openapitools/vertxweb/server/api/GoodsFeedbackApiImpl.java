package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiClientDataErrorResponse;
import org.openapitools.vertxweb.server.model.ApiForbiddenErrorResponse;
import org.openapitools.vertxweb.server.model.ApiLimitErrorResponse;
import org.openapitools.vertxweb.server.model.ApiNotFoundErrorResponse;
import org.openapitools.vertxweb.server.model.ApiServerErrorResponse;
import org.openapitools.vertxweb.server.model.ApiUnauthorizedErrorResponse;
import org.openapitools.vertxweb.server.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.vertxweb.server.model.EmptyApiResponse;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackRequest;
import org.openapitools.vertxweb.server.model.GetGoodsFeedbackResponse;
import org.openapitools.vertxweb.server.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.vertxweb.server.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.vertxweb.server.model.UpdateGoodsFeedbackCommentResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class GoodsFeedbackApiImpl implements GoodsFeedbackApi {
    public Future<ApiResponse<EmptyApiResponse>> deleteGoodsFeedbackComment(Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetGoodsFeedbackCommentsResponse>> getGoodsFeedbackComments(Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetGoodsFeedbackResponse>> getGoodsFeedbacks(Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EmptyApiResponse>> skipGoodsFeedbacksReaction(Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UpdateGoodsFeedbackCommentResponse>> updateGoodsFeedbackComment(Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
