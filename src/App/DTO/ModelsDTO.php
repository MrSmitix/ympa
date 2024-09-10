<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список моделей товаров.
 */
class ModelsDTO
{
    /**
     * Список моделей товаров.
     * @DTA\Data(field="models")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ModelDTO[]|null
     */
    public $models;

}
