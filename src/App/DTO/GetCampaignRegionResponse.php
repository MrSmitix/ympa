<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос региона магазина.
 */
class GetCampaignRegionResponse
{
    /**
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     * @var \App\DTO\RegionDTO|null
     */
    public $region;

}
