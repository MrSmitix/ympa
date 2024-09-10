goog.provide('API.Client.GetChatsRequest');

/**
 * Фильтры по чатам, которые нужно вернуть. 
 * @record
 */
API.Client.GetChatsRequest = function() {}

/**
 * Фильтр по идентификаторам заказов на Маркете.
 * @type {!Array<!number>}
 * @export
 */
API.Client.GetChatsRequest.prototype.orderIds;

/**
 * Фильтр по типам чатов.
 * @type {!Array<!API.Client.ChatType>}
 * @export
 */
API.Client.GetChatsRequest.prototype.types;

/**
 * Фильтр по статусам чатов.
 * @type {!Array<!API.Client.ChatStatusType>}
 * @export
 */
API.Client.GetChatsRequest.prototype.statuses;

