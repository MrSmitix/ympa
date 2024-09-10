goog.provide('API.Client.OfferProcessingNoteDTO');

/**
 * Причины, по которым товар не прошел модерацию.
 * @record
 */
API.Client.OfferProcessingNoteDTO = function() {}

/**
 * @type {!API.Client.OfferProcessingNoteType}
 * @export
 */
API.Client.OfferProcessingNoteDTO.prototype.type;

/**
 * Дополнительная информация о причине отклонения товара. 
 * @type {!string}
 * @export
 */
API.Client.OfferProcessingNoteDTO.prototype.payload;

