goog.provide('API.Client.WarehousesDTO');

/**
 * Информация о складах и группах складов.
 * @record
 */
API.Client.WarehousesDTO = function() {}

/**
 * Список складов, не входящих в группы.
 * @type {!Array<!API.Client.WarehouseDTO>}
 * @export
 */
API.Client.WarehousesDTO.prototype.warehouses;

/**
 * Список групп складов.
 * @type {!Array<!API.Client.WarehouseGroupDTO>}
 * @export
 */
API.Client.WarehousesDTO.prototype.warehouseGroups;

