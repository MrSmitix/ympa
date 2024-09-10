goog.provide('API.Client.OfferSellingProgramDTO');

/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 * @record
 */
API.Client.OfferSellingProgramDTO = function() {}

/**
 * @type {!API.Client.SellingProgramType}
 * @export
 */
API.Client.OfferSellingProgramDTO.prototype.sellingProgram;

/**
 * @type {!API.Client.OfferSellingProgramStatusType}
 * @export
 */
API.Client.OfferSellingProgramDTO.prototype.status;

