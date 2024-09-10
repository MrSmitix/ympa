goog.provide('API.Client.ApiNotFoundErrorResponse');

/**
 * Запрашиваемый ресурс не найден.
 * @record
 */
API.Client.ApiNotFoundErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiNotFoundErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiNotFoundErrorResponse.prototype.errors;

