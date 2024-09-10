goog.provide('API.Client.CampaignQualityRatingDTO');

/**
 * Информация об индексе качества магазина.
 * @record
 */
API.Client.CampaignQualityRatingDTO = function() {}

/**
 * Идентификатор магазина.
 * @type {!number}
 * @export
 */
API.Client.CampaignQualityRatingDTO.prototype.campaignId;

/**
 * Список значений индекса качества.
 * @type {!Array<!API.Client.QualityRatingDTO>}
 * @export
 */
API.Client.CampaignQualityRatingDTO.prototype.ratings;

