package model

import play.api.libs.json._

/**
  * Информация о последней публикации предложений из прайс-листа на Маркете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedPublicationDTO(
  status: Option[FeedStatusType],
  full: Option[FeedPublicationFullDTO],
  priceAndStockUpdate: Option[FeedPublicationPriceAndStockUpdateDTO]
)

object FeedPublicationDTO {
  implicit lazy val feedPublicationDTOJsonFormat: Format[FeedPublicationDTO] = Json.format[FeedPublicationDTO]
}

