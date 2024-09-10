package api

import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetDeliveryServicesResponse

/**
  * Provides a default implementation for [[DeliveryServicesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
class DeliveryServicesApiImpl extends DeliveryServicesApi {
  /**
    * @inheritdoc
    */
  override def getDeliveryServices(): GetDeliveryServicesResponse = {
    // TODO: Implement better logic

    GetDeliveryServicesResponse(None)
  }
}
