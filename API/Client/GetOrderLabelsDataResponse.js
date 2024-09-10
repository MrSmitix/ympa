goog.provide('API.Client.GetOrderLabelsDataResponse');

/**
 * Ответ с информацией для печати ярлыков.
 * @record
 */
API.Client.GetOrderLabelsDataResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetOrderLabelsDataResponse.prototype.status;

/**
 * @type {!API.Client.OrderLabelDTO}
 * @export
 */
API.Client.GetOrderLabelsDataResponse.prototype.result;

