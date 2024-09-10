package model

import play.api.libs.json._

/**
  * Рекомендованная ставка и возможная доля показов.
  * @param bid Значение ставки.
  * @param showPercent Доля показов. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class BidRecommendationItemDTO(
  bid: Int,
  showPercent: Long
)

object BidRecommendationItemDTO {
  implicit lazy val bidRecommendationItemDTOJsonFormat: Format[BidRecommendationItemDTO] = Json.format[BidRecommendationItemDTO]
}

