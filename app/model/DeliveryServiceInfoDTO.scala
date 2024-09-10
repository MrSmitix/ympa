package model

import play.api.libs.json._

/**
  * Информация о службе доставки.
  * @param id Идентификатор службы доставки.
  * @param name Наименование службы доставки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeliveryServiceInfoDTO(
  id: Long,
  name: String
)

object DeliveryServiceInfoDTO {
  implicit lazy val deliveryServiceInfoDTOJsonFormat: Format[DeliveryServiceInfoDTO] = Json.format[DeliveryServiceInfoDTO]
}

