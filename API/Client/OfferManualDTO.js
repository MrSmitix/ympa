goog.provide('API.Client.OfferManualDTO');

/**
 * Инструкция по использованию товара. 
 * @record
 */
API.Client.OfferManualDTO = function() {}

/**
 * Ссылка на инструкцию.
 * @type {!string}
 * @export
 */
API.Client.OfferManualDTO.prototype.url;

/**
 * Название инструкции, которое будет отображаться на карточке товара. 
 * @type {!string}
 * @export
 */
API.Client.OfferManualDTO.prototype.title;

