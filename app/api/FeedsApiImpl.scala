package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.FeedIndexLogsStatusType
import model.GetFeedIndexLogsResponse
import model.GetFeedResponse
import model.GetFeedsResponse
import java.time.OffsetDateTime
import model.SetFeedParamsRequest

/**
  * Provides a default implementation for [[FeedsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class FeedsApiImpl extends FeedsApi {
  /**
    * @inheritdoc
    */
  override def getFeed(campaignId: Long, feedId: Long): GetFeedResponse = {
    // TODO: Implement better logic

    GetFeedResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def getFeedIndexLogs(campaignId: Long, feedId: Long, limit: Option[Int], publishedTimeFrom: Option[OffsetDateTime], publishedTimeTo: Option[OffsetDateTime], status: Option[FeedIndexLogsStatusType]): GetFeedIndexLogsResponse = {
    // TODO: Implement better logic

    GetFeedIndexLogsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getFeeds(campaignId: Long): GetFeedsResponse = {
    // TODO: Implement better logic

    GetFeedsResponse(List.empty[FeedDTO])
  }

  /**
    * @inheritdoc
    */
  override def refreshFeed(campaignId: Long, feedId: Long): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def setFeedParams(campaignId: Long, feedId: Long, setFeedParamsRequest: SetFeedParamsRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
