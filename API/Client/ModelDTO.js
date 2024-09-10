goog.provide('API.Client.ModelDTO');

/**
 * Модель товара.
 * @record
 */
API.Client.ModelDTO = function() {}

/**
 * Идентификатор модели товара.
 * @type {!number}
 * @export
 */
API.Client.ModelDTO.prototype.id;

/**
 * Название модели товара.
 * @type {!string}
 * @export
 */
API.Client.ModelDTO.prototype.name;

/**
 * @type {!API.Client.ModelPriceDTO}
 * @export
 */
API.Client.ModelDTO.prototype.prices;

