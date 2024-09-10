goog.provide('API.Client.GetCampaignsResponse');

/**
 * Результаты поиска магазинов.
 * @record
 */
API.Client.GetCampaignsResponse = function() {}

/**
 * Список с информацией по каждому магазину.
 * @type {!Array<!API.Client.CampaignDTO>}
 * @export
 */
API.Client.GetCampaignsResponse.prototype.campaigns;

/**
 * @type {!API.Client.FlippingPagerDTO}
 * @export
 */
API.Client.GetCampaignsResponse.prototype.pager;

