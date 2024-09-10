goog.provide('API.Client.FeedPublicationPriceAndStockUpdateDTO');

/**
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. 
 * @record
 */
API.Client.FeedPublicationPriceAndStockUpdateDTO = function() {}

/**
 * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedPublicationPriceAndStockUpdateDTO.prototype.fileTime;

/**
 * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
 * @type {!Date}
 * @export
 */
API.Client.FeedPublicationPriceAndStockUpdateDTO.prototype.publishedTime;

