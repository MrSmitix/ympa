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
     */
    public ?string $full_name = null;

    /**
     * Номер телефона курьера.
     * @DTA\Data(field="phone", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $phone = null;

    /**
     * Добавочный номер телефона.
     * @DTA\Data(field="phoneExtension", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $phone_extension = null;

    /**
     * Номер транспортного средства.
     * @DTA\Data(field="vehicleNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $vehicle_number = null;

    /**
     * Описание машины. Например, модель и цвет.
     * @DTA\Data(field="vehicleDescription", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $vehicle_description = null;

}
