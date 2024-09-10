goog.provide('API.Client.GetCampaignOffersResponse');

/**
 * Ответ на запрос списка товаров в магазине.
 * @record
 */
API.Client.GetCampaignOffersResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetCampaignOffersResponse.prototype.status;

/**
 * @type {!API.Client.GetCampaignOffersResultDTO}
 * @export
 */
API.Client.GetCampaignOffersResponse.prototype.result;

