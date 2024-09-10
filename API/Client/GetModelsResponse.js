goog.provide('API.Client.GetModelsResponse');

/**
 * Ответ на запрос информации о моделях.
 * @record
 */
API.Client.GetModelsResponse = function() {}

/**
 * Список моделей товаров.
 * @type {!Array<!API.Client.ModelDTO>}
 * @export
 */
API.Client.GetModelsResponse.prototype.models;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.GetModelsResponse.prototype.currency;

/**
 * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @type {!number}
 * @export
 */
API.Client.GetModelsResponse.prototype.regionId;

