goog.provide('API.Client.OrderStatusChangeDTO');

/**
 * Заказ.
 * @record
 */
API.Client.OrderStatusChangeDTO = function() {}

/**
 * @type {!API.Client.OrderStatusType}
 * @export
 */
API.Client.OrderStatusChangeDTO.prototype.status;

/**
 * @type {!API.Client.OrderSubstatusType}
 * @export
 */
API.Client.OrderStatusChangeDTO.prototype.substatus;

/**
 * @type {!API.Client.OrderStatusChangeDeliveryDTO}
 * @export
 */
API.Client.OrderStatusChangeDTO.prototype.delivery;

