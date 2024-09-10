package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetGoodsStatsRequest
import model.GetGoodsStatsResponse

/**
  * Provides a default implementation for [[GoodsStatsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class GoodsStatsApiImpl extends GoodsStatsApi {
  /**
    * @inheritdoc
    */
  override def getGoodsStats(campaignId: Long, getGoodsStatsRequest: GetGoodsStatsRequest): GetGoodsStatsResponse = {
    // TODO: Implement better logic

    GetGoodsStatsResponse(None, None, Map.empty)
  }
}
