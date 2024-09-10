package model

import play.api.libs.json._

/**
  * Информация о грузоместе.
  * @param id Идентификатор грузоместа.
  * @param fulfilmentId Идентификатор грузового места в информационной системе магазина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderParcelBoxDTO(
  id: Option[Long],
  fulfilmentId: Option[String]
)

object OrderParcelBoxDTO {
  implicit lazy val orderParcelBoxDTOJsonFormat: Format[OrderParcelBoxDTO] = Json.format[OrderParcelBoxDTO]
}

