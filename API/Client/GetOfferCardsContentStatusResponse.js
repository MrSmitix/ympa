goog.provide('API.Client.GetOfferCardsContentStatusResponse');

/**
 * Ответ со списком состояний товаров и пагинацией.
 * @record
 */
API.Client.GetOfferCardsContentStatusResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetOfferCardsContentStatusResponse.prototype.status;

/**
 * @type {!API.Client.OfferCardsContentStatusDTO}
 * @export
 */
API.Client.GetOfferCardsContentStatusResponse.prototype.result;

