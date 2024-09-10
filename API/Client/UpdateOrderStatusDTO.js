goog.provide('API.Client.UpdateOrderStatusDTO');

/**
 * Список заказов.
 * @record
 */
API.Client.UpdateOrderStatusDTO = function() {}

/**
 * Идентификатор заказа.
 * @type {!number}
 * @export
 */
API.Client.UpdateOrderStatusDTO.prototype.id;

/**
 * @type {!API.Client.OrderStatusType}
 * @export
 */
API.Client.UpdateOrderStatusDTO.prototype.status;

/**
 * @type {!API.Client.OrderSubstatusType}
 * @export
 */
API.Client.UpdateOrderStatusDTO.prototype.substatus;

/**
 * @type {!API.Client.OrderUpdateStatusType}
 * @export
 */
API.Client.UpdateOrderStatusDTO.prototype.updateStatus;

/**
 * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
 * @type {!string}
 * @export
 */
API.Client.UpdateOrderStatusDTO.prototype.errorDetails;

