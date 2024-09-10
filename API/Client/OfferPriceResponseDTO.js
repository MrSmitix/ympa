goog.provide('API.Client.OfferPriceResponseDTO');

/**
 * Информация об установленной цене на товар.
 * @record
 */
API.Client.OfferPriceResponseDTO = function() {}

/**
 * Идентификатор предложения из прайс-листа.
 * @type {!string}
 * @export
 */
API.Client.OfferPriceResponseDTO.prototype.id;

/**
 * @type {!API.Client.PriceDTO}
 * @export
 */
API.Client.OfferPriceResponseDTO.prototype.price;

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.OfferPriceResponseDTO.prototype.marketSku;

/**
 * Дата и время последнего обновления цены на товар.
 * @type {!Date}
 * @export
 */
API.Client.OfferPriceResponseDTO.prototype.updatedAt;

