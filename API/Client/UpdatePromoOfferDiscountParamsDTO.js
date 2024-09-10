goog.provide('API.Client.UpdatePromoOfferDiscountParamsDTO');

/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 * @record
 */
API.Client.UpdatePromoOfferDiscountParamsDTO = function() {}

/**
 * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
 * @type {!number}
 * @export
 */
API.Client.UpdatePromoOfferDiscountParamsDTO.prototype.price;

/**
 * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
 * @type {!number}
 * @export
 */
API.Client.UpdatePromoOfferDiscountParamsDTO.prototype.promoPrice;

