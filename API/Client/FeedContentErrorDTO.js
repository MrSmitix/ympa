goog.provide('API.Client.FeedContentErrorDTO');

/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 * @record
 */
API.Client.FeedContentErrorDTO = function() {}

/**
 * @type {!API.Client.FeedContentErrorType}
 * @export
 */
API.Client.FeedContentErrorDTO.prototype.type;

