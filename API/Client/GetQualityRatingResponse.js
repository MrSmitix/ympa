goog.provide('API.Client.GetQualityRatingResponse');

/**
 * Информация об индексе качества магазинов.
 * @record
 */
API.Client.GetQualityRatingResponse = function() {}

/**
 * @type {!API.Client.ApiResponseStatusType}
 * @export
 */
API.Client.GetQualityRatingResponse.prototype.status;

/**
 * @type {!API.Client.CampaignsQualityRatingDTO}
 * @export
 */
API.Client.GetQualityRatingResponse.prototype.result;

