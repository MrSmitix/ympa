package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetOfferMappingEntriesResponse
import model.GetSuggestedOfferMappingEntriesRequest
import model.GetSuggestedOfferMappingEntriesResponse
import model.OfferAvailabilityStatusType
import model.OfferMappingKindType
import model.OfferProcessingStatusType
import model.UpdateOfferMappingEntryRequest

/**
  * Provides a default implementation for [[OfferMappingsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OfferMappingsApiImpl extends OfferMappingsApi {
  /**
    * @inheritdoc
    */
  override def getOfferMappingEntries(campaignId: Long, offerId: Option[List[String]], shopSku: Option[List[String]], mappingKind: Option[OfferMappingKindType], status: Option[List[OfferProcessingStatusType]], availability: Option[List[OfferAvailabilityStatusType]], categoryId: Option[List[Int]], vendor: Option[List[String]], pageToken: Option[String], limit: Option[Int]): GetOfferMappingEntriesResponse = {
    // TODO: Implement better logic

    GetOfferMappingEntriesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest): GetSuggestedOfferMappingEntriesResponse = {
    // TODO: Implement better logic

    GetSuggestedOfferMappingEntriesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
