goog.provide('API.Client.OfferRecommendationDTO');

/**
 * Информация о состоянии цен и рекомендации. 
 * @record
 */
API.Client.OfferRecommendationDTO = function() {}

/**
 * @type {!API.Client.OfferForRecommendationDTO}
 * @export
 */
API.Client.OfferRecommendationDTO.prototype.offer;

/**
 * @type {!API.Client.OfferRecommendationInfoDTO}
 * @export
 */
API.Client.OfferRecommendationDTO.prototype.recommendation;

