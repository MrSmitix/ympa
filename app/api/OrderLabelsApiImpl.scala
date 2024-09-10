package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetOrderLabelsDataResponse
import model.PageFormatType
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[OrderLabelsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OrderLabelsApiImpl extends OrderLabelsApi {
  /**
    * @inheritdoc
    */
  override def generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): TemporaryFile = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def getOrderLabelsData(campaignId: Long, orderId: Long): GetOrderLabelsDataResponse = {
    // TODO: Implement better logic

    GetOrderLabelsDataResponse(None, None, Map.empty)
  }
}
