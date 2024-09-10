<?php
/**
 * WarehouseGroupDTO
 */
namespace app\Models;

/**
 * WarehouseGroupDTO
 * @description Информация о группе складов.
 */
class WarehouseGroupDTO {

    /** @var string $name Название группы складов.*/
    public $name = "";

    /** @var \app\Models\WarehouseDTO $mainWarehouse */
    public $mainWarehouse;

    /** @var \app\Models\WarehouseDTO[] $warehouses Список складов, входящих в группу.*/
    public $warehouses = [];

}
