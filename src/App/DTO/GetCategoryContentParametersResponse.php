<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 */
class GetCategoryContentParametersResponse
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ApiResponseStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ApiResponseStatusType::class})
     */
    public ?\App\DTO\ApiResponseStatusType $status = null;

    /**
     * @DTA\Data(field="result", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CategoryContentParametersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CategoryContentParametersDTO::class})
     */
    public ?\App\DTO\CategoryContentParametersDTO $result = null;

}
