<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
 */
class PromoOfferPromocodeParamsDTO
{
    /**
     * Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.
     * @DTA\Data(field="maxPrice")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_price;

}
