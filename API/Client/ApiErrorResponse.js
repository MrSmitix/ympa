goog.provide('API.Client.ApiErrorResponse');

/**
 * Стандартная обертка для ошибок сервера.
 * @record
 */
API.Client.ApiErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiErrorResponse.prototype.errors;

