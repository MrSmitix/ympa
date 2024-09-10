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
     * @var float|null
     */
    public $min_value;

    /**
     * Максимальное число.
     * @DTA\Data(field="maxValue", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $max_value;

    /**
     * Максимальная длина текста.
     * @DTA\Data(field="maxLength", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_length;

}
