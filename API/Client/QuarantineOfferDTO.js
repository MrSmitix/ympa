goog.provide('API.Client.QuarantineOfferDTO');

/**
 * Товар в карантине.
 * @record
 */
API.Client.QuarantineOfferDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.QuarantineOfferDTO.prototype.offerId;

/**
 * @type {!API.Client.BasePriceDTO}
 * @export
 */
API.Client.QuarantineOfferDTO.prototype.currentPrice;

/**
 * @type {!API.Client.BasePriceDTO}
 * @export
 */
API.Client.QuarantineOfferDTO.prototype.lastValidPrice;

/**
 * Причины попадания товара в карантин.
 * @type {!Array<!API.Client.PriceQuarantineVerdictDTO>}
 * @export
 */
API.Client.QuarantineOfferDTO.prototype.verdicts;

