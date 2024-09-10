goog.provide('API.Client.CategoryErrorDTO');

/**
 * Текст ошибки.
 * @record
 */
API.Client.CategoryErrorDTO = function() {}

/**
 * Идентификатор категории.
 * @type {!number}
 * @export
 */
API.Client.CategoryErrorDTO.prototype.categoryId;

/**
 * @type {!API.Client.CategoryErrorType}
 * @export
 */
API.Client.CategoryErrorDTO.prototype.type;

