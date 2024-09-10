<?php
/**
 * BasePriceDTO
 */
namespace app\Models;

/**
 * BasePriceDTO
 * @description Цена на товар.
 */
class BasePriceDTO {

    /** @var float $value Значение.*/
    public $value = 0;

    /** @var string $currencyId */
    public $currencyId = "";

}
