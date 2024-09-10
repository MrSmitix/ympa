<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о коробке.
 */
class OrderBoxLayoutDTO
{
    /**
     * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection29::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection29::class})
     * @var \App\DTO\Collection29|null
     */
    public $items;

}
