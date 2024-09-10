<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры запроса категорий.
 */
class GetCategoriesRequest
{
    /**
     * @DTA\Data(field="language", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LanguageType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LanguageType::class})
     */
    public ?\App\DTO\LanguageType $language = null;

}
