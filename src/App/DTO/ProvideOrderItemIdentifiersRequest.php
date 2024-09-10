<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ProvideOrderItemIdentifiersRequest
{
    /**
     * Список позиций, требующих маркировки.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection23::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection23::class})
     * @var \App\DTO\Collection23|null
     */
    public $items;

}
