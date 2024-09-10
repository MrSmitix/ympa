goog.provide('API.Client.AddOffersToArchiveErrorDTO');

/**
 * Товар, который не удалось поместить в архив.
 * @record
 */
API.Client.AddOffersToArchiveErrorDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.AddOffersToArchiveErrorDTO.prototype.offerId;

/**
 * @type {!API.Client.AddOffersToArchiveErrorType}
 * @export
 */
API.Client.AddOffersToArchiveErrorDTO.prototype.error;

