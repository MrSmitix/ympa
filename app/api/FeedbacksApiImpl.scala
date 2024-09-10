package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetFeedbackListResponse
import java.time.LocalDate

/**
  * Provides a default implementation for [[FeedbacksApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class FeedbacksApiImpl extends FeedbacksApi {
  /**
    * @inheritdoc
    */
  override def getFeedbackAndCommentUpdates(campaignId: Long, pageToken: Option[String], limit: Option[Int], fromDate: Option[LocalDate]): GetFeedbackListResponse = {
    // TODO: Implement better logic

    GetFeedbackListResponse(None, None, Map.empty)
  }
}
