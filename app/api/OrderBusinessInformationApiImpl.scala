package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetBusinessBuyerInfoResponse
import model.GetBusinessDocumentsInfoResponse

/**
  * Provides a default implementation for [[OrderBusinessInformationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OrderBusinessInformationApiImpl extends OrderBusinessInformationApi {
  /**
    * @inheritdoc
    */
  override def getOrderBusinessBuyerInfo(campaignId: Long, orderId: Long): GetBusinessBuyerInfoResponse = {
    // TODO: Implement better logic

    GetBusinessBuyerInfoResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getOrderBusinessDocumentsInfo(campaignId: Long, orderId: Long): GetBusinessDocumentsInfoResponse = {
    // TODO: Implement better logic

    GetBusinessDocumentsInfoResponse(None, None, Map.empty)
  }
}
