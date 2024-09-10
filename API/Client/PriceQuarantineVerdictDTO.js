goog.provide('API.Client.PriceQuarantineVerdictDTO');

/**
 * Причина попадания товара в карантин.
 * @record
 */
API.Client.PriceQuarantineVerdictDTO = function() {}

/**
 * @type {!API.Client.PriceQuarantineVerdictType}
 * @export
 */
API.Client.PriceQuarantineVerdictDTO.prototype.type;

/**
 * Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
 * @type {!Array<!API.Client.PriceQuarantineVerdictParameterDTO>}
 * @export
 */
API.Client.PriceQuarantineVerdictDTO.prototype.params;

