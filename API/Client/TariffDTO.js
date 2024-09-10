goog.provide('API.Client.TariffDTO');

/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 * @record
 */
API.Client.TariffDTO = function() {}

/**
 * @type {!API.Client.TariffType}
 * @export
 */
API.Client.TariffDTO.prototype.type;

/**
 * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
 * @type {!number}
 * @export
 */
API.Client.TariffDTO.prototype.percent;

/**
 * Значение тарифа в рублях.
 * @type {!number}
 * @export
 */
API.Client.TariffDTO.prototype.amount;

/**
 * Параметры расчета тарифа.
 * @type {!Array<!API.Client.TariffParameterDTO>}
 * @export
 */
API.Client.TariffDTO.prototype.parameters;

