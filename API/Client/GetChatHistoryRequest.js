goog.provide('API.Client.GetChatHistoryRequest');

/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 * @record
 */
API.Client.GetChatHistoryRequest = function() {}

/**
 * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
 * @type {!number}
 * @export
 */
API.Client.GetChatHistoryRequest.prototype.messageIdFrom;

