goog.provide('API.Client.ApiLimitErrorResponse');

/**
 * Превышено ограничение на доступ к ресурсу.
 * @record
 */
API.Client.ApiLimitErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiLimitErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiLimitErrorResponse.prototype.errors;

