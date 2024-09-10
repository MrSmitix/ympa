<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о состоянии цен и рекомендации.
 */
class OfferRecommendationDTO
{
    /**
     * @DTA\Data(field="offer", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferForRecommendationDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferForRecommendationDTO::class})
     */
    public ?\App\DTO\OfferForRecommendationDTO $offer = null;

    /**
     * @DTA\Data(field="recommendation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferRecommendationInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferRecommendationInfoDTO::class})
     */
    public ?\App\DTO\OfferRecommendationInfoDTO $recommendation = null;

}
