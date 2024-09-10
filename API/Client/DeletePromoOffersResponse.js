goog.provide('API.Client.DeletePromoOffersResponse');

/**
 * Результат удаления товаров из акции.
 * @record
 */
API.Client.DeletePromoOffersResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.DeletePromoOffersResponse.prototype.status;

/**
 * @type {!API.Client.DeletePromoOffersResultDTO}
 * @export
 */
API.Client.DeletePromoOffersResponse.prototype.result;

