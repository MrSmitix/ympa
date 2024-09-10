<?php
/**
 * OrdersStatsCommissionDTO
 */
namespace app\Models;

/**
 * OrdersStatsCommissionDTO
 * @description Информация о стоимости услуг.
 */
class OrdersStatsCommissionDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.*/
    public $actual = 0;

}
