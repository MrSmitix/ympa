<?php
/**
 * SetShipmentPalletsCountRequest
 */
namespace app\Models;

/**
 * SetShipmentPalletsCountRequest
 * @description Запрос на передачу количества упаковок в отгрузке.
 */
class SetShipmentPalletsCountRequest {

    /** @var int $placesCount Количество упаковок в отгрузке.*/
    public $placesCount = 0;

}
