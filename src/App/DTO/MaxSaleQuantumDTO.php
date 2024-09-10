<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Лимит на установку кванта и минимального количества товаров по категориям.
 */
class MaxSaleQuantumDTO
{
    /**
     * Идентификатор категории.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Название категории.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Лимит на установку кванта и минимального количества товаров.
     * @DTA\Data(field="maxSaleQuantum", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_sale_quantum = null;

}
