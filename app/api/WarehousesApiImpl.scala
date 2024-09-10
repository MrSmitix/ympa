package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetFulfillmentWarehousesResponse
import model.GetWarehousesResponse

/**
  * Provides a default implementation for [[WarehousesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class WarehousesApiImpl extends WarehousesApi {
  /**
    * @inheritdoc
    */
  override def getFulfillmentWarehouses(): GetFulfillmentWarehousesResponse = {
    // TODO: Implement better logic

    GetFulfillmentWarehousesResponse(None, None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getWarehouses(businessId: Long): GetWarehousesResponse = {
    // TODO: Implement better logic

    GetWarehousesResponse(None, None, Map.empty)
  }
}
