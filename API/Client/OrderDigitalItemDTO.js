goog.provide('API.Client.OrderDigitalItemDTO');

/**
 * Ключ цифрового товара.
 * @record
 */
API.Client.OrderDigitalItemDTO = function() {}

/**
 * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
 * @type {!number}
 * @export
 */
API.Client.OrderDigitalItemDTO.prototype.id;

/**
 * Сам ключ.
 * @type {!string}
 * @export
 */
API.Client.OrderDigitalItemDTO.prototype.code;

/**
 * Инструкция по активации.
 * @type {!string}
 * @export
 */
API.Client.OrderDigitalItemDTO.prototype.slip;

/**
 * Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @type {!API.Client.date}
 * @export
 */
API.Client.OrderDigitalItemDTO.prototype.activateTill;

