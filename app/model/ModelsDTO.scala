package model

import play.api.libs.json._

/**
  * Список моделей товаров.
  * @param models Список моделей товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ModelsDTO(
  models: List[ModelDTO]
)

object ModelsDTO {
  implicit lazy val modelsDTOJsonFormat: Format[ModelsDTO] = Json.format[ModelsDTO]
}

