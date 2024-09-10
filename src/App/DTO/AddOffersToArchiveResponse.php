<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Результат архивации товаров.
 */
class AddOffersToArchiveResponse
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AddOffersToArchiveDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AddOffersToArchiveDTO::class})
     * @var \App\DTO\AddOffersToArchiveDTO|null
     */
    public $result;

}
