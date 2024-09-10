package model

import play.api.libs.json._

/**
  * Запрос информации о моделях.
  * @param models Список моделей.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetModelsRequest(
  models: List[Long]
)

object GetModelsRequest {
  implicit lazy val getModelsRequestJsonFormat: Format[GetModelsRequest] = Json.format[GetModelsRequest]
}

