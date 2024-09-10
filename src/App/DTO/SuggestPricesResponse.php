<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос списка цен для продвижения.
 */
class SuggestPricesResponse
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ApiResponseStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ApiResponseStatusType::class})
     */
    public ?\App\DTO\ApiResponseStatusType $status = null;

    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SuggestPricesResultDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SuggestPricesResultDTO::class})
     */
    public ?\App\DTO\SuggestPricesResultDTO $result = null;

}
