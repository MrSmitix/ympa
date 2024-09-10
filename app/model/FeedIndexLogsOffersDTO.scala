package model

import play.api.libs.json._

/**
  * Информация о предложениях прайс-листа.
  * @param rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
  * @param totalCount Количество предложений в прайс-листе.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedIndexLogsOffersDTO(
  rejectedCount: Option[Long],
  totalCount: Option[Long]
)

object FeedIndexLogsOffersDTO {
  implicit lazy val feedIndexLogsOffersDTOJsonFormat: Format[FeedIndexLogsOffersDTO] = Json.format[FeedIndexLogsOffersDTO]
}

