package model

import play.api.libs.json._

/**
  * Текст ошибки.
  * @param categoryId Идентификатор категории.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CategoryErrorDTO(
  categoryId: Option[Long],
  `type`: Option[CategoryErrorType]
)

object CategoryErrorDTO {
  implicit lazy val categoryErrorDTOJsonFormat: Format[CategoryErrorDTO] = Json.format[CategoryErrorDTO]
}

