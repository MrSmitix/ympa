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
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?float $value = null;

    /**
     * @DTA\Data(field="ageUnit")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AgeUnitType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AgeUnitType::class})
     */
    public ?\App\DTO\AgeUnitType $age_unit = null;

}
