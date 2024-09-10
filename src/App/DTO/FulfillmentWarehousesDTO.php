<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список складов Маркета (FBY).
 */
class FulfillmentWarehousesDTO
{
    /**
     * Список складов Маркета (FBY).
     * @DTA\Data(field="warehouses")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warehouses = null;

}
