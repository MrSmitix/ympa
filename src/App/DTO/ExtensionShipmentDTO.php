<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об отгрузке.
 */
class ExtensionShipmentDTO
{
    /**
     * @DTA\Data(field="currentStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShipmentStatusChangeDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShipmentStatusChangeDTO::class})
     * @var \App\DTO\ShipmentStatusChangeDTO|null
     */
    public $current_status;

    /**
     * Доступные действия над отгрузкой.
     * @DTA\Data(field="availableActions")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ShipmentActionType[]|null
     */
    public $available_actions;

}
