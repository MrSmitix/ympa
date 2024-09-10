goog.provide('API.Client.WarehouseDTO');

/**
 * Информация о складе.
 * @record
 */
API.Client.WarehouseDTO = function() {}

/**
 * Идентификатор склада.
 * @type {!number}
 * @export
 */
API.Client.WarehouseDTO.prototype.id;

/**
 * Название склада.
 * @type {!string}
 * @export
 */
API.Client.WarehouseDTO.prototype.name;

/**
 * Идентификатор кампании в API и идентификатор магазина.
 * @type {!number}
 * @export
 */
API.Client.WarehouseDTO.prototype.campaignId;

/**
 * Возможна ли доставка по модели Экспресс.
 * @type {!boolean}
 * @export
 */
API.Client.WarehouseDTO.prototype.express;

/**
 * @type {!API.Client.WarehouseAddressDTO}
 * @export
 */
API.Client.WarehouseDTO.prototype.address;

