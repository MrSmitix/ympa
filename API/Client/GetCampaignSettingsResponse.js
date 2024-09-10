goog.provide('API.Client.GetCampaignSettingsResponse');

/**
 * Ответ на запрос настроек магазина.
 * @record
 */
API.Client.GetCampaignSettingsResponse = function() {}

/**
 * @type {!API.Client.CampaignSettingsDTO}
 * @export
 */
API.Client.GetCampaignSettingsResponse.prototype.settings;

