goog.provide('API.Client.ApiServerErrorResponse');

/**
 * Внутренняя ошибка сервера.
 * @record
 */
API.Client.ApiServerErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiServerErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiServerErrorResponse.prototype.errors;

