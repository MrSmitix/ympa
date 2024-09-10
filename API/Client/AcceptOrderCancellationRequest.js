goog.provide('API.Client.AcceptOrderCancellationRequest');

/**
 * @record
 */
API.Client.AcceptOrderCancellationRequest = function() {}

/**
 * Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
 * @type {!boolean}
 * @export
 */
API.Client.AcceptOrderCancellationRequest.prototype.accepted;

/**
 * @type {!API.Client.OrderCancellationReasonType}
 * @export
 */
API.Client.AcceptOrderCancellationRequest.prototype.reason;

