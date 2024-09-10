goog.provide('API.Client.CampaignDTO');

/**
 * Информация о магазине.
 * @record
 */
API.Client.CampaignDTO = function() {}

/**
 * URL магазина.
 * @type {!string}
 * @export
 */
API.Client.CampaignDTO.prototype.domain;

/**
 * Идентификатор кампании.
 * @type {!number}
 * @export
 */
API.Client.CampaignDTO.prototype.id;

/**
 * Идентификатор плательщика в Яндекс Балансе.
 * @type {!number}
 * @export
 */
API.Client.CampaignDTO.prototype.clientId;

/**
 * @type {!API.Client.BusinessDTO}
 * @export
 */
API.Client.CampaignDTO.prototype.business;

/**
 * @type {!API.Client.PlacementType}
 * @export
 */
API.Client.CampaignDTO.prototype.placementType;

