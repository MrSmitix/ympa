goog.provide('API.Client.UpdateOfferContentRequest');

/**
 * Запрос на установку новых значений для параметров.
 * @record
 */
API.Client.UpdateOfferContentRequest = function() {}

/**
 * Список товаров с указанными характеристиками.
 * @type {!Array<!API.Client.OfferContentDTO>}
 * @export
 */
API.Client.UpdateOfferContentRequest.prototype.offersContent;

