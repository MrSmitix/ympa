goog.provide('API.Client.RegionalModelInfoDTO');

/**
 * Региональная информация.
 * @record
 */
API.Client.RegionalModelInfoDTO = function() {}

/**
 * @type {!API.Client.CurrencyType}
 * @export
 */
API.Client.RegionalModelInfoDTO.prototype.currency;

/**
 * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
 * @type {!number}
 * @export
 */
API.Client.RegionalModelInfoDTO.prototype.regionId;

