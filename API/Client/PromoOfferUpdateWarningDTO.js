goog.provide('API.Client.PromoOfferUpdateWarningDTO');

/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 * @record
 */
API.Client.PromoOfferUpdateWarningDTO = function() {}

/**
 * @type {!API.Client.PromoOfferUpdateWarningCodeType}
 * @export
 */
API.Client.PromoOfferUpdateWarningDTO.prototype.code;

/**
 * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
 * @type {!Array<!number>}
 * @export
 */
API.Client.PromoOfferUpdateWarningDTO.prototype.campaignIds;

