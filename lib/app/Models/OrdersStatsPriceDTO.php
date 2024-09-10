<?php
/**
 * OrdersStatsPriceDTO
 */
namespace app\Models;

/**
 * OrdersStatsPriceDTO
 * @description Цена или скидки на товар.
 */
class OrdersStatsPriceDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.*/
    public $costPerItem = 0;

    /** @var float $total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.*/
    public $total = 0;

}
