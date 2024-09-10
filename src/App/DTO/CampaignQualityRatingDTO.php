<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об индексе качества магазина.
 */
class CampaignQualityRatingDTO
{
    /**
     * Идентификатор магазина.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Список значений индекса качества.
     * @DTA\Data(field="ratings")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\QualityRatingDTO[]|null
     */
    public $ratings;

}
