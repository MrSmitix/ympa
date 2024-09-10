goog.provide('API.Client.GetPromosRequest');

/**
 * Фильтры для получения списка акций.
 * @record
 */
API.Client.GetPromosRequest = function() {}

/**
 * @type {!API.Client.PromoParticipationType}
 * @export
 */
API.Client.GetPromosRequest.prototype.participation;

/**
 * @type {!API.Client.MechanicsType}
 * @export
 */
API.Client.GetPromosRequest.prototype.mechanics;

