goog.provide('API.Client.SetOrderDeliveryDateRequest');

/**
 * @record
 */
API.Client.SetOrderDeliveryDateRequest = function() {}

/**
 * @type {!API.Client.OrderDeliveryDateDTO}
 * @export
 */
API.Client.SetOrderDeliveryDateRequest.prototype.dates;

/**
 * @type {!API.Client.OrderDeliveryDateReasonType}
 * @export
 */
API.Client.SetOrderDeliveryDateRequest.prototype.reason;

