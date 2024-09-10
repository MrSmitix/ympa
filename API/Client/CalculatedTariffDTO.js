goog.provide('API.Client.CalculatedTariffDTO');

/**
 * Информация об услугах Маркета.
 * @record
 */
API.Client.CalculatedTariffDTO = function() {}

/**
 * @type {!API.Client.CalculatedTariffType}
 * @export
 */
API.Client.CalculatedTariffDTO.prototype.type;

/**
 * Стоимость услуги в рублях.
 * @type {!number}
 * @export
 */
API.Client.CalculatedTariffDTO.prototype.amount;

/**
 * Параметры расчета тарифа.
 * @type {!Array<!API.Client.TariffParameterDTO>}
 * @export
 */
API.Client.CalculatedTariffDTO.prototype.parameters;

