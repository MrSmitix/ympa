goog.provide('API.Client.OfferMappingErrorDTO');

/**
 * Текст ошибки.
 * @record
 */
API.Client.OfferMappingErrorDTO = function() {}

/**
 * @type {!API.Client.OfferMappingErrorType}
 * @export
 */
API.Client.OfferMappingErrorDTO.prototype.type;

/**
 * Идентификатор характеристики, с которой связана ошибка.
 * @type {!number}
 * @export
 */
API.Client.OfferMappingErrorDTO.prototype.parameterId;

/**
 * Текст ошибки.
 * @type {!string}
 * @export
 */
API.Client.OfferMappingErrorDTO.prototype.message;

