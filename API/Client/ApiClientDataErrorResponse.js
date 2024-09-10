goog.provide('API.Client.ApiClientDataErrorResponse');

/**
 * Ошибка в данных переданных от клиента.
 * @record
 */
API.Client.ApiClientDataErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiClientDataErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiClientDataErrorResponse.prototype.errors;

