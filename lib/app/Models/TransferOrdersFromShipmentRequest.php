<?php
/**
 * TransferOrdersFromShipmentRequest
 */
namespace app\Models;

/**
 * TransferOrdersFromShipmentRequest
 * @description Запрос переноса заказов из отгрузки.
 */
class TransferOrdersFromShipmentRequest {

    /** @var int[] $orderIds Список заказов, которые вы не успеваете подготовить.*/
    public $orderIds = [];

}
