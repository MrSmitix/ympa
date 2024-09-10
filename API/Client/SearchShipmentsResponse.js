goog.provide('API.Client.SearchShipmentsResponse');

/**
 * Ответ на запрос информации об отгрузках.
 * @record
 */
API.Client.SearchShipmentsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.SearchShipmentsResponse.prototype.status;

/**
 * @type {!API.Client.SearchShipmentsResponseDTO}
 * @export
 */
API.Client.SearchShipmentsResponse.prototype.result;

