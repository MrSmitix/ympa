goog.provide('API.Client.GetPromoPromocodeInfoDTO');

/**
 * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 * @record
 */
API.Client.GetPromoPromocodeInfoDTO = function() {}

/**
 * Промокод.
 * @type {!string}
 * @export
 */
API.Client.GetPromoPromocodeInfoDTO.prototype.promocode;

/**
 * Процент скидки по промокоду.
 * @type {!number}
 * @export
 */
API.Client.GetPromoPromocodeInfoDTO.prototype.discount;

