goog.provide('API.Client.ParameterValueConstraintsDTO');

/**
 * Ограничения на значения характеристик.
 * @record
 */
API.Client.ParameterValueConstraintsDTO = function() {}

/**
 * Минимальное число.
 * @type {!number}
 * @export
 */
API.Client.ParameterValueConstraintsDTO.prototype.minValue;

/**
 * Максимальное число.
 * @type {!number}
 * @export
 */
API.Client.ParameterValueConstraintsDTO.prototype.maxValue;

/**
 * Максимальная длина текста.
 * @type {!number}
 * @export
 */
API.Client.ParameterValueConstraintsDTO.prototype.maxLength;

