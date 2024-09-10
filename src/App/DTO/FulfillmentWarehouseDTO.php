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
     * @var int|null
     */
    public $id;

    /**
     * Название склада.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseAddressDTO::class})
     * @var \App\DTO\WarehouseAddressDTO|null
     */
    public $address;

}
