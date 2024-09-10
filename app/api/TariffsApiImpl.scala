package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.CalculateTariffsRequest
import model.CalculateTariffsResponse

/**
  * Provides a default implementation for [[TariffsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class TariffsApiImpl extends TariffsApi {
  /**
    * @inheritdoc
    */
  override def calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest): CalculateTariffsResponse = {
    // TODO: Implement better logic

    CalculateTariffsResponse(None, None, Map.empty)
  }
}
