goog.provide('API.Client.ConfirmPricesRequest');

/**
 * Запрос на подтверждение цены. 
 * @record
 */
API.Client.ConfirmPricesRequest = function() {}

/**
 * Идентификаторы товаров, у которых подтверждается цена.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConfirmPricesRequest.prototype.offerIds;

