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
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="mainWarehouse")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseDTO::class})
     * @var \App\DTO\WarehouseDTO|null
     */
    public $main_warehouse;

    /**
     * Список складов, входящих в группу.
     * @DTA\Data(field="warehouses")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\WarehouseDTO[]|null
     */
    public $warehouses;

}
