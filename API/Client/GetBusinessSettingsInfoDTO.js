goog.provide('API.Client.GetBusinessSettingsInfoDTO');

/**
 * Информация о кабинете и его настройках.
 * @record
 */
API.Client.GetBusinessSettingsInfoDTO = function() {}

/**
 * @type {!API.Client.BusinessDTO}
 * @export
 */
API.Client.GetBusinessSettingsInfoDTO.prototype.info;

/**
 * @type {!API.Client.BusinessSettingsDTO}
 * @export
 */
API.Client.GetBusinessSettingsInfoDTO.prototype.settings;

