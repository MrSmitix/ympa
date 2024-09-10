goog.provide('API.Client.WarehouseAddressDTO');

/**
 * Адрес склада.
 * @record
 */
API.Client.WarehouseAddressDTO = function() {}

/**
 * Город.
 * @type {!string}
 * @export
 */
API.Client.WarehouseAddressDTO.prototype.city;

/**
 * Улица.
 * @type {!string}
 * @export
 */
API.Client.WarehouseAddressDTO.prototype.street;

/**
 * Номер дома.
 * @type {!string}
 * @export
 */
API.Client.WarehouseAddressDTO.prototype.number;

/**
 * Номер строения.
 * @type {!string}
 * @export
 */
API.Client.WarehouseAddressDTO.prototype.building;

/**
 * Номер корпуса.
 * @type {!string}
 * @export
 */
API.Client.WarehouseAddressDTO.prototype.block;

/**
 * @type {!API.Client.GpsDTO}
 * @export
 */
API.Client.WarehouseAddressDTO.prototype.gps;

