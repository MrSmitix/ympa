package api

import model.AddOffersToArchiveRequest
import model.AddOffersToArchiveResponse
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.DeleteOffersFromArchiveRequest
import model.DeleteOffersFromArchiveResponse
import model.DeleteOffersRequest
import model.DeleteOffersResponse
import model.GetOfferMappingsRequest
import model.GetOfferMappingsResponse
import model.GetSuggestedOfferMappingsRequest
import model.GetSuggestedOfferMappingsResponse
import model.UpdateOfferMappingsRequest
import model.UpdateOfferMappingsResponse

/**
  * Provides a default implementation for [[BusinessOfferMappingsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class BusinessOfferMappingsApiImpl extends BusinessOfferMappingsApi {
  /**
    * @inheritdoc
    */
  override def addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): AddOffersToArchiveResponse = {
    // TODO: Implement better logic

    AddOffersToArchiveResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): DeleteOffersResponse = {
    // TODO: Implement better logic

    DeleteOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): DeleteOffersFromArchiveResponse = {
    // TODO: Implement better logic

    DeleteOffersFromArchiveResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOfferMappings(businessId: Long, pageToken: Option[String], limit: Option[Int], getOfferMappingsRequest: Option[GetOfferMappingsRequest]): GetOfferMappingsResponse = {
    // TODO: Implement better logic

    GetOfferMappingsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: Option[GetSuggestedOfferMappingsRequest]): GetSuggestedOfferMappingsResponse = {
    // TODO: Implement better logic

    GetSuggestedOfferMappingsResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): UpdateOfferMappingsResponse = {
    // TODO: Implement better logic

    UpdateOfferMappingsResponse(None, None, Map.empty)
  }
}
