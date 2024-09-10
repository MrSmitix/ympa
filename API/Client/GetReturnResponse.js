goog.provide('API.Client.GetReturnResponse');

/**
 * @record
 */
API.Client.GetReturnResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetReturnResponse.prototype.status;

/**
 * @type {!API.Client.ReturnDTO}
 * @export
 */
API.Client.GetReturnResponse.prototype.result;

