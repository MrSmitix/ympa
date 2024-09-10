<?php
/**
 * WarehouseStockDTO
 */
namespace app\Models;

/**
 * WarehouseStockDTO
 * @description Информация об остатках товара.
 */
class WarehouseStockDTO {

    /** @var string $type */
    public $type = "";

    /** @var int $count Значение остатков.*/
    public $count = 0;

}
