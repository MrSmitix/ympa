goog.provide('API.Client.GetBusinessSettingsResponse');

/**
 * Ответ на запрос настроек кабинета.
 * @record
 */
API.Client.GetBusinessSettingsResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetBusinessSettingsResponse.prototype.status;

/**
 * @type {!API.Client.GetBusinessSettingsInfoDTO}
 * @export
 */
API.Client.GetBusinessSettingsResponse.prototype.result;

