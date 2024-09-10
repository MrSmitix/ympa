goog.provide('API.Client.CreateChatResponse');

/**
 * Результат создания чата.
 * @record
 */
API.Client.CreateChatResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.CreateChatResponse.prototype.status;

/**
 * @type {!API.Client.CreateChatResultDTO}
 * @export
 */
API.Client.CreateChatResponse.prototype.result;

