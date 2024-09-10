<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Тип цены.
 */
class PriceSuggestDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceSuggestType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceSuggestType::class})
     */
    public ?\App\DTO\PriceSuggestType $type = null;

    /**
     * Цена в рублях.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $price = null;

}
