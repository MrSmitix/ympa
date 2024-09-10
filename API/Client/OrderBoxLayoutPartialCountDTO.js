goog.provide('API.Client.OrderBoxLayoutPartialCountDTO');

/**
 * Информация о части товара в коробке.
 * @record
 */
API.Client.OrderBoxLayoutPartialCountDTO = function() {}

/**
 * Номер части, начиная с 1.
 * @type {!number}
 * @export
 */
API.Client.OrderBoxLayoutPartialCountDTO.prototype.current;

/**
 * На сколько всего частей разделен товар.
 * @type {!number}
 * @export
 */
API.Client.OrderBoxLayoutPartialCountDTO.prototype.total;

