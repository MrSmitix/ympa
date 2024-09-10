goog.provide('API.Client.AddHiddenOffersRequest');

/**
 * Запрос на скрытие оферов.
 * @record
 */
API.Client.AddHiddenOffersRequest = function() {}

/**
 * Список скрытых товаров. 
 * @type {!Array<!API.Client.HiddenOfferDTO>}
 * @export
 */
API.Client.AddHiddenOffersRequest.prototype.hiddenOffers;

