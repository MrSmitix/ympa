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

import java.util.List;
import java.util.Map;

public interface GoodsFeedbackApi  {
    Future<ApiResponse<EmptyApiResponse>> deleteGoodsFeedbackComment(Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest);
    Future<ApiResponse<GetGoodsFeedbackCommentsResponse>> getGoodsFeedbackComments(Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit);
    Future<ApiResponse<GetGoodsFeedbackResponse>> getGoodsFeedbacks(Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest);
    Future<ApiResponse<EmptyApiResponse>> skipGoodsFeedbacksReaction(Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest);
    Future<ApiResponse<UpdateGoodsFeedbackCommentResponse>> updateGoodsFeedbackComment(Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest);
}
