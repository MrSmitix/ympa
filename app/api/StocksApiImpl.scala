package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.EmptyApiResponse
import model.GetWarehouseStocksRequest
import model.GetWarehouseStocksResponse
import model.UpdateStocksRequest

/**
  * Provides a default implementation for [[StocksApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class StocksApiImpl extends StocksApi {
  /**
    * @inheritdoc
    */
  override def getStocks(campaignId: Long, pageToken: Option[String], limit: Option[Int], getWarehouseStocksRequest: Option[GetWarehouseStocksRequest]): GetWarehouseStocksResponse = {
    // TODO: Implement better logic

    GetWarehouseStocksResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def updateStocks(campaignId: Long, updateStocksRequest: UpdateStocksRequest): EmptyApiResponse = {
    // TODO: Implement better logic

    EmptyApiResponse(None, Map.empty)
  }
}
