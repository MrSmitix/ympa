<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список моделей товаров.
 */
class EnrichedModelsDTO
{
    /**
     * Список моделей товаров.
     * @DTA\Data(field="models")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $models = null;

}
