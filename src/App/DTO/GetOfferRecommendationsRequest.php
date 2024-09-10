<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GetOfferRecommendationsRequest
{
    /**
     * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection103::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection103::class})
     */
    public ?\App\DTO\Collection103 $offer_ids = null;

    /**
     * @DTA\Data(field="cofinancePriceFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FieldStateType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FieldStateType::class})
     */
    public ?\App\DTO\FieldStateType $cofinance_price_filter = null;

    /**
     * @DTA\Data(field="recommendedCofinancePriceFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FieldStateType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FieldStateType::class})
     */
    public ?\App\DTO\FieldStateType $recommended_cofinance_price_filter = null;

    /**
     * @DTA\Data(field="competitivenessFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceCompetitivenessType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceCompetitivenessType::class})
     */
    public ?\App\DTO\PriceCompetitivenessType $competitiveness_filter = null;

}
