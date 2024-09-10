<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров.
 */
class GetCategoriesMaxSaleQuantumRequest
{
    /**
     * Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
     * @DTA\Data(field="marketCategoryIds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection120::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection120::class})
     * @var \App\DTO\Collection120|null
     */
    public $market_category_ids;

}
