<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GetOfferRecommendationsRequest
{
    /**
     * Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection103::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection103::class})
     * @var \App\DTO\Collection103|null
     */
    public $offer_ids;

    /**
     * @DTA\Data(field="cofinancePriceFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FieldStateType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FieldStateType::class})
     * @var \App\DTO\FieldStateType|null
     */
    public $cofinance_price_filter;

    /**
     * @DTA\Data(field="recommendedCofinancePriceFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FieldStateType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FieldStateType::class})
     * @var \App\DTO\FieldStateType|null
     */
    public $recommended_cofinance_price_filter;

    /**
     * @DTA\Data(field="competitivenessFilter", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceCompetitivenessType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceCompetitivenessType::class})
     * @var \App\DTO\PriceCompetitivenessType|null
     */
    public $competitiveness_filter;

}
