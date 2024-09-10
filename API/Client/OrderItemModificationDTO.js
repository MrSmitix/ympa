goog.provide('API.Client.OrderItemModificationDTO');

/**
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 * @record
 */
API.Client.OrderItemModificationDTO = function() {}

/**
 * Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
 * @type {!number}
 * @export
 */
API.Client.OrderItemModificationDTO.prototype.id;

/**
 * Новое количество товара.
 * @type {!number}
 * @export
 */
API.Client.OrderItemModificationDTO.prototype.count;

/**
 * Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
 * @type {!Array<!API.Client.BriefOrderItemInstanceDTO>}
 * @export
 */
API.Client.OrderItemModificationDTO.prototype.instances;

