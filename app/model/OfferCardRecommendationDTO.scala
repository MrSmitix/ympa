package model

import play.api.libs.json._

/**
  * Рекомендация по заполнению карточки товара.
  * @param percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferCardRecommendationDTO(
  `type`: OfferCardRecommendationType,
  percent: Option[Int]
)

object OfferCardRecommendationDTO {
  implicit lazy val offerCardRecommendationDTOJsonFormat: Format[OfferCardRecommendationDTO] = Json.format[OfferCardRecommendationDTO]
}

