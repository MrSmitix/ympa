<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список товаров с рекомендованными ставками.
 */
class GetBidsRecommendationsResponseDTO
{
    /**
     * Список товаров с рекомендованными ставками.
     * @DTA\Data(field="recommendations")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\SkuBidRecommendationItemDTO[]|null
     */
    public $recommendations;

}
