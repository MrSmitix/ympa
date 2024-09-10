package model

import play.api.libs.json._

/**
  * Информация о прайс-листе.
  * @param id Идентификатор прайс-листа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedIndexLogsFeedDTO(
  id: Option[Long]
)

object FeedIndexLogsFeedDTO {
  implicit lazy val feedIndexLogsFeedDTOJsonFormat: Format[FeedIndexLogsFeedDTO] = Json.format[FeedIndexLogsFeedDTO]
}

