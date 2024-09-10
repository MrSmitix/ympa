<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об индексе качества магазинов.
 */
class GetQualityRatingResponse
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ApiResponseStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ApiResponseStatusType::class})
     */
    public ?\App\DTO\ApiResponseStatusType $status = null;

    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignsQualityRatingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignsQualityRatingDTO::class})
     */
    public ?\App\DTO\CampaignsQualityRatingDTO $result = null;

}
