<?php
/**
 * GetOfferRecommendationsRequest
 */
namespace app\Models;

/**
 * GetOfferRecommendationsRequest
 */
class GetOfferRecommendationsRequest {

    /** @var string[]|null $offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.*/
    public $offerIds = null;

    /** @var string $cofinancePriceFilter */
    public $cofinancePriceFilter = "";

    /** @var string $recommendedCofinancePriceFilter */
    public $recommendedCofinancePriceFilter = "";

    /** @var string $competitivenessFilter */
    public $competitivenessFilter = "";

}
