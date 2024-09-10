goog.provide('API.Client.OrderBoxesLayoutDTO');

/**
 * Распределение товаров по коробкам.
 * @record
 */
API.Client.OrderBoxesLayoutDTO = function() {}

/**
 * Список коробок.
 * @type {!Array<!API.Client.EnrichedOrderBoxLayoutDTO>}
 * @export
 */
API.Client.OrderBoxesLayoutDTO.prototype.boxes;

