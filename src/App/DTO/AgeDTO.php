<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Возраст в заданных единицах измерения.
 */
class AgeDTO
{
    /**
     * Значение.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var float|null
     */
    public $value;

    /**
     * @DTA\Data(field="ageUnit")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AgeUnitType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AgeUnitType::class})
     * @var \App\DTO\AgeUnitType|null
     */
    public $age_unit;

}
