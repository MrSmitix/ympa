<?php
/**
 * ExtensionShipmentDTO
 */
namespace app\Models;

/**
 * ExtensionShipmentDTO
 * @description Информация об отгрузке.
 */
class ExtensionShipmentDTO {

    /** @var \app\Models\ShipmentStatusChangeDTO $currentStatus */
    public $currentStatus;

    /** @var \app\Models\ShipmentActionType[] $availableActions Доступные действия над отгрузкой.*/
    public $availableActions = [];

}
