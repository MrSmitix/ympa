goog.provide('API.Client.FeedContentDTO');

/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 * @record
 */
API.Client.FeedContentDTO = function() {}

/**
 * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
 * @type {!number}
 * @export
 */
API.Client.FeedContentDTO.prototype.rejectedOffersCount;

/**
 * @type {!API.Client.FeedStatusType}
 * @export
 */
API.Client.FeedContentDTO.prototype.status;

/**
 * Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
 * @type {!number}
 * @export
 */
API.Client.FeedContentDTO.prototype.totalOffersCount;

/**
 * @type {!API.Client.FeedContentErrorDTO}
 * @export
 */
API.Client.FeedContentDTO.prototype.error;

