<?php
/**
 * OrderCourierDTO
 */
namespace app\Models;

/**
 * OrderCourierDTO
 * @description Информация о курьере.
 */
class OrderCourierDTO {

    /** @var string $fullName Полное имя курьера.*/
    public $fullName = "";

    /** @var string $phone Номер телефона курьера.*/
    public $phone = "";

    /** @var string $phoneExtension Добавочный номер телефона.*/
    public $phoneExtension = "";

    /** @var string $vehicleNumber Номер транспортного средства.*/
    public $vehicleNumber = "";

    /** @var string $vehicleDescription Описание машины. Например, модель и цвет.*/
    public $vehicleDescription = "";

}
