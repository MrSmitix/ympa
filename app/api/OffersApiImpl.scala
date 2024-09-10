package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CurrencyType
import model.DeleteCampaignOffersRequest
import model.DeleteCampaignOffersResponse
import model.EmptyApiResponse
import model.GetAllOffersResponse
import model.GetCampaignOffersRequest
import model.GetCampaignOffersResponse
import model.GetOfferRecommendationsRequest
import model.GetOfferRecommendationsResponse
import model.GetOffersResponse
import model.UpdateCampaignOffersRequest

/**
  * Provides a default implementation for [[OffersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OffersApiImpl extends OffersApi {
  /**
    * @inheritdoc
    */
  override def deleteCampaignOffers(campaignId: Long, deleteCampaignOffersRequest: DeleteCampaignOffersRequest): DeleteCampaignOffersResponse = {
    // TODO: Implement better logic

    DeleteCampaignOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getAllOffers(campaignId: Long, feedId: Option[Long], chunk: Option[Int]): GetAllOffersResponse = {
    // TODO: Implement better logic

    GetAllOffersResponse(List.empty[OfferDTO], Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCampaignOffers(campaignId: Long, getCampaignOffersRequest: GetCampaignOffersRequest, pageToken: Option[String], limit: Option[Int]): GetCampaignOffersResponse = {
    // TODO: Implement better logic

    GetCampaignOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferRecommendations(businessId: Long, getOfferRecommendationsRequest: GetOfferRecommendationsRequest, pageToken: Option[String], limit: Option[Int]): GetOfferRecommendationsResponse = {
    // TODO: Implement better logic

    GetOfferRecommendationsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOffers(campaignId: Long, query: Option[String], feedId: Option[Long], shopCategoryId: Option[String], currency: Option[CurrencyType], matched: Option[Boolean], page: Option[Int], pageSize: Option[Int]): GetOffersResponse = {
    // TODO: Implement better logic

    GetOffersResponse(List.empty[OfferDTO], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateCampaignOffers(campaignId: Long, updateCampaignOffersRequest: UpdateCampaignOffersRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
