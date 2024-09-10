goog.provide('API.Client.GetOrderBuyerInfoResponse');

/**
 * @record
 */
API.Client.GetOrderBuyerInfoResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetOrderBuyerInfoResponse.prototype.status;

/**
 * @type {!API.Client.OrderBuyerInfoDTO}
 * @export
 */
API.Client.GetOrderBuyerInfoResponse.prototype.result;

