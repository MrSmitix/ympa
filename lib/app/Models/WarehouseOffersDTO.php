<?php
/**
 * WarehouseOffersDTO
 */
namespace app\Models;

/**
 * WarehouseOffersDTO
 * @description Информация об остатках товаров на складе.
 */
class WarehouseOffersDTO {

    /** @var int $warehouseId Идентификатор склада.*/
    public $warehouseId = 0;

    /** @var \app\Models\WarehouseOfferDTO[] $offers Информация об остатках.*/
    public $offers = [];

}
