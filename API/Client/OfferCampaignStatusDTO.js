goog.provide('API.Client.OfferCampaignStatusDTO');

/**
 * Статус товара в магазине.
 * @record
 */
API.Client.OfferCampaignStatusDTO = function() {}

/**
 * Идентификатор кампании. 
 * @type {!number}
 * @export
 */
API.Client.OfferCampaignStatusDTO.prototype.campaignId;

/**
 * @type {!API.Client.OfferCampaignStatusType}
 * @export
 */
API.Client.OfferCampaignStatusDTO.prototype.status;

