goog.provide('API.Client.BasePriceDTO');

/**
 * Цена на товар.
 * @record
 */
API.Client.BasePriceDTO = function() {}

/**
 * Значение.
 * @type {!number}
 * @export
 */
API.Client.BasePriceDTO.prototype.value;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.BasePriceDTO.prototype.currencyId;

