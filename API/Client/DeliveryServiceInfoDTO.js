goog.provide('API.Client.DeliveryServiceInfoDTO');

/**
 * Информация о службе доставки.
 * @record
 */
API.Client.DeliveryServiceInfoDTO = function() {}

/**
 * Идентификатор службы доставки.
 * @type {!number}
 * @export
 */
API.Client.DeliveryServiceInfoDTO.prototype.id;

/**
 * Наименование службы доставки.
 * @type {!string}
 * @export
 */
API.Client.DeliveryServiceInfoDTO.prototype.name;

