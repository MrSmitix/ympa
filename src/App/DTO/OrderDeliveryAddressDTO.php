<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи).
 */
class OrderDeliveryAddressDTO
{
    /**
     * Страна.  Обязательный параметр.
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $country = null;

    /**
     * Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).
     * @DTA\Data(field="postcode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $postcode = null;

    /**
     * Город или населенный пункт.  Обязательный параметр.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $city = null;

    /**
     * Район.
     * @DTA\Data(field="district", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $district = null;

    /**
     * Станция метро.
     * @DTA\Data(field="subway", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $subway = null;

    /**
     * Улица.  Обязательный параметр.
     * @DTA\Data(field="street", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $street = null;

    /**
     * Дом или владение.  Обязательный параметр.
     * @DTA\Data(field="house", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $house = null;

    /**
     * Корпус или строение.
     * @DTA\Data(field="block", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $block = null;

    /**
     * Подъезд.
     * @DTA\Data(field="entrance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entrance = null;

    /**
     * Код домофона.
     * @DTA\Data(field="entryphone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entryphone = null;

    /**
     * Этаж.
     * @DTA\Data(field="floor", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $floor = null;

    /**
     * Квартира или офис.
     * @DTA\Data(field="apartment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $apartment = null;

    /**
     * Телефон получателя заказа.  Обязательный параметр.
     * @DTA\Data(field="phone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $phone = null;

    /**
     * Фамилия, имя и отчество получателя заказа.  Обязательный параметр.
     * @DTA\Data(field="recipient", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $recipient = null;

    /**
     * @DTA\Data(field="gps", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GpsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GpsDTO::class})
     */
    public ?\App\DTO\GpsDTO $gps = null;

}
