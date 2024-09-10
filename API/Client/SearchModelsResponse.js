goog.provide('API.Client.SearchModelsResponse');

/**
 * @record
 */
API.Client.SearchModelsResponse = function() {}

/**
 * Список моделей товаров.
 * @type {!Array<!API.Client.ModelDTO>}
 * @export
 */
API.Client.SearchModelsResponse.prototype.models;

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.SearchModelsResponse.prototype.currency;

/**
 * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @type {!number}
 * @export
 */
API.Client.SearchModelsResponse.prototype.regionId;

/**
 * @type {!API.Client.FlippingPagerDTO}
 * @export
 */
API.Client.SearchModelsResponse.prototype.pager;

