goog.provide('API.Client.GetBidsRecommendationsResponseDTO');

/**
 * Список товаров с рекомендованными ставками.
 * @record
 */
API.Client.GetBidsRecommendationsResponseDTO = function() {}

/**
 * Список товаров с рекомендованными ставками.
 * @type {!Array<!API.Client.SkuBidRecommendationItemDTO>}
 * @export
 */
API.Client.GetBidsRecommendationsResponseDTO.prototype.recommendations;

