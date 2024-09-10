goog.provide('API.Client.CampaignsQualityRatingDTO');

/**
 * Информация об индексе качества магазинов.
 * @record
 */
API.Client.CampaignsQualityRatingDTO = function() {}

/**
 * Список магазинов c информацией об их индексе качества.
 * @type {!Array<!API.Client.CampaignQualityRatingDTO>}
 * @export
 */
API.Client.CampaignsQualityRatingDTO.prototype.campaignRatings;

