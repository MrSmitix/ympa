goog.provide('API.Client.WarehouseGroupDTO');

/**
 * Информация о группе складов.
 * @record
 */
API.Client.WarehouseGroupDTO = function() {}

/**
 * Название группы складов.
 * @type {!string}
 * @export
 */
API.Client.WarehouseGroupDTO.prototype.name;

/**
 * @type {!API.Client.WarehouseDTO}
 * @export
 */
API.Client.WarehouseGroupDTO.prototype.mainWarehouse;

/**
 * Список складов, входящих в группу.
 * @type {!Array<!API.Client.WarehouseDTO>}
 * @export
 */
API.Client.WarehouseGroupDTO.prototype.warehouses;

