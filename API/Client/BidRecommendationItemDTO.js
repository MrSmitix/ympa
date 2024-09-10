goog.provide('API.Client.BidRecommendationItemDTO');

/**
 * Рекомендованная ставка и возможная доля показов.
 * @record
 */
API.Client.BidRecommendationItemDTO = function() {}

/**
 * Значение ставки.
 * @type {!number}
 * @export
 */
API.Client.BidRecommendationItemDTO.prototype.bid;

/**
 * Доля показов. 
 * @type {!number}
 * @export
 */
API.Client.BidRecommendationItemDTO.prototype.showPercent;

