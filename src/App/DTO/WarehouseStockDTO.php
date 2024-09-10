<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об остатках товара.
 */
class WarehouseStockDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseStockType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseStockType::class})
     * @var \App\DTO\WarehouseStockType|null
     */
    public $type;

    /**
     * Значение остатков.
     * @DTA\Data(field="count")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $count;

}
