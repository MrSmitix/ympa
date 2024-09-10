goog.provide('API.Client.GetPromoOffersRequest');

/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 * @record
 */
API.Client.GetPromoOffersRequest = function() {}

/**
 * Идентификатор акции.
 * @type {!string}
 * @export
 */
API.Client.GetPromoOffersRequest.prototype.promoId;

/**
 * @type {!API.Client.PromoOfferParticipationStatusFilterType}
 * @export
 */
API.Client.GetPromoOffersRequest.prototype.statusType;

