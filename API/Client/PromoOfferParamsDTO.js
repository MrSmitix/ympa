goog.provide('API.Client.PromoOfferParamsDTO');

/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 * @record
 */
API.Client.PromoOfferParamsDTO = function() {}

/**
 * @type {!API.Client.PromoOfferDiscountParamsDTO}
 * @export
 */
API.Client.PromoOfferParamsDTO.prototype.discountParams;

/**
 * @type {!API.Client.PromoOfferPromocodeParamsDTO}
 * @export
 */
API.Client.PromoOfferParamsDTO.prototype.promocodeParams;

