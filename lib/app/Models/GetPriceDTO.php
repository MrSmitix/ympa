<?php
/**
 * GetPriceDTO
 */
namespace app\Models;

/**
 * GetPriceDTO
 * @description Цена с указанием времени последнего обновления.
 */
class GetPriceDTO {

    /** @var float $value Значение.*/
    public $value = 0;

    /** @var string $currencyId */
    public $currencyId = "";

    /** @var \DateTime $updatedAt Время последнего обновления.*/
    public $updatedAt;

}
