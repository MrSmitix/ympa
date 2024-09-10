package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.DeletePromoOffersRequest
import model.DeletePromoOffersResponse
import model.GetPromoOffersRequest
import model.GetPromoOffersResponse
import model.GetPromosRequest
import model.GetPromosResponse
import model.UpdatePromoOffersRequest
import model.UpdatePromoOffersResponse

/**
  * Provides a default implementation for [[PromosApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class PromosApiImpl extends PromosApi {
  /**
    * @inheritdoc
    */
  override def deletePromoOffers(businessId: Long, deletePromoOffersRequest: DeletePromoOffersRequest): DeletePromoOffersResponse = {
    // TODO: Implement better logic

    DeletePromoOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getPromoOffers(businessId: Long, getPromoOffersRequest: GetPromoOffersRequest, pageToken: Option[String], limit: Option[Int]): GetPromoOffersResponse = {
    // TODO: Implement better logic

    GetPromoOffersResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getPromos(businessId: Long, getPromosRequest: Option[GetPromosRequest]): GetPromosResponse = {
    // TODO: Implement better logic

    GetPromosResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updatePromoOffers(businessId: Long, updatePromoOffersRequest: UpdatePromoOffersRequest): UpdatePromoOffersResponse = {
    // TODO: Implement better logic

    UpdatePromoOffersResponse(None, None, Map.empty)
  }
}
