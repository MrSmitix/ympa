<?php
/**
 * BidRecommendationItemDTO
 */
namespace app\Models;

/**
 * BidRecommendationItemDTO
 * @description Рекомендованная ставка и возможная доля показов.
 */
class BidRecommendationItemDTO {

    /** @var int $bid Значение ставки.*/
    public $bid = 0;

    /** @var int $showPercent Доля показов.*/
    public $showPercent = 0;

}
