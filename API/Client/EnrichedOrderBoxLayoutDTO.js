goog.provide('API.Client.EnrichedOrderBoxLayoutDTO');

/**
 * Информация о коробке.
 * @record
 */
API.Client.EnrichedOrderBoxLayoutDTO = function() {}

/**
 * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
 * @type {!Array<!API.Client.OrderBoxLayoutItemDTO>}
 * @export
 */
API.Client.EnrichedOrderBoxLayoutDTO.prototype.items;

/**
 * Идентификатор коробки.
 * @type {!number}
 * @export
 */
API.Client.EnrichedOrderBoxLayoutDTO.prototype.boxId;

