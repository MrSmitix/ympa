goog.provide('API.Client.OrderBoxLayoutDTO');

/**
 * Информация о коробке.
 * @record
 */
API.Client.OrderBoxLayoutDTO = function() {}

/**
 * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
 * @type {!Array<!API.Client.OrderBoxLayoutItemDTO>}
 * @export
 */
API.Client.OrderBoxLayoutDTO.prototype.items;

