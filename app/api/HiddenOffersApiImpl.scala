package api

import model.AddHiddenOffersRequest
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiLockedErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.DeleteHiddenOffersRequest
import model.EmptyApiResponse
import model.GetHiddenOffersResponse

/**
  * Provides a default implementation for [[HiddenOffersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class HiddenOffersApiImpl extends HiddenOffersApi {
  /**
    * @inheritdoc
    */
  override def addHiddenOffers(campaignId: Long, addHiddenOffersRequest: AddHiddenOffersRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def deleteHiddenOffers(campaignId: Long, deleteHiddenOffersRequest: DeleteHiddenOffersRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getHiddenOffers(campaignId: Long, offerId: Option[List[String]], pageToken: Option[String], limit: Option[Int], offset: Option[Int], page: Option[Int], pageSize: Option[Int]): GetHiddenOffersResponse = {
    // TODO: Implement better logic

    GetHiddenOffersResponse(None, None, Map.empty)
  }
}
