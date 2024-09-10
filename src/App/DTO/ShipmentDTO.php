<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об отгрузке.
 */
class ShipmentDTO
{
    /**
     * Идентификатор отгрузки.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Начало планового интервала отгрузки.
     * @DTA\Data(field="planIntervalFrom", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $plan_interval_from;

    /**
     * Конец планового интервала отгрузки.
     * @DTA\Data(field="planIntervalTo", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $plan_interval_to;

    /**
     * @DTA\Data(field="shipmentType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShipmentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShipmentType::class})
     * @var \App\DTO\ShipmentType|null
     */
    public $shipment_type;

    /**
     * @DTA\Data(field="warehouse", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     * @var \App\DTO\PartnerShipmentWarehouseDTO|null
     */
    public $warehouse;

    /**
     * @DTA\Data(field="warehouseTo", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     * @var \App\DTO\PartnerShipmentWarehouseDTO|null
     */
    public $warehouse_to;

    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
     * @DTA\Data(field="externalId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $external_id;

    /**
     * @DTA\Data(field="deliveryService", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DeliveryServiceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DeliveryServiceDTO::class})
     * @var \App\DTO\DeliveryServiceDTO|null
     */
    public $delivery_service;

    /**
     * @DTA\Data(field="palletsCount", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PalletsCountDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PalletsCountDTO::class})
     * @var \App\DTO\PalletsCountDTO|null
     */
    public $pallets_count;

    /**
     * Идентификаторы заказов в отгрузке.
     * @DTA\Data(field="orderIds")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var int[]|null
     */
    public $order_ids;

    /**
     * Количество заказов, которое Маркет запланировал к отгрузке.
     * @DTA\Data(field="draftCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $draft_count;

    /**
     * Количество заказов, которое Маркет подтвердил к отгрузке.
     * @DTA\Data(field="plannedCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $planned_count;

    /**
     * Количество заказов, принятых в сортировочном центре или пункте приема.
     * @DTA\Data(field="factCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fact_count;

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
