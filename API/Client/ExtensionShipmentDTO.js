goog.provide('API.Client.ExtensionShipmentDTO');

/**
 * Информация об отгрузке.
 * @record
 */
API.Client.ExtensionShipmentDTO = function() {}

/**
 * @type {!API.Client.ShipmentStatusChangeDTO}
 * @export
 */
API.Client.ExtensionShipmentDTO.prototype.currentStatus;

/**
 * Доступные действия над отгрузкой.
 * @type {!set<!API.Client.ShipmentActionType>}
 * @export
 */
API.Client.ExtensionShipmentDTO.prototype.availableActions;

