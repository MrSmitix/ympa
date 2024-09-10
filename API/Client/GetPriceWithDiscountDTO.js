goog.provide('API.Client.GetPriceWithDiscountDTO');

/**
 * Цена с указанием скидки и времени последнего обновления.
 * @record
 */
API.Client.GetPriceWithDiscountDTO = function() {}

/**
 * Значение.
 * @type {!number}
 * @export
 */
API.Client.GetPriceWithDiscountDTO.prototype.value;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.GetPriceWithDiscountDTO.prototype.currencyId;

/**
 * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 * @type {!number}
 * @export
 */
API.Client.GetPriceWithDiscountDTO.prototype.discountBase;

/**
 * Время последнего обновления.
 * @type {!Date}
 * @export
 */
API.Client.GetPriceWithDiscountDTO.prototype.updatedAt;

