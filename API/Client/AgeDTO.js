goog.provide('API.Client.AgeDTO');

/**
 * Возраст в заданных единицах измерения.
 * @record
 */
API.Client.AgeDTO = function() {}

/**
 * Значение. 
 * @type {!number}
 * @export
 */
API.Client.AgeDTO.prototype.value;

/**
 * @type {!API.Client.AgeUnitType}
 * @export
 */
API.Client.AgeDTO.prototype.ageUnit;

