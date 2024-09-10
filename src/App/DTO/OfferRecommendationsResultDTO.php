<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список товаров с рекомендациями.
 */
class OfferRecommendationsResultDTO
{
    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @var \App\DTO\ScrollingPagerDTO|null
     */
    public $paging;

    /**
     * Страница списка товаров.
     * @DTA\Data(field="offerRecommendations")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferRecommendationDTO[]|null
     */
    public $offer_recommendations;

}
