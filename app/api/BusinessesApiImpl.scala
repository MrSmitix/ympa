package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetBusinessSettingsResponse

/**
  * Provides a default implementation for [[BusinessesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class BusinessesApiImpl extends BusinessesApi {
  /**
    * @inheritdoc
    */
  override def getBusinessSettings(businessId: Long): GetBusinessSettingsResponse = {
    // TODO: Implement better logic

    GetBusinessSettingsResponse(None, None, Map.empty)
  }
}
