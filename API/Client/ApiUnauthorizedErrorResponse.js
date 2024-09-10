goog.provide('API.Client.ApiUnauthorizedErrorResponse');

/**
 * В запросе не указаны авторизационные данные.
 * @record
 */
API.Client.ApiUnauthorizedErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiUnauthorizedErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiUnauthorizedErrorResponse.prototype.errors;

