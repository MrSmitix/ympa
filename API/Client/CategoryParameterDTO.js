goog.provide('API.Client.CategoryParameterDTO');

/**
 * Характеристика товара.
 * @record
 */
API.Client.CategoryParameterDTO = function() {}

/**
 * Идентификатор характеристики.
 * @type {!number}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.id;

/**
 * Название характеристики.
 * @type {!string}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.name;

/**
 * @type {!API.Client.ParameterType}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.type;

/**
 * @type {!API.Client.CategoryParameterUnitDTO}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.unit;

/**
 * Описание характеристики.
 * @type {!string}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.description;

/**
 * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
 * @type {!Array<!API.Client.OfferCardRecommendationType>}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.recommendationTypes;

/**
 * Обязательность характеристики.
 * @type {!boolean}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.required;

/**
 * Используется ли характеристика в фильтре.
 * @type {!boolean}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.filtering;

/**
 * Является ли характеристика особенностью варианта.
 * @type {!boolean}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.distinctive;

/**
 * Можно ли передать сразу несколько значений.
 * @type {!boolean}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.multivalue;

/**
 * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
 * @type {!boolean}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.allowCustomValues;

/**
 * Список допустимых значений параметра. Только для характеристик типа `ENUM`.
 * @type {!Array<!API.Client.ParameterValueOptionDTO>}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.values;

/**
 * @type {!API.Client.ParameterValueConstraintsDTO}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.constraints;

/**
 * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
 * @type {!Array<!API.Client.ValueRestrictionDTO>}
 * @export
 */
API.Client.CategoryParameterDTO.prototype.valueRestrictions;

