goog.provide('API.Client.PromoOfferDiscountParamsDTO');

/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 * @record
 */
API.Client.PromoOfferDiscountParamsDTO = function() {}

/**
 * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
 * @type {!number}
 * @export
 */
API.Client.PromoOfferDiscountParamsDTO.prototype.price;

/**
 * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
 * @type {!number}
 * @export
 */
API.Client.PromoOfferDiscountParamsDTO.prototype.promoPrice;

/**
 * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
 * @type {!number}
 * @export
 */
API.Client.PromoOfferDiscountParamsDTO.prototype.maxPromoPrice;

