<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции.
 */
class PromoOfferParamsDTO
{
    /**
     * @DTA\Data(field="discountParams", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferDiscountParamsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferDiscountParamsDTO::class})
     */
    public ?\App\DTO\PromoOfferDiscountParamsDTO $discount_params = null;

    /**
     * @DTA\Data(field="promocodeParams", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferPromocodeParamsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferPromocodeParamsDTO::class})
     */
    public ?\App\DTO\PromoOfferPromocodeParamsDTO $promocode_params = null;

}
