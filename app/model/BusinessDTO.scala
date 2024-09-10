package model

import play.api.libs.json._

/**
  * Информация о кабинете.
  * @param id Идентификатор кабинета.
  * @param name Название бизнеса.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class BusinessDTO(
  id: Option[Long],
  name: Option[String]
)

object BusinessDTO {
  implicit lazy val businessDTOJsonFormat: Format[BusinessDTO] = Json.format[BusinessDTO]
}

