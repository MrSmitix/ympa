package model

import play.api.libs.json._

/**
  * Рекомендованная цена.
  * @param campaignId Идентификатор кампании.
  * @param price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceRecommendationItemDTO(
  campaignId: Long,
  price: BigDecimal
)

object PriceRecommendationItemDTO {
  implicit lazy val priceRecommendationItemDTOJsonFormat: Format[PriceRecommendationItemDTO] = Json.format[PriceRecommendationItemDTO]
}

