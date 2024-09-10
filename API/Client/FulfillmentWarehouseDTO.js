goog.provide('API.Client.FulfillmentWarehouseDTO');

/**
 * Склад Маркета (FBY).
 * @record
 */
API.Client.FulfillmentWarehouseDTO = function() {}

/**
 * Идентификатор склада.
 * @type {!number}
 * @export
 */
API.Client.FulfillmentWarehouseDTO.prototype.id;

/**
 * Название склада.
 * @type {!string}
 * @export
 */
API.Client.FulfillmentWarehouseDTO.prototype.name;

/**
 * @type {!API.Client.WarehouseAddressDTO}
 * @export
 */
API.Client.FulfillmentWarehouseDTO.prototype.address;

