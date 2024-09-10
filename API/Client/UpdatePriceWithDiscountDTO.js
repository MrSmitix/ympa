goog.provide('API.Client.UpdatePriceWithDiscountDTO');

/**
 * Цена с указанием скидки.
 * @record
 */
API.Client.UpdatePriceWithDiscountDTO = function() {}

/**
 * Значение.
 * @type {!number}
 * @export
 */
API.Client.UpdatePriceWithDiscountDTO.prototype.value;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.UpdatePriceWithDiscountDTO.prototype.currencyId;

/**
 * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 * @type {!number}
 * @export
 */
API.Client.UpdatePriceWithDiscountDTO.prototype.discountBase;

