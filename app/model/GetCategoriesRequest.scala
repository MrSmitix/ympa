package model

import play.api.libs.json._

/**
  * Параметры запроса категорий. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCategoriesRequest(
  language: Option[LanguageType]
)

object GetCategoriesRequest {
  implicit lazy val getCategoriesRequestJsonFormat: Format[GetCategoriesRequest] = Json.format[GetCategoriesRequest]
}

