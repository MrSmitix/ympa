goog.provide('API.Client.GetChatHistoryResponse');

/**
 * @record
 */
API.Client.GetChatHistoryResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetChatHistoryResponse.prototype.status;

/**
 * @type {!API.Client.ChatMessagesResultDTO}
 * @export
 */
API.Client.GetChatHistoryResponse.prototype.result;

