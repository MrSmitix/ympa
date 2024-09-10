goog.provide('API.Client.GetPriceDTO');

/**
 * Цена с указанием времени последнего обновления.
 * @record
 */
API.Client.GetPriceDTO = function() {}

/**
 * Значение.
 * @type {!number}
 * @export
 */
API.Client.GetPriceDTO.prototype.value;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.GetPriceDTO.prototype.currencyId;

/**
 * Время последнего обновления.
 * @type {!Date}
 * @export
 */
API.Client.GetPriceDTO.prototype.updatedAt;

