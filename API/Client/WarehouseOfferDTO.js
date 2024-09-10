goog.provide('API.Client.WarehouseOfferDTO');

/**
 * Информация об остатках товара.
 * @record
 */
API.Client.WarehouseOfferDTO = function() {}

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.WarehouseOfferDTO.prototype.offerId;

/**
 * @type {!API.Client.TurnoverDTO}
 * @export
 */
API.Client.WarehouseOfferDTO.prototype.turnoverSummary;

/**
 * Информация об остатках.
 * @type {!Array<!API.Client.WarehouseStockDTO>}
 * @export
 */
API.Client.WarehouseOfferDTO.prototype.stocks;

/**
 * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.WarehouseOfferDTO.prototype.updatedAt;

