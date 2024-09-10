goog.provide('API.Client.GetCampaignLoginsResponse');

/**
 * Ответ на запрос списка логинов, связанных с магазином.
 * @record
 */
API.Client.GetCampaignLoginsResponse = function() {}

/**
 * Список логинов.
 * @type {!Array<!string>}
 * @export
 */
API.Client.GetCampaignLoginsResponse.prototype.logins;

