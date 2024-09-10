goog.provide('API.Client.OfferRecommendationsResultDTO');

/**
 * Список товаров с рекомендациями.
 * @record
 */
API.Client.OfferRecommendationsResultDTO = function() {}

/**
 * @type {!API.Client.ScrollingPagerDTO}
 * @export
 */
API.Client.OfferRecommendationsResultDTO.prototype.paging;

/**
 * Страница списка товаров.
 * @type {!Array<!API.Client.OfferRecommendationDTO>}
 * @export
 */
API.Client.OfferRecommendationsResultDTO.prototype.offerRecommendations;

