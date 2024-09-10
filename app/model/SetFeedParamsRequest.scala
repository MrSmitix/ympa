package model

import play.api.libs.json._

/**
  * Запрос на обновление изменение параметров прайс-листа.
  * @param parameters Параметры прайс-листа.  Обязательный параметр. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SetFeedParamsRequest(
  parameters: List[FeedParameterDTO]
)

object SetFeedParamsRequest {
  implicit lazy val setFeedParamsRequestJsonFormat: Format[SetFeedParamsRequest] = Json.format[SetFeedParamsRequest]
}

