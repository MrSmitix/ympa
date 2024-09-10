<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметр карантина.
 */
class PriceQuarantineVerdictParameterDTO
{
    /**
     * @DTA\Data(field="name")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceQuarantineVerdictParamNameType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceQuarantineVerdictParamNameType::class})
     * @var \App\DTO\PriceQuarantineVerdictParamNameType|null
     */
    public $name;

    /**
     * Значение параметра.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

}
