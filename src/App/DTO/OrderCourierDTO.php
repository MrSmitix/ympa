<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о курьере.
 */
class OrderCourierDTO
{
    /**
     * Полное имя курьера.
     * @DTA\Data(field="fullName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $full_name;

    /**
     * Номер телефона курьера.
     * @DTA\Data(field="phone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $phone;

    /**
     * Добавочный номер телефона.
     * @DTA\Data(field="phoneExtension", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $phone_extension;

    /**
     * Номер транспортного средства.
     * @DTA\Data(field="vehicleNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $vehicle_number;

    /**
     * Описание машины. Например, модель и цвет.
     * @DTA\Data(field="vehicleDescription", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $vehicle_description;

}
