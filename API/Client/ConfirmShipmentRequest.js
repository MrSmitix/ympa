goog.provide('API.Client.ConfirmShipmentRequest');

/**
 * Запрос для подтверждения отгрузки.
 * @record
 */
API.Client.ConfirmShipmentRequest = function() {}

/**
 * Идентификатор отгрузки в системе поставщика.
 * @type {!string}
 * @export
 */
API.Client.ConfirmShipmentRequest.prototype.externalShipmentId;

