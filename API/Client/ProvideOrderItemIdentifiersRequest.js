goog.provide('API.Client.ProvideOrderItemIdentifiersRequest');

/**
 * @record
 */
API.Client.ProvideOrderItemIdentifiersRequest = function() {}

/**
 * Список позиций, требующих маркировки. 
 * @type {!Array<!API.Client.OrderItemInstanceModificationDTO>}
 * @export
 */
API.Client.ProvideOrderItemIdentifiersRequest.prototype.items;

