<?php
/**
 * OrderDeliveryAddressDTO
 */
namespace app\Models;

/**
 * OrderDeliveryAddressDTO
 * @description Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи).
 */
class OrderDeliveryAddressDTO {

    /** @var string $country Страна.  Обязательный параметр.*/
    public $country = "";

    /** @var string $postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).*/
    public $postcode = "";

    /** @var string $city Город или населенный пункт.  Обязательный параметр.*/
    public $city = "";

    /** @var string $district Район.*/
    public $district = "";

    /** @var string $subway Станция метро.*/
    public $subway = "";

    /** @var string $street Улица.  Обязательный параметр.*/
    public $street = "";

    /** @var string $house Дом или владение.  Обязательный параметр.*/
    public $house = "";

    /** @var string $block Корпус или строение.*/
    public $block = "";

    /** @var string $entrance Подъезд.*/
    public $entrance = "";

    /** @var string $entryphone Код домофона.*/
    public $entryphone = "";

    /** @var string $floor Этаж.*/
    public $floor = "";

    /** @var string $apartment Квартира или офис.*/
    public $apartment = "";

    /** @var string $phone Телефон получателя заказа.  Обязательный параметр.*/
    public $phone = "";

    /** @var string $recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр.*/
    public $recipient = "";

    /** @var \app\Models\GpsDTO $gps */
    public $gps;

}
