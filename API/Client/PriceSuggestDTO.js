goog.provide('API.Client.PriceSuggestDTO');

/**
 * Тип цены.
 * @record
 */
API.Client.PriceSuggestDTO = function() {}

/**
 * @type {!API.Client.PriceSuggestType}
 * @export
 */
API.Client.PriceSuggestDTO.prototype.type;

/**
 * Цена в рублях.
 * @type {!number}
 * @export
 */
API.Client.PriceSuggestDTO.prototype.price;

