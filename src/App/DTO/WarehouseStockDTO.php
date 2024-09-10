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
     */
    public ?\App\DTO\WarehouseStockType $type = null;

    /**
     * Значение остатков.
     * @DTA\Data(field="count")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $count = null;

}
