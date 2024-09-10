goog.provide('API.Client.CreateChatRequest');

/**
 * Заказ, для которого нужно создать чат. 
 * @record
 */
API.Client.CreateChatRequest = function() {}

/**
 * Идентификатор заказа на Маркете.
 * @type {!number}
 * @export
 */
API.Client.CreateChatRequest.prototype.orderId;

