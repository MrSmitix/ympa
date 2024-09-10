package model

import play.api.libs.json._

/**
  * Единица измерения.
  * @param id Идентификатор единицы измерения.
  * @param name Сокращенное название единицы измерения.
  * @param fullName Полное название единицы измерения.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UnitDTO(
  id: Long,
  name: String,
  fullName: String
)

object UnitDTO {
  implicit lazy val unitDTOJsonFormat: Format[UnitDTO] = Json.format[UnitDTO]
}

