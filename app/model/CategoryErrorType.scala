package model

import play.api.libs.json._

/**
  * Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CategoryErrorType(
)

object CategoryErrorType {
  implicit lazy val categoryErrorTypeJsonFormat: Format[CategoryErrorType] = Json.format[CategoryErrorType]
}

