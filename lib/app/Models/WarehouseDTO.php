<?php
/**
 * WarehouseDTO
 */
namespace app\Models;

/**
 * WarehouseDTO
 * @description Информация о складе.
 */
class WarehouseDTO {

    /** @var int $id Идентификатор склада.*/
    public $id = 0;

    /** @var string $name Название склада.*/
    public $name = "";

    /** @var int $campaignId Идентификатор кампании в API и идентификатор магазина.*/
    public $campaignId = 0;

    /** @var bool $express Возможна ли доставка по модели Экспресс.*/
    public $express = false;

    /** @var \app\Models\WarehouseAddressDTO $address */
    public $address;

}
