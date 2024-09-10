<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Склад Маркета (FBY).
 */
class FulfillmentWarehouseDTO
{
    /**
     * Идентификатор склада.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Название склада.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseAddressDTO::class})
     */
    public ?\App\DTO\WarehouseAddressDTO $address = null;

}
