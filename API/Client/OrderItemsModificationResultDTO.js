goog.provide('API.Client.OrderItemsModificationResultDTO');

/**
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 * @record
 */
API.Client.OrderItemsModificationResultDTO = function() {}

/**
 * Список позиций в заказе, подлежащих маркировке.
 * @type {!Array<!API.Client.BriefOrderItemDTO>}
 * @export
 */
API.Client.OrderItemsModificationResultDTO.prototype.items;

