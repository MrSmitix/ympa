package model

import play.api.libs.json._

/**
  * Список товаров с рекомендациями.
  * @param offerRecommendations Страница списка товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferRecommendationsResultDTO(
  paging: Option[ScrollingPagerDTO],
  offerRecommendations: List[OfferRecommendationDTO]
)

object OfferRecommendationsResultDTO {
  implicit lazy val offerRecommendationsResultDTOJsonFormat: Format[OfferRecommendationsResultDTO] = Json.format[OfferRecommendationsResultDTO]
}

