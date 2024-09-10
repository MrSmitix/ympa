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
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $city = null;

    /**
     * Улица.
     * @DTA\Data(field="street", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":512})
     */
    public ?string $street = null;

    /**
     * Номер дома.
     * @DTA\Data(field="number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $number = null;

    /**
     * Номер строения.
     * @DTA\Data(field="building", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":16})
     */
    public ?string $building = null;

    /**
     * Номер корпуса.
     * @DTA\Data(field="block", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":16})
     */
    public ?string $block = null;

    /**
     * @DTA\Data(field="gps")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GpsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GpsDTO::class})
     */
    public ?\App\DTO\GpsDTO $gps = null;

}
