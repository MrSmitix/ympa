goog.provide('API.Client.OfferContentErrorDTO');

/**
 * Текст ошибки.
 * @record
 */
API.Client.OfferContentErrorDTO = function() {}

/**
 * @type {!API.Client.OfferContentErrorType}
 * @export
 */
API.Client.OfferContentErrorDTO.prototype.type;

/**
 * Идентификатор характеристики, с которой связана ошибка.
 * @type {!number}
 * @export
 */
API.Client.OfferContentErrorDTO.prototype.parameterId;

/**
 * Текст ошибки.
 * @type {!string}
 * @export
 */
API.Client.OfferContentErrorDTO.prototype.message;

