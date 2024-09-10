package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetCategoriesMaxSaleQuantumRequest
import model.GetCategoriesMaxSaleQuantumResponse
import model.GetCategoriesRequest
import model.GetCategoriesResponse

/**
  * Provides a default implementation for [[CategoriesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class CategoriesApiImpl extends CategoriesApi {
  /**
    * @inheritdoc
    */
  override def getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): GetCategoriesMaxSaleQuantumResponse = {
    // TODO: Implement better logic

    GetCategoriesMaxSaleQuantumResponse(None, List.empty[MaxSaleQuantumDTO], None, Map.empty)
  }

  /**
    * @inheritdoc
    */
  override def getCategoriesTree(getCategoriesRequest: Option[GetCategoriesRequest]): GetCategoriesResponse = {
    // TODO: Implement better logic

    GetCategoriesResponse(None, None, Map.empty)
  }
}
