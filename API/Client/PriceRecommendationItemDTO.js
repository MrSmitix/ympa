goog.provide('API.Client.PriceRecommendationItemDTO');

/**
 * Рекомендованная цена.
 * @record
 */
API.Client.PriceRecommendationItemDTO = function() {}

/**
 * Идентификатор кампании.
 * @type {!number}
 * @export
 */
API.Client.PriceRecommendationItemDTO.prototype.campaignId;

/**
 * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
 * @type {!number}
 * @export
 */
API.Client.PriceRecommendationItemDTO.prototype.price;

