<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос информации о моделях.
 */
class GetModelsRequest
{
    /**
     * Список моделей.
     * @DTA\Data(field="models")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection107::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection107::class})
     */
    public ?\App\DTO\Collection107 $models = null;

}
