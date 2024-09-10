goog.provide('API.Client.CategoryParameterUnitDTO');

/**
 * Единицы измерения характеристики товара.
 * @record
 */
API.Client.CategoryParameterUnitDTO = function() {}

/**
 * Единица измерения по умолчанию.
 * @type {!number}
 * @export
 */
API.Client.CategoryParameterUnitDTO.prototype.defaultUnitId;

/**
 * Допустимые единицы измерения.
 * @type {!Array<!API.Client.UnitDTO>}
 * @export
 */
API.Client.CategoryParameterUnitDTO.prototype.units;

