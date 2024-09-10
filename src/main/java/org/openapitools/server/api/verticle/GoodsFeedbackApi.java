package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GoodsFeedbackApi  {
    //deleteGoodsFeedbackComment
    void deleteGoodsFeedbackComment(Long businessId, DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //getGoodsFeedbackComments
    void getGoodsFeedbackComments(Long businessId, GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest, String pageToken, Integer limit, Handler<AsyncResult<GetGoodsFeedbackCommentsResponse>> handler);

    //getGoodsFeedbacks
    void getGoodsFeedbacks(Long businessId, String pageToken, Integer limit, GetGoodsFeedbackRequest getGoodsFeedbackRequest, Handler<AsyncResult<GetGoodsFeedbackResponse>> handler);

    //skipGoodsFeedbacksReaction
    void skipGoodsFeedbacksReaction(Long businessId, SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest, Handler<AsyncResult<EmptyApiResponse>> handler);

    //updateGoodsFeedbackComment
    void updateGoodsFeedbackComment(Long businessId, UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest, Handler<AsyncResult<UpdateGoodsFeedbackCommentResponse>> handler);

}
