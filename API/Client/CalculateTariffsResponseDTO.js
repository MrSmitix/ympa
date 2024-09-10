goog.provide('API.Client.CalculateTariffsResponseDTO');

/**
 * Расчет стоимости услуг.
 * @record
 */
API.Client.CalculateTariffsResponseDTO = function() {}

/**
 * Стоимость услуг.
 * @type {!Array<!API.Client.CalculateTariffsOfferInfoDTO>}
 * @export
 */
API.Client.CalculateTariffsResponseDTO.prototype.offers;

