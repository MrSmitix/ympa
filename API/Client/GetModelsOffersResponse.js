goog.provide('API.Client.GetModelsOffersResponse');

/**
 * Ответ на запрос списка предложений для моделей.
 * @record
 */
API.Client.GetModelsOffersResponse = function() {}

/**
 * Список моделей товаров.
 * @type {!Array<!API.Client.EnrichedModelDTO>}
 * @export
 */
API.Client.GetModelsOffersResponse.prototype.models;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.GetModelsOffersResponse.prototype.currency;

/**
 * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @type {!number}
 * @export
 */
API.Client.GetModelsOffersResponse.prototype.regionId;

