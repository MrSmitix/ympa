goog.provide('API.Client.OfferMappingInfoDTO');

/**
 * Информация о карточке товара.
 * @record
 */
API.Client.OfferMappingInfoDTO = function() {}

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.OfferMappingInfoDTO.prototype.mapping;

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.OfferMappingInfoDTO.prototype.awaitingModerationMapping;

/**
 * @type {!API.Client.OfferMappingDTO}
 * @export
 */
API.Client.OfferMappingInfoDTO.prototype.rejectedMapping;

