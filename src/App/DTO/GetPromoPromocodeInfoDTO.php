<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции.
 */
class GetPromoPromocodeInfoDTO
{
    /**
     * Промокод.
     * @DTA\Data(field="promocode")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promocode;

    /**
     * Процент скидки по промокоду.
     * @DTA\Data(field="discount")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $discount;

}
