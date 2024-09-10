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
     * @var int|null
     */
    public $id;

    /**
     * Название модели товара.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="prices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModelPriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModelPriceDTO::class})
     * @var \App\DTO\ModelPriceDTO|null
     */
    public $prices;

}
