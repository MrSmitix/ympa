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
     * @DTA\Validator(name="Range", options={"min":0, "max":100})
     */
    public ?float $value = null;

    /**
     * @DTA\Data(field="componentType")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QualityRatingComponentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QualityRatingComponentType::class})
     */
    public ?\App\DTO\QualityRatingComponentType $component_type = null;

}
