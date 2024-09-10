goog.provide('API.Client.BusinessSettingsDTO');

/**
 * Настройки кабинета.
 * @record
 */
API.Client.BusinessSettingsDTO = function() {}

/**
 * Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
 * @type {!boolean}
 * @export
 */
API.Client.BusinessSettingsDTO.prototype.onlyDefaultPrice;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.BusinessSettingsDTO.prototype.currency;

