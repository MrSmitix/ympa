goog.provide('API.Client.TariffParameterDTO');

/**
 * Детали расчета конкретной услуги Маркета.
 * @record
 */
API.Client.TariffParameterDTO = function() {}

/**
 * Название параметра.
 * @type {!string}
 * @export
 */
API.Client.TariffParameterDTO.prototype.name;

/**
 * Значение параметра.
 * @type {!string}
 * @export
 */
API.Client.TariffParameterDTO.prototype.value;

