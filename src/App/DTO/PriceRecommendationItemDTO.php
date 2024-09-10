<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Рекомендованная цена.
 */
class PriceRecommendationItemDTO
{
    /**
     * Идентификатор кампании.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)
     * @DTA\Data(field="price")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @var float|null
     */
    public $price;

}
