<?php
/**
 * OrdersStatsWarehouseDTO
 */
namespace app\Models;

/**
 * OrdersStatsWarehouseDTO
 * @description Информация о складе, на котором хранится товар.
 */
class OrdersStatsWarehouseDTO {

    /** @var int $id Идентификатор склада.*/
    public $id = 0;

    /** @var string $name Название склада.*/
    public $name = "";

}
