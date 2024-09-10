goog.provide('API.Client.OrderParcelBoxDTO');

/**
 * Информация о грузоместе.
 * @record
 */
API.Client.OrderParcelBoxDTO = function() {}

/**
 * Идентификатор грузоместа.
 * @type {!number}
 * @export
 */
API.Client.OrderParcelBoxDTO.prototype.id;

/**
 * Идентификатор грузового места в информационной системе магазина.
 * @type {!string}
 * @export
 */
API.Client.OrderParcelBoxDTO.prototype.fulfilmentId;

