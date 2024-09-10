goog.provide('API.Client.OrderBoxLayoutItemDTO');

/**
 * Информация о товаре в коробке.
 * @record
 */
API.Client.OrderBoxLayoutItemDTO = function() {}

/**
 * Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
 * @type {!number}
 * @export
 */
API.Client.OrderBoxLayoutItemDTO.prototype.id;

/**
 * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
 * @type {!number}
 * @export
 */
API.Client.OrderBoxLayoutItemDTO.prototype.fullCount;

/**
 * @type {!API.Client.OrderBoxLayoutPartialCountDTO}
 * @export
 */
API.Client.OrderBoxLayoutItemDTO.prototype.partialCount;

/**
 * Переданные вами коды маркировки.
 * @type {!Array<!API.Client.BriefOrderItemInstanceDTO>}
 * @export
 */
API.Client.OrderBoxLayoutItemDTO.prototype.instances;

