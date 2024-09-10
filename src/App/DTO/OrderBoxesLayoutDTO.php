<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Распределение товаров по коробкам.
 */
class OrderBoxesLayoutDTO
{
    /**
     * Список коробок.
     * @DTA\Data(field="boxes")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\EnrichedOrderBoxLayoutDTO[]|null
     */
    public $boxes;

}