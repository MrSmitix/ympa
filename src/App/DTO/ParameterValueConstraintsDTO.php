<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ограничения на значения характеристик.
 */
class ParameterValueConstraintsDTO
{
    /**
     * Минимальное число.
     * @DTA\Data(field="minValue", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $min_value = null;

    /**
     * Максимальное число.
     * @DTA\Data(field="maxValue", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $max_value = null;

    /**
     * Максимальная длина текста.
     * @DTA\Data(field="maxLength", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_length = null;

}
