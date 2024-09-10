goog.provide('API.Client.UpdateOfferContentResponse');

/**
 * Описывает проблемы, которые появились при сохранении товара.
 * @record
 */
API.Client.UpdateOfferContentResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.UpdateOfferContentResponse.prototype.status;

/**
 * Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
 * @type {!Array<!API.Client.UpdateOfferContentResultDTO>}
 * @export
 */
API.Client.UpdateOfferContentResponse.prototype.results;

