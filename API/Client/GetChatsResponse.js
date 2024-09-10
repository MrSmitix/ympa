goog.provide('API.Client.GetChatsResponse');

/**
 * @record
 */
API.Client.GetChatsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetChatsResponse.prototype.status;

/**
 * @type {!API.Client.GetChatsInfoDTO}
 * @export
 */
API.Client.GetChatsResponse.prototype.result;

