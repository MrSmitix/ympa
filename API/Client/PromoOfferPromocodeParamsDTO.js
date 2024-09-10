goog.provide('API.Client.PromoOfferPromocodeParamsDTO');

/**
 * Параметры товара в акции с типом `MARKET_PROMOCODE`.
 * @record
 */
API.Client.PromoOfferPromocodeParamsDTO = function() {}

/**
 * Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
 * @type {!number}
 * @export
 */
API.Client.PromoOfferPromocodeParamsDTO.prototype.maxPrice;

