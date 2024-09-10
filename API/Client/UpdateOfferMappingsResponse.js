goog.provide('API.Client.UpdateOfferMappingsResponse');

/**
 * Описывает проблемы, возникшие при сохранении товара.
 * @record
 */
API.Client.UpdateOfferMappingsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.UpdateOfferMappingsResponse.prototype.status;

/**
 * Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
 * @type {!Array<!API.Client.UpdateOfferMappingResultDTO>}
 * @export
 */
API.Client.UpdateOfferMappingsResponse.prototype.results;

