<?php
/**
 * GenerateShipmentListDocumentReportRequest
 */
namespace app\Models;

/**
 * GenerateShipmentListDocumentReportRequest
 * @description Данные, необходимые для генерации документа.
 */
class GenerateShipmentListDocumentReportRequest {

    /** @var int $campaignId Идентификатор кампании.*/
    public $campaignId = 0;

    /** @var int $shipmentId Идентификатор отгрузки.*/
    public $shipmentId = 0;

    /** @var int[]|null $orderIds Фильтр по идентификаторам заказа в отгрузке.*/
    public $orderIds = null;

}
