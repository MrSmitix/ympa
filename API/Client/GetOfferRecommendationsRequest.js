goog.provide('API.Client.GetOfferRecommendationsRequest');

/**
 * @record
 */
API.Client.GetOfferRecommendationsRequest = function() {}

/**
 * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetOfferRecommendationsRequest.prototype.offerIds;

/**
 * @type {!API.Client.FieldStateType}
 * @export
 */
API.Client.GetOfferRecommendationsRequest.prototype.cofinancePriceFilter;

/**
 * @type {!API.Client.FieldStateType}
 * @export
 */
API.Client.GetOfferRecommendationsRequest.prototype.recommendedCofinancePriceFilter;

/**
 * @type {!API.Client.PriceCompetitivenessType}
 * @export
 */
API.Client.GetOfferRecommendationsRequest.prototype.competitivenessFilter;

