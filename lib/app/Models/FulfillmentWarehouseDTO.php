<?php
/**
 * FulfillmentWarehouseDTO
 */
namespace app\Models;

/**
 * FulfillmentWarehouseDTO
 * @description Склад Маркета (FBY).
 */
class FulfillmentWarehouseDTO {

    /** @var int $id Идентификатор склада.*/
    public $id = 0;

    /** @var string $name Название склада.*/
    public $name = "";

    /** @var \app\Models\WarehouseAddressDTO $address */
    public $address;

}
