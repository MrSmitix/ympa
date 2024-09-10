goog.provide('API.Client.OfferConditionDTO');

/**
 * Состояние уцененного товара. 
 * @record
 */
API.Client.OfferConditionDTO = function() {}

/**
 * @type {!API.Client.OfferConditionType}
 * @export
 */
API.Client.OfferConditionDTO.prototype.type;

/**
 * @type {!API.Client.OfferConditionQualityType}
 * @export
 */
API.Client.OfferConditionDTO.prototype.quality;

/**
 * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
 * @type {!string}
 * @export
 */
API.Client.OfferConditionDTO.prototype.reason;

