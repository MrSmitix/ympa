goog.provide('API.Client.CampaignSettingsTimePeriodDTO');

/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 * @record
 */
API.Client.CampaignSettingsTimePeriodDTO = function() {}

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.CampaignSettingsTimePeriodDTO.prototype.fromDate;

/**
 * Формат даты: `ДД-ММ-ГГГГ`. 
 * @type {!string}
 * @export
 */
API.Client.CampaignSettingsTimePeriodDTO.prototype.toDate;

