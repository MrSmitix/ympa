goog.provide('API.Client.SetFeedParamsRequest');

/**
 * Запрос на обновление изменение параметров прайс-листа.
 * @record
 */
API.Client.SetFeedParamsRequest = function() {}

/**
 * Параметры прайс-листа.  Обязательный параметр. 
 * @type {!Array<!API.Client.FeedParameterDTO>}
 * @export
 */
API.Client.SetFeedParamsRequest.prototype.parameters;

