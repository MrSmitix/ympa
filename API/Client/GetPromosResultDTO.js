goog.provide('API.Client.GetPromosResultDTO');

/**
 * Информация об акциях Маркета.
 * @record
 */
API.Client.GetPromosResultDTO = function() {}

/**
 * Акции Маркета.
 * @type {!Array<!API.Client.GetPromoDTO>}
 * @export
 */
API.Client.GetPromosResultDTO.prototype.promos;

