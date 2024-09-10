goog.provide('API.Client.OfferProcessingStateDTO');

/**
 * Информация о статусе публикации товара на Маркете.
 * @record
 */
API.Client.OfferProcessingStateDTO = function() {}

/**
 * @type {!API.Client.OfferProcessingStatusType}
 * @export
 */
API.Client.OfferProcessingStateDTO.prototype.status;

/**
 * Причины, по которым товар не прошел модерацию.
 * @type {!Array<!API.Client.OfferProcessingNoteDTO>}
 * @export
 */
API.Client.OfferProcessingStateDTO.prototype.notes;

