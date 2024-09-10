goog.provide('API.Client.OptionValuesLimitedDTO');

/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 * @record
 */
API.Client.OptionValuesLimitedDTO = function() {}

/**
 * Идентификатор значения ограничивающей характеристики.
 * @type {!number}
 * @export
 */
API.Client.OptionValuesLimitedDTO.prototype.limitingOptionValueId;

/**
 * Идентификаторы допустимых значений ограничиваемой характеристики. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.OptionValuesLimitedDTO.prototype.optionValueIds;

