package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.ConfirmPricesRequest
import model.EmptyApiResponse
import model.GetQuarantineOffersRequest
import model.GetQuarantineOffersResponse

/**
  * Provides a default implementation for [[PriceQuarantineApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class PriceQuarantineApiImpl extends PriceQuarantineApi {
  /**
    * @inheritdoc
    */
  override def confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): GetQuarantineOffersResponse = {
    // TODO: Implement better logic

    GetQuarantineOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int]): GetQuarantineOffersResponse = {
    // TODO: Implement better logic

    GetQuarantineOffersResponse(None, None, Map.empty)
  }
}
