package org.openapitools.server.model


/**
 * Рекомендованная цена.
 *
 * @param campaignId Идентификатор кампании. for example: ''null''
 * @param price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  for example: ''null''
*/
final case class PriceRecommendationItemDTO (
  campaignId: Long,
  price: Double
)

