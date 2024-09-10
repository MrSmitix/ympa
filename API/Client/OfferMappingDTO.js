goog.provide('API.Client.OfferMappingDTO');

/**
 * Информация о текущей карточке товара на Маркете.
 * @record
 */
API.Client.OfferMappingDTO = function() {}

/**
 * SKU на Маркете.
 * @type {!number}
 * @export
 */
API.Client.OfferMappingDTO.prototype.marketSku;

/**
 * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
 * @type {!number}
 * @export
 */
API.Client.OfferMappingDTO.prototype.modelId;

/**
 * Идентификатор категории для текущей карточки товара на Маркете.
 * @type {!number}
 * @export
 */
API.Client.OfferMappingDTO.prototype.categoryId;

