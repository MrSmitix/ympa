package model

import play.api.libs.json._

/**
  * Информация о состоянии цен и рекомендации. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferRecommendationDTO(
  offer: Option[OfferForRecommendationDTO],
  recommendation: Option[OfferRecommendationInfoDTO]
)

object OfferRecommendationDTO {
  implicit lazy val offerRecommendationDTOJsonFormat: Format[OfferRecommendationDTO] = Json.format[OfferRecommendationDTO]
}

