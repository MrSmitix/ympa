<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Адрес склада.
 */
class WarehouseAddressDTO
{
    /**
     * Город.
     * @DTA\Data(field="city")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $city;

    /**
     * Улица.
     * @DTA\Data(field="street", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":512})
     * @var string|null
     */
    public $street;

    /**
     * Номер дома.
     * @DTA\Data(field="number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":256})
     * @var string|null
     */
    public $number;

    /**
     * Номер строения.
     * @DTA\Data(field="building", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":16})
     * @var string|null
     */
    public $building;

    /**
     * Номер корпуса.
     * @DTA\Data(field="block", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":16})
     * @var string|null
     */
    public $block;

    /**
     * @DTA\Data(field="gps")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GpsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GpsDTO::class})
     * @var \App\DTO\GpsDTO|null
     */
    public $gps;

}
