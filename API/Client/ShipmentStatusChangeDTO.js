goog.provide('API.Client.ShipmentStatusChangeDTO');

/**
 * Статус отгрузки.
 * @record
 */
API.Client.ShipmentStatusChangeDTO = function() {}

/**
 * @type {!API.Client.ShipmentStatusType}
 * @export
 */
API.Client.ShipmentStatusChangeDTO.prototype.status;

/**
 * Описание статуса отгрузки.
 * @type {!string}
 * @export
 */
API.Client.ShipmentStatusChangeDTO.prototype.description;

/**
 * Время последнего изменения статуса отгрузки.
 * @type {!Date}
 * @export
 */
API.Client.ShipmentStatusChangeDTO.prototype.updateTime;

