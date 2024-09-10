<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о складах и группах складов.
 */
class WarehousesDTO
{
    /**
     * Список складов, не входящих в группы.
     * @DTA\Data(field="warehouses")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\WarehouseDTO[]|null
     */
    public $warehouses;

    /**
     * Список групп складов.
     * @DTA\Data(field="warehouseGroups")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\WarehouseGroupDTO[]|null
     */
    public $warehouse_groups;

}