package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetQualityRatingDetailsResponse
import model.GetQualityRatingRequest
import model.GetQualityRatingResponse

/**
  * Provides a default implementation for [[RatingsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class RatingsApiImpl extends RatingsApi {
  /**
    * @inheritdoc
    */
  override def getQualityRatingDetails(campaignId: Long): GetQualityRatingDetailsResponse = {
    // TODO: Implement better logic

    GetQualityRatingDetailsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getQualityRatings(businessId: Long, getQualityRatingRequest: GetQualityRatingRequest): GetQualityRatingResponse = {
    // TODO: Implement better logic

    GetQualityRatingResponse(None, None, Map.empty)
  }
}
