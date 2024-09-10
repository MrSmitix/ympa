goog.provide('API.Client.DeleteHiddenOffersRequest');

/**
 * Запрос на возобновление показа оферов.
 * @record
 */
API.Client.DeleteHiddenOffersRequest = function() {}

/**
 * Список скрытых товаров. 
 * @type {!Array<!API.Client.HiddenOfferDTO>}
 * @export
 */
API.Client.DeleteHiddenOffersRequest.prototype.hiddenOffers;

