<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о группе складов.
 */
class WarehouseGroupDTO
{
    /**
     * Название группы складов.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="mainWarehouse")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseDTO::class})
     */
    public ?\App\DTO\WarehouseDTO $main_warehouse = null;

    /**
     * Список складов, входящих в группу.
     * @DTA\Data(field="warehouses")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warehouses = null;

}
