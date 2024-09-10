<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об индексе качества магазинов.
 */
class CampaignsQualityRatingDTO
{
    /**
     * Список магазинов c информацией об их индексе качества.
     * @DTA\Data(field="campaignRatings")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $campaign_ratings = null;

}
