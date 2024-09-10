goog.provide('API.Client.ApiErrorDTO');

/**
 * Общий формат ошибки.
 * @record
 */
API.Client.ApiErrorDTO = function() {}

/**
 * Код ошибки.
 * @type {!string}
 * @export
 */
API.Client.ApiErrorDTO.prototype.code;

/**
 * Описание ошибки.
 * @type {!string}
 * @export
 */
API.Client.ApiErrorDTO.prototype.message;

