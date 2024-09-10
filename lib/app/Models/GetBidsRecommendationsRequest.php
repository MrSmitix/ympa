<?php
/**
 * GetBidsRecommendationsRequest
 */
namespace app\Models;

/**
 * GetBidsRecommendationsRequest
 * @description description.
 */
class GetBidsRecommendationsRequest {

    /** @var string[] $skus Список товаров, для которых нужно получить рекомендации по ставкам.*/
    public $skus = [];

}
