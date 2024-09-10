<?php
/**
 * ConfirmShipmentRequest
 */
namespace app\Models;

/**
 * ConfirmShipmentRequest
 * @description Запрос для подтверждения отгрузки.
 */
class ConfirmShipmentRequest {

    /** @var string $externalShipmentId Идентификатор отгрузки в системе поставщика.*/
    public $externalShipmentId = "";

}
