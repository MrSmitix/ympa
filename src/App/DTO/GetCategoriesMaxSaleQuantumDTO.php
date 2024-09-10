<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 */
class GetCategoriesMaxSaleQuantumDTO
{
    /**
     * Категории и лимит на установку кванта и минимального количества товаров.
     * @DTA\Data(field="results")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\MaxSaleQuantumDTO[]|null
     */
    public $results;

    /**
     * Ошибки, которые появились из-за переданных категорий.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CategoryErrorDTO[]|null
     */
    public $errors;

}