goog.provide('API.Client.ModelPriceDTO');

/**
 * Информация о ценах на модель товара.
 * @record
 */
API.Client.ModelPriceDTO = function() {}

/**
 * Средняя цена предложения для модели в регионе.
 * @type {!number}
 * @export
 */
API.Client.ModelPriceDTO.prototype.avg;

/**
 * Максимальная цена предложения для модели в регионе.
 * @type {!number}
 * @export
 */
API.Client.ModelPriceDTO.prototype.max;

/**
 * Минимальная цена предложения для модели в регионе.
 * @type {!number}
 * @export
 */
API.Client.ModelPriceDTO.prototype.min;

