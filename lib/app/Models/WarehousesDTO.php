<?php
/**
 * WarehousesDTO
 */
namespace app\Models;

/**
 * WarehousesDTO
 * @description Информация о складах и группах складов.
 */
class WarehousesDTO {

    /** @var \app\Models\WarehouseDTO[] $warehouses Список складов, не входящих в группы.*/
    public $warehouses = [];

    /** @var \app\Models\WarehouseGroupDTO[] $warehouseGroups Список групп складов.*/
    public $warehouseGroups = [];

}
