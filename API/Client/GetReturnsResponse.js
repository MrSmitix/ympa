goog.provide('API.Client.GetReturnsResponse');

/**
 * @record
 */
API.Client.GetReturnsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetReturnsResponse.prototype.status;

/**
 * @type {!API.Client.PagedReturnsDTO}
 * @export
 */
API.Client.GetReturnsResponse.prototype.result;

