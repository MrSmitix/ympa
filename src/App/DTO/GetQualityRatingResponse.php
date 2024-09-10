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
     * @var \App\DTO\ApiResponseStatusType|null
     */
    public $status;

    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignsQualityRatingDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignsQualityRatingDTO::class})
     * @var \App\DTO\CampaignsQualityRatingDTO|null
     */
    public $result;

}
