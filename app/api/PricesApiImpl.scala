package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetPricesByOfferIdsRequest
import model.GetPricesByOfferIdsResponse
import model.GetPricesResponse
import model.SuggestPricesRequest
import model.SuggestPricesResponse
import model.UpdateBusinessPricesRequest
import model.UpdatePricesRequest

/**
  * Provides a default implementation for [[PricesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class PricesApiImpl extends PricesApi {
  /**
    * @inheritdoc
    */
  override def getPrices(campaignId: Long, pageToken: Option[String], limit: Option[Int], archived: Option[Boolean]): GetPricesResponse = {
    // TODO: Implement better logic

    GetPricesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getPricesByOfferIds(campaignId: Long, pageToken: Option[String], limit: Option[Int], getPricesByOfferIdsRequest: Option[GetPricesByOfferIdsRequest]): GetPricesByOfferIdsResponse = {
    // TODO: Implement better logic

    GetPricesByOfferIdsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getSuggestedPrices(campaignId: Long, suggestPricesRequest: SuggestPricesRequest): SuggestPricesResponse = {
    // TODO: Implement better logic

    SuggestPricesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateBusinessPrices(businessId: Long, updateBusinessPricesRequest: UpdateBusinessPricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updatePrices(campaignId: Long, updatePricesRequest: UpdatePricesRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
