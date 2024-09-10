goog.provide('API.Client.CalculateTariffsRequest');

/**
 * @record
 */
API.Client.CalculateTariffsRequest = function() {}

/**
 * @type {!API.Client.CalculateTariffsParametersDTO}
 * @export
 */
API.Client.CalculateTariffsRequest.prototype.parameters;

/**
 * Товары, для которых нужно рассчитать стоимость услуг.
 * @type {!Array<!API.Client.CalculateTariffsOfferDTO>}
 * @export
 */
API.Client.CalculateTariffsRequest.prototype.offers;

