<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры товара, который участвует в акции.
 */
class UpdatePromoOfferParamsDTO
{
    /**
     * @DTA\Data(field="discountParams", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdatePromoOfferDiscountParamsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdatePromoOfferDiscountParamsDTO::class})
     */
    public ?\App\DTO\UpdatePromoOfferDiscountParamsDTO $discount_params = null;

}
