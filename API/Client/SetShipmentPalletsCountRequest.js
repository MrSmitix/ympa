goog.provide('API.Client.SetShipmentPalletsCountRequest');

/**
 * Запрос на передачу количества упаковок в отгрузке.
 * @record
 */
API.Client.SetShipmentPalletsCountRequest = function() {}

/**
 * Количество упаковок в отгрузке.
 * @type {!number}
 * @export
 */
API.Client.SetShipmentPalletsCountRequest.prototype.placesCount;

