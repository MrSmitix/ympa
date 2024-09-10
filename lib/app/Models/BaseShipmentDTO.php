<?php
/**
 * BaseShipmentDTO
 */
namespace app\Models;

/**
 * BaseShipmentDTO
 * @description Информация об отгрузке.
 */
class BaseShipmentDTO {

    /** @var int $id Идентификатор отгрузки.*/
    public $id = 0;

    /** @var \DateTime $planIntervalFrom Начало планового интервала отгрузки.*/
    public $planIntervalFrom;

    /** @var \DateTime $planIntervalTo Конец планового интервала отгрузки.*/
    public $planIntervalTo;

    /** @var string $shipmentType */
    public $shipmentType = "";

    /** @var \app\Models\PartnerShipmentWarehouseDTO $warehouse */
    public $warehouse;

    /** @var \app\Models\PartnerShipmentWarehouseDTO $warehouseTo */
    public $warehouseTo;

    /** @var string $externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.*/
    public $externalId = "";

    /** @var \app\Models\DeliveryServiceDTO $deliveryService */
    public $deliveryService;

    /** @var \app\Models\PalletsCountDTO $palletsCount */
    public $palletsCount;

    /** @var int[] $orderIds Идентификаторы заказов в отгрузке.*/
    public $orderIds = [];

    /** @var int $draftCount Количество заказов, которое Маркет запланировал к отгрузке.*/
    public $draftCount = 0;

    /** @var int $plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.*/
    public $plannedCount = 0;

    /** @var int $factCount Количество заказов, принятых в сортировочном центре или пункте приема.*/
    public $factCount = 0;

}
