goog.provide('API.Client.OrderStateDTO');

/**
 * Информация по заказу.
 * @record
 */
API.Client.OrderStateDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.OrderStateDTO.prototype.id;

/**
 * @type {!API.Client.OrderStatusType}
 * @export
 */
API.Client.OrderStateDTO.prototype.status;

/**
 * @type {!API.Client.OrderSubstatusType}
 * @export
 */
API.Client.OrderStateDTO.prototype.substatus;

