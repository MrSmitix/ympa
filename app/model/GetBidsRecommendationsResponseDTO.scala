package model

import play.api.libs.json._

/**
  * Список товаров с рекомендованными ставками.
  * @param recommendations Список товаров с рекомендованными ставками.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetBidsRecommendationsResponseDTO(
  recommendations: List[SkuBidRecommendationItemDTO]
)

object GetBidsRecommendationsResponseDTO {
  implicit lazy val getBidsRecommendationsResponseDTOJsonFormat: Format[GetBidsRecommendationsResponseDTO] = Json.format[GetBidsRecommendationsResponseDTO]
}

