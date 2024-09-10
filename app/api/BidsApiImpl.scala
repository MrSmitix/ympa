package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetBidsInfoRequest
import model.GetBidsInfoResponse
import model.GetBidsRecommendationsRequest
import model.GetBidsRecommendationsResponse
import model.PutSkuBidsRequest

/**
  * Provides a default implementation for [[BidsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class BidsApiImpl extends BidsApi {
  /**
    * @inheritdoc
    */
  override def getBidsInfoForBusiness(businessId: Long, pageToken: Option[String], limit: Option[Int], getBidsInfoRequest: Option[GetBidsInfoRequest]): GetBidsInfoResponse = {
    // TODO: Implement better logic

    GetBidsInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getBidsRecommendations(businessId: Long, getBidsRecommendationsRequest: GetBidsRecommendationsRequest): GetBidsRecommendationsResponse = {
    // TODO: Implement better logic

    GetBidsRecommendationsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def putBidsForBusiness(businessId: Long, putSkuBidsRequest: PutSkuBidsRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def putBidsForCampaign(campaignId: Long, putSkuBidsRequest: PutSkuBidsRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
