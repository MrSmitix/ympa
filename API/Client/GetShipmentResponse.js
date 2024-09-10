goog.provide('API.Client.GetShipmentResponse');

/**
 * @record
 */
API.Client.GetShipmentResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetShipmentResponse.prototype.status;

/**
 * @type {!API.Client.ShipmentDTO}
 * @export
 */
API.Client.GetShipmentResponse.prototype.result;

