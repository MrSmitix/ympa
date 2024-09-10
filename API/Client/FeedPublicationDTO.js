goog.provide('API.Client.FeedPublicationDTO');

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 * @record
 */
API.Client.FeedPublicationDTO = function() {}

/**
 * @type {!API.Client.FeedStatusType}
 * @export
 */
API.Client.FeedPublicationDTO.prototype.status;

/**
 * @type {!API.Client.FeedPublicationFullDTO}
 * @export
 */
API.Client.FeedPublicationDTO.prototype.full;

/**
 * @type {!API.Client.FeedPublicationPriceAndStockUpdateDTO}
 * @export
 */
API.Client.FeedPublicationDTO.prototype.priceAndStockUpdate;

