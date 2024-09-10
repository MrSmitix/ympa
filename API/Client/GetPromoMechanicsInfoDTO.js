goog.provide('API.Client.GetPromoMechanicsInfoDTO');

/**
 * Информация о типе акции.
 * @record
 */
API.Client.GetPromoMechanicsInfoDTO = function() {}

/**
 * @type {!API.Client.MechanicsType}
 * @export
 */
API.Client.GetPromoMechanicsInfoDTO.prototype.type;

/**
 * @type {!API.Client.GetPromoPromocodeInfoDTO}
 * @export
 */
API.Client.GetPromoMechanicsInfoDTO.prototype.promocodeInfo;

