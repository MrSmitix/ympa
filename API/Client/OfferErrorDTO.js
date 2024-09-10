goog.provide('API.Client.OfferErrorDTO');

/**
 * Сообщение об ошибке, связанной с размещением товара.
 * @record
 */
API.Client.OfferErrorDTO = function() {}

/**
 * Тип ошибки.
 * @type {!string}
 * @export
 */
API.Client.OfferErrorDTO.prototype.message;

/**
 * Пояснение.
 * @type {!string}
 * @export
 */
API.Client.OfferErrorDTO.prototype.comment;

