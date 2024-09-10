goog.provide('API.Client.ReturnItemDTO');

/**
 * Список товаров в возврате.
 * @record
 */
API.Client.ReturnItemDTO = function() {}

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.ReturnItemDTO.prototype.marketSku;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.ReturnItemDTO.prototype.shopSku;

/**
 * Количество единиц товара.
 * @type {!number}
 * @export
 */
API.Client.ReturnItemDTO.prototype.count;

/**
 * Список решений по возврату.
 * @type {!Array<!API.Client.ReturnDecisionDTO>}
 * @export
 */
API.Client.ReturnItemDTO.prototype.decisions;

/**
 * Список логистических позиций возврата.
 * @type {!Array<!API.Client.ReturnInstanceDTO>}
 * @export
 */
API.Client.ReturnItemDTO.prototype.instances;

/**
 * Список трек-кодов для почтовых отправлений.
 * @type {!Array<!API.Client.TrackDTO>}
 * @export
 */
API.Client.ReturnItemDTO.prototype.tracks;

