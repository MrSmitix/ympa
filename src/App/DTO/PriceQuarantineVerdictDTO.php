<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Причина попадания товара в карантин.
 */
class PriceQuarantineVerdictDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceQuarantineVerdictType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceQuarantineVerdictType::class})
     * @var \App\DTO\PriceQuarantineVerdictType|null
     */
    public $type;

    /**
     * Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
     * @DTA\Data(field="params")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\PriceQuarantineVerdictParameterDTO[]|null
     */
    public $params;

}
