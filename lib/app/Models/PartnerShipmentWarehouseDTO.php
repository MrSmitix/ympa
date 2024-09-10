<?php
/**
 * PartnerShipmentWarehouseDTO
 */
namespace app\Models;

/**
 * PartnerShipmentWarehouseDTO
 * @description Данные о складе отправления.
 */
class PartnerShipmentWarehouseDTO {

    /** @var int $id Идентификатор склада отправления.*/
    public $id = 0;

    /** @var string $name Наименование склада отправления.*/
    public $name = "";

    /** @var string $address Адрес склада отправления.*/
    public $address = "";

}
