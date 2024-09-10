<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о ценах на модель товара.
 */
class ModelPriceDTO
{
    /**
     * Средняя цена предложения для модели в регионе.
     * @DTA\Data(field="avg", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $avg;

    /**
     * Максимальная цена предложения для модели в регионе.
     * @DTA\Data(field="max", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $max;

    /**
     * Минимальная цена предложения для модели в регионе.
     * @DTA\Data(field="min", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $min;

}