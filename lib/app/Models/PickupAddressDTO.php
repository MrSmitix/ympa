<?php
/**
 * PickupAddressDTO
 */
namespace app\Models;

/**
 * PickupAddressDTO
 * @description Адрес доставки.
 */
class PickupAddressDTO {

    /** @var string $country Страна.*/
    public $country = "";

    /** @var string $city Город.*/
    public $city = "";

    /** @var string $street Улица.*/
    public $street = "";

    /** @var string $house Номер дома.*/
    public $house = "";

    /** @var string $postcode Почтовый индекс.*/
    public $postcode = "";

}
