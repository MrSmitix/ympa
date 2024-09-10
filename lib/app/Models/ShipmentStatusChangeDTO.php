<?php
/**
 * ShipmentStatusChangeDTO
 */
namespace app\Models;

/**
 * ShipmentStatusChangeDTO
 * @description Статус отгрузки.
 */
class ShipmentStatusChangeDTO {

    /** @var string $status */
    public $status = "";

    /** @var string $description Описание статуса отгрузки.*/
    public $description = "";

    /** @var \DateTime $updateTime Время последнего изменения статуса отгрузки.*/
    public $updateTime;

}
