<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Составляющая индекса качества.
 */
class QualityRatingComponentDTO
{
    /**
     * Значение составляющей в процентах.
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":100, "inclusive":true})
     * @var float|null
     */
    public $value;

    /**
     * @DTA\Data(field="componentType")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QualityRatingComponentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QualityRatingComponentType::class})
     * @var \App\DTO\QualityRatingComponentType|null
     */
    public $component_type;

}
