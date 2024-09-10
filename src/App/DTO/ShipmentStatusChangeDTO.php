<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Статус отгрузки.
 */
class ShipmentStatusChangeDTO
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShipmentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShipmentStatusType::class})
     * @var \App\DTO\ShipmentStatusType|null
     */
    public $status;

    /**
     * Описание статуса отгрузки.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * Время последнего изменения статуса отгрузки.
     * @DTA\Data(field="updateTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $update_time;

}
