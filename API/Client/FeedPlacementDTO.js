goog.provide('API.Client.FeedPlacementDTO');

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 * @record
 */
API.Client.FeedPlacementDTO = function() {}

/**
 * @type {!API.Client.FeedStatusType}
 * @export
 */
API.Client.FeedPlacementDTO.prototype.status;

/**
 * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
 * @type {!number}
 * @export
 */
API.Client.FeedPlacementDTO.prototype.totalOffersCount;

