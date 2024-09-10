package model

import play.api.libs.json._

/**
  * Информация о службах доставки.
  * @param deliveryService Информация о службе доставки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeliveryServicesDTO(
  deliveryService: List[DeliveryServiceInfoDTO]
)

object DeliveryServicesDTO {
  implicit lazy val deliveryServicesDTOJsonFormat: Format[DeliveryServicesDTO] = Json.format[DeliveryServicesDTO]
}

