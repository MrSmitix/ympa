<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об остатках товаров на складе.
 */
class WarehouseOffersDTO
{
    /**
     * Идентификатор склада.
     * @DTA\Data(field="warehouseId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $warehouse_id = null;

    /**
     * Информация об остатках.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $offers = null;

}
