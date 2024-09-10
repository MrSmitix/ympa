goog.provide('API.Client.OfferCardRecommendationDTO');

/**
 * Рекомендация по заполнению карточки товара.
 * @record
 */
API.Client.OfferCardRecommendationDTO = function() {}

/**
 * @type {!API.Client.OfferCardRecommendationType}
 * @export
 */
API.Client.OfferCardRecommendationDTO.prototype.type;

/**
 * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
 * @type {!number}
 * @export
 */
API.Client.OfferCardRecommendationDTO.prototype.percent;

