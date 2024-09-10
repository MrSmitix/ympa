goog.provide('API.Client.FeedPublicationFullDTO');

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 * @record
 */
API.Client.FeedPublicationFullDTO = function() {}

/**
 * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedPublicationFullDTO.prototype.fileTime;

/**
 * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedPublicationFullDTO.prototype.publishedTime;

