<?php
/**
 * GetPromoPromocodeInfoDTO
 */
namespace app\Models;

/**
 * GetPromoPromocodeInfoDTO
 * @description Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции.
 */
class GetPromoPromocodeInfoDTO {

    /** @var string $promocode Промокод.*/
    public $promocode = "";

    /** @var int $discount Процент скидки по промокоду.*/
    public $discount = 0;

}
