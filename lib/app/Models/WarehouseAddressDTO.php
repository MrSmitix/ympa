<?php
/**
 * WarehouseAddressDTO
 */
namespace app\Models;

/**
 * WarehouseAddressDTO
 * @description Адрес склада.
 */
class WarehouseAddressDTO {

    /** @var string $city Город.*/
    public $city = "";

    /** @var string $street Улица.*/
    public $street = "";

    /** @var string $number Номер дома.*/
    public $number = "";

    /** @var string $building Номер строения.*/
    public $building = "";

    /** @var string $block Номер корпуса.*/
    public $block = "";

    /** @var \app\Models\GpsDTO $gps */
    public $gps;

}
