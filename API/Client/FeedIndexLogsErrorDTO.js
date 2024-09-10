goog.provide('API.Client.FeedIndexLogsErrorDTO');

/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 
 * @record
 */
API.Client.FeedIndexLogsErrorDTO = function() {}

/**
 * HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
 * @type {!number}
 * @export
 */
API.Client.FeedIndexLogsErrorDTO.prototype.httpStatusCode;

/**
 * @type {!API.Client.FeedIndexLogsErrorType}
 * @export
 */
API.Client.FeedIndexLogsErrorDTO.prototype.type;

/**
 * Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
 * @type {!string}
 * @export
 */
API.Client.FeedIndexLogsErrorDTO.prototype.description;

