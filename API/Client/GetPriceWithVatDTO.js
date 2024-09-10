goog.provide('API.Client.GetPriceWithVatDTO');

/**
 * Цена с указанием ставки НДС и времени последнего обновления.
 * @record
 */
API.Client.GetPriceWithVatDTO = function() {}

/**
 * Цена на товар.
 * @type {!number}
 * @export
 */
API.Client.GetPriceWithVatDTO.prototype.value;

/**
 * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 * @type {!number}
 * @export
 */
API.Client.GetPriceWithVatDTO.prototype.discountBase;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.GetPriceWithVatDTO.prototype.currencyId;

/**
 * Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
 * @type {!number}
 * @export
 */
API.Client.GetPriceWithVatDTO.prototype.vat;

/**
 * Время последнего обновления.
 * @type {!Date}
 * @export
 */
API.Client.GetPriceWithVatDTO.prototype.updatedAt;

