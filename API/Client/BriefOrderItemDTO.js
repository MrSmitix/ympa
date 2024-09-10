goog.provide('API.Client.BriefOrderItemDTO');

/**
 * Информация о маркированном товаре.
 * @record
 */
API.Client.BriefOrderItemDTO = function() {}

/**
 * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
 * @type {!number}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.id;

/**
 * @type {!API.Client.OrderVatType}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.vat;

/**
 * Количество единиц товара.
 * @type {!number}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.count;

/**
 * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
 * @type {!number}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.price;

/**
 * Название товара.
 * @type {!string}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.offerName;

/**
 * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @type {!string}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.offerId;

/**
 * Переданные вами коды маркировки.
 * @type {!Array<!API.Client.OrderItemInstanceDTO>}
 * @export
 */
API.Client.BriefOrderItemDTO.prototype.instances;

