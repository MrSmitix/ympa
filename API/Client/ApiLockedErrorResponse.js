goog.provide('API.Client.ApiLockedErrorResponse');

/**
 * Ресурс из запроса заблокирован от применения к нему указанного метода.
 * @record
 */
API.Client.ApiLockedErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiLockedErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiLockedErrorResponse.prototype.errors;

