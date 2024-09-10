goog.provide('API.Client.UnitDTO');

/**
 * Единица измерения.
 * @record
 */
API.Client.UnitDTO = function() {}

/**
 * Идентификатор единицы измерения.
 * @type {!number}
 * @export
 */
API.Client.UnitDTO.prototype.id;

/**
 * Сокращенное название единицы измерения.
 * @type {!string}
 * @export
 */
API.Client.UnitDTO.prototype.name;

/**
 * Полное название единицы измерения.
 * @type {!string}
 * @export
 */
API.Client.UnitDTO.prototype.fullName;

