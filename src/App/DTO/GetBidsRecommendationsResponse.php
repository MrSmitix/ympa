<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * description.
 */
class GetBidsRecommendationsResponse
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ApiResponseStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ApiResponseStatusType::class})
     */
    public ?\App\DTO\ApiResponseStatusType $status = null;

    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetBidsRecommendationsResponseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetBidsRecommendationsResponseDTO::class})
     */
    public ?\App\DTO\GetBidsRecommendationsResponseDTO $result = null;

}
