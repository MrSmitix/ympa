<?php
/**
 * OfferRecommendationDTO
 */
namespace app\Models;

/**
 * OfferRecommendationDTO
 * @description Информация о состоянии цен и рекомендации.
 */
class OfferRecommendationDTO {

    /** @var \app\Models\OfferForRecommendationDTO $offer */
    public $offer;

    /** @var \app\Models\OfferRecommendationInfoDTO $recommendation */
    public $recommendation;

}
