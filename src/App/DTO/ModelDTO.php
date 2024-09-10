<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Модель товара.
 */
class ModelDTO
{
    /**
     * Идентификатор модели товара.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Название модели товара.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="prices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModelPriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModelPriceDTO::class})
     */
    public ?\App\DTO\ModelPriceDTO $prices = null;

}
