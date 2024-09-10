package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetOrdersStatsRequest
import model.GetOrdersStatsResponse

/**
  * Provides a default implementation for [[OrdersStatsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class OrdersStatsApiImpl extends OrdersStatsApi {
  /**
    * @inheritdoc
    */
  override def getOrdersStats(campaignId: Long, pageToken: Option[String], limit: Option[Int], getOrdersStatsRequest: Option[GetOrdersStatsRequest]): GetOrdersStatsResponse = {
    // TODO: Implement better logic

    GetOrdersStatsResponse(None, None, Map.empty)
  }
}
