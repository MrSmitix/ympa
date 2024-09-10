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
     * @var string|null
     */
    public $country;

    /**
     * Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).
     * @DTA\Data(field="postcode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $postcode;

    /**
     * Город или населенный пункт.  Обязательный параметр.
     * @DTA\Data(field="city", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $city;

    /**
     * Район.
     * @DTA\Data(field="district", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $district;

    /**
     * Станция метро.
     * @DTA\Data(field="subway", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $subway;

    /**
     * Улица.  Обязательный параметр.
     * @DTA\Data(field="street", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $street;

    /**
     * Дом или владение.  Обязательный параметр.
     * @DTA\Data(field="house", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $house;

    /**
     * Корпус или строение.
     * @DTA\Data(field="block", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $block;

    /**
     * Подъезд.
     * @DTA\Data(field="entrance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $entrance;

    /**
     * Код домофона.
     * @DTA\Data(field="entryphone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $entryphone;

    /**
     * Этаж.
     * @DTA\Data(field="floor", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $floor;

    /**
     * Квартира или офис.
     * @DTA\Data(field="apartment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $apartment;

    /**
     * Телефон получателя заказа.  Обязательный параметр.
     * @DTA\Data(field="phone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $phone;

    /**
     * Фамилия, имя и отчество получателя заказа.  Обязательный параметр.
     * @DTA\Data(field="recipient", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $recipient;

    /**
     * @DTA\Data(field="gps", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GpsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GpsDTO::class})
     * @var \App\DTO\GpsDTO|null
     */
    public $gps;

}
