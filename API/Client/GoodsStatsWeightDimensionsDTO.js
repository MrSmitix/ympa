goog.provide('API.Client.GoodsStatsWeightDimensionsDTO');

/**
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 * @record
 */
API.Client.GoodsStatsWeightDimensionsDTO = function() {}

/**
 * Длина товара в сантиметрах.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsWeightDimensionsDTO.prototype.length;

/**
 * Ширина товара в сантиметрах.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsWeightDimensionsDTO.prototype.width;

/**
 * Высота товара в сантиметрах.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsWeightDimensionsDTO.prototype.height;

/**
 * Вес товара в килограммах.
 * @type {!number}
 * @export
 */
API.Client.GoodsStatsWeightDimensionsDTO.prototype.weight;

