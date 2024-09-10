<?php
/**
 * GetBidsRecommendationsResponseDTO
 */
namespace app\Models;

/**
 * GetBidsRecommendationsResponseDTO
 * @description Список товаров с рекомендованными ставками.
 */
class GetBidsRecommendationsResponseDTO {

    /** @var \app\Models\SkuBidRecommendationItemDTO[] $recommendations Список товаров с рекомендованными ставками.*/
    public $recommendations = [];

}
