goog.provide('API.Client.OfferWeightDimensionsDTO');

/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 * @record
 */
API.Client.OfferWeightDimensionsDTO = function() {}

/**
 * Длина упаковки в см. 
 * @type {!number}
 * @export
 */
API.Client.OfferWeightDimensionsDTO.prototype.length;

/**
 * Ширина упаковки в см. 
 * @type {!number}
 * @export
 */
API.Client.OfferWeightDimensionsDTO.prototype.width;

/**
 * Высота упаковки в см. 
 * @type {!number}
 * @export
 */
API.Client.OfferWeightDimensionsDTO.prototype.height;

/**
 * Вес товара в кг с учетом упаковки (брутто). 
 * @type {!number}
 * @export
 */
API.Client.OfferWeightDimensionsDTO.prototype.weight;

