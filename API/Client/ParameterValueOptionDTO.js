goog.provide('API.Client.ParameterValueOptionDTO');

/**
 * Значение характеристики.
 * @record
 */
API.Client.ParameterValueOptionDTO = function() {}

/**
 * Идентификатор значения.
 * @type {!number}
 * @export
 */
API.Client.ParameterValueOptionDTO.prototype.id;

/**
 * Значение.
 * @type {!string}
 * @export
 */
API.Client.ParameterValueOptionDTO.prototype.value;

/**
 * Описание значения.
 * @type {!string}
 * @export
 */
API.Client.ParameterValueOptionDTO.prototype.description;

