package model

import play.api.libs.json._

/**
  * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
  * @param totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedPlacementDTO(
  status: Option[FeedStatusType],
  totalOffersCount: Option[Int]
)

object FeedPlacementDTO {
  implicit lazy val feedPlacementDTOJsonFormat: Format[FeedPlacementDTO] = Json.format[FeedPlacementDTO]
}

