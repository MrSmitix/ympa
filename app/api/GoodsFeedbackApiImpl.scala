package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.DeleteGoodsFeedbackCommentRequest
import model.EmptyApiResponse
import model.GetGoodsFeedbackCommentsRequest
import model.GetGoodsFeedbackCommentsResponse
import model.GetGoodsFeedbackRequest
import model.GetGoodsFeedbackResponse
import model.SkipGoodsFeedbackReactionRequest
import model.UpdateGoodsFeedbackCommentRequest
import model.UpdateGoodsFeedbackCommentResponse

/**
  * Provides a default implementation for [[GoodsFeedbackApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class GoodsFeedbackApiImpl extends GoodsFeedbackApi {
  /**
    * @inheritdoc
    */
  override def deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String], limit: Option[Int]): GetGoodsFeedbackCommentsResponse = {
    // TODO: Implement better logic

    GetGoodsFeedbackCommentsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getGoodsFeedbacks(businessId: Long, pageToken: Option[String], limit: Option[Int], getGoodsFeedbackRequest: Option[GetGoodsFeedbackRequest]): GetGoodsFeedbackResponse = {
    // TODO: Implement better logic

    GetGoodsFeedbackResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): UpdateGoodsFeedbackCommentResponse = {
    // TODO: Implement better logic

    UpdateGoodsFeedbackCommentResponse(None, None, Map.empty)
  }
}
