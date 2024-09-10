goog.provide('API.Client.WarehouseOffersDTO');

/**
 * Информация об остатках товаров на складе.
 * @record
 */
API.Client.WarehouseOffersDTO = function() {}

/**
 * Идентификатор склада.
 * @type {!number}
 * @export
 */
API.Client.WarehouseOffersDTO.prototype.warehouseId;

/**
 * Информация об остатках.
 * @type {!Array<!API.Client.WarehouseOfferDTO>}
 * @export
 */
API.Client.WarehouseOffersDTO.prototype.offers;

