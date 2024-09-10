goog.provide('API.Client.OrderItemInstanceModificationDTO');

/**
 * Позиция в корзине, требующая маркировки.
 * @record
 */
API.Client.OrderItemInstanceModificationDTO = function() {}

/**
 * Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemInstanceModificationDTO.prototype.id;

/**
 * Список кодов маркировки единиц товара. 
 * @type {!Array<!API.Client.BriefOrderItemInstanceDTO>}
 * @export
 */
API.Client.OrderItemInstanceModificationDTO.prototype.instances;

