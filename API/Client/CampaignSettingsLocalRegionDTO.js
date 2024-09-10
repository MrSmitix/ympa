goog.provide('API.Client.CampaignSettingsLocalRegionDTO');

/**
 * Информация о своем регионе магазина.
 * @record
 */
API.Client.CampaignSettingsLocalRegionDTO = function() {}

/**
 * Идентификатор региона.
 * @type {!number}
 * @export
 */
API.Client.CampaignSettingsLocalRegionDTO.prototype.id;

/**
 * Название региона.
 * @type {!string}
 * @export
 */
API.Client.CampaignSettingsLocalRegionDTO.prototype.name;

/**
 * @type {!API.Client.RegionType}
 * @export
 */
API.Client.CampaignSettingsLocalRegionDTO.prototype.type;

/**
 * @type {!API.Client.CampaignSettingsScheduleSourceType}
 * @export
 */
API.Client.CampaignSettingsLocalRegionDTO.prototype.deliveryOptionsSource;

/**
 * @type {!API.Client.CampaignSettingsDeliveryDTO}
 * @export
 */
API.Client.CampaignSettingsLocalRegionDTO.prototype.delivery;

