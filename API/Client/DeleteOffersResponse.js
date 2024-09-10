goog.provide('API.Client.DeleteOffersResponse');

/**
 * Результат удаления товаров.
 * @record
 */
API.Client.DeleteOffersResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.DeleteOffersResponse.prototype.status;

/**
 * @type {!API.Client.DeleteOffersDTO}
 * @export
 */
API.Client.DeleteOffersResponse.prototype.result;

