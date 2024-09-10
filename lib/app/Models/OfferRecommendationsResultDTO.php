<?php
/**
 * OfferRecommendationsResultDTO
 */
namespace app\Models;

/**
 * OfferRecommendationsResultDTO
 * @description Список товаров с рекомендациями.
 */
class OfferRecommendationsResultDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\OfferRecommendationDTO[] $offerRecommendations Страница списка товаров.*/
    public $offerRecommendations = [];

}
