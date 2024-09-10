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
     */
    public ?\App\DTO\ShipmentStatusType $status = null;

    /**
     * Описание статуса отгрузки.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Время последнего изменения статуса отгрузки.
     * @DTA\Data(field="updateTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $update_time = null;

}
