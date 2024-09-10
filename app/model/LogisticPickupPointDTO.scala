package model

import play.api.libs.json._

/**
  * Описание пункта вывоза для возврата.
  * @param id Идентификатор пункта вывоза.
  * @param name Название пункта вывоза.
  * @param instruction Дополнительные инструкции к вывозу.
  * @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class LogisticPickupPointDTO(
  id: Option[Long],
  name: Option[String],
  address: Option[PickupAddressDTO],
  instruction: Option[String],
  `type`: Option[LogisticPointType],
  logisticPartnerId: Option[Long]
)

object LogisticPickupPointDTO {
  implicit lazy val logisticPickupPointDTOJsonFormat: Format[LogisticPickupPointDTO] = Json.format[LogisticPickupPointDTO]
}

