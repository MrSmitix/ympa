<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 */
class PromoOfferDiscountParamsDTO
{
    /**
     * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $price = null;

    /**
     * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.
     * @DTA\Data(field="promoPrice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $promo_price = null;

    /**
     * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.
     * @DTA\Data(field="maxPromoPrice")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_promo_price = null;

}
