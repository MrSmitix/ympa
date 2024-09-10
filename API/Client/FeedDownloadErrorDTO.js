goog.provide('API.Client.FeedDownloadErrorDTO');

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 * @record
 */
API.Client.FeedDownloadErrorDTO = function() {}

/**
 * HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @type {!number}
 * @export
 */
API.Client.FeedDownloadErrorDTO.prototype.httpStatusCode;

/**
 * @type {!API.Client.FeedDownloadErrorType}
 * @export
 */
API.Client.FeedDownloadErrorDTO.prototype.type;

/**
 * Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
 * @type {!string}
 * @export
 */
API.Client.FeedDownloadErrorDTO.prototype.description;

