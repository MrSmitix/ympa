<?php
/**
 * GoodsStatsWarehouseDTO
 */
namespace app\Models;

/**
 * GoodsStatsWarehouseDTO
 * @description Информация о складе.
 */
class GoodsStatsWarehouseDTO {

    /** @var int $id Идентификатор склада.*/
    public $id = 0;

    /** @var string $name Название склада.*/
    public $name = "";

    /** @var \app\Models\WarehouseStockDTO[] $stocks Информация об остатках товаров на складе.*/
    public $stocks = [];

}
