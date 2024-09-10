package model

import play.api.libs.json._

/**
  * Ответ на запрос списка прайс-листов.
  * @param feeds Список прайс-листов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetFeedsResponse(
  feeds: List[FeedDTO]
)

object GetFeedsResponse {
  implicit lazy val getFeedsResponseJsonFormat: Format[GetFeedsResponse] = Json.format[GetFeedsResponse]
}

