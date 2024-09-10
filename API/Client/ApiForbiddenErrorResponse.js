goog.provide('API.Client.ApiForbiddenErrorResponse');

/**
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 * @record
 */
API.Client.ApiForbiddenErrorResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.ApiForbiddenErrorResponse.prototype.status;

/**
 * Список ошибок.
 * @type {!Array<!API.Client.ApiErrorDTO>}
 * @export
 */
API.Client.ApiForbiddenErrorResponse.prototype.errors;

