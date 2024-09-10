package model

import play.api.libs.json._

/**
  * Ответ на запрос информации о прайс-листе.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetFeedResponse(
  feed: Option[FeedDTO]
)

object GetFeedResponse {
  implicit lazy val getFeedResponseJsonFormat: Format[GetFeedResponse] = Json.format[GetFeedResponse]
}

