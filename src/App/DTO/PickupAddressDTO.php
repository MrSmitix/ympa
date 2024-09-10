<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Адрес доставки.
 */
class PickupAddressDTO
{
    /**
     * Страна.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $country;

    /**
     * Город.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $city;

    /**
     * Улица.
     * @DTA\Data(field="street", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $street;

    /**
     * Номер дома.
     * @DTA\Data(field="house", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $house;

    /**
     * Почтовый индекс.
     * @DTA\Data(field="postcode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $postcode;

}
