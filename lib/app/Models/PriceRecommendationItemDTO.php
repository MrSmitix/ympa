<?php
/**
 * PriceRecommendationItemDTO
 */
namespace app\Models;

/**
 * PriceRecommendationItemDTO
 * @description Рекомендованная цена.
 */
class PriceRecommendationItemDTO {

    /** @var int $campaignId Идентификатор кампании.*/
    public $campaignId = 0;

    /** @var float $price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)*/
    public $price = 0;

}
