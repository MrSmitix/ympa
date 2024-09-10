<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Список с информацией об отгрузках.
 */
class ShipmentInfoDTO
{
    /**
     * Идентификатор отгрузки.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Начало планового интервала отгрузки.
     * @DTA\Data(field="planIntervalFrom", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $plan_interval_from = null;

    /**
     * Конец планового интервала отгрузки.
     * @DTA\Data(field="planIntervalTo", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $plan_interval_to = null;

    /**
     * @DTA\Data(field="shipmentType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShipmentType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShipmentType::class})
     */
    public ?\App\DTO\ShipmentType $shipment_type = null;

    /**
     * @DTA\Data(field="warehouse", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     */
    public ?\App\DTO\PartnerShipmentWarehouseDTO $warehouse = null;

    /**
     * @DTA\Data(field="warehouseTo", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PartnerShipmentWarehouseDTO::class})
     */
    public ?\App\DTO\PartnerShipmentWarehouseDTO $warehouse_to = null;

    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
     * @DTA\Data(field="externalId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $external_id = null;

    /**
     * @DTA\Data(field="deliveryService", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DeliveryServiceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DeliveryServiceDTO::class})
     */
    public ?\App\DTO\DeliveryServiceDTO $delivery_service = null;

    /**
     * @DTA\Data(field="palletsCount", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PalletsCountDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PalletsCountDTO::class})
     */
    public ?\App\DTO\PalletsCountDTO $pallets_count = null;

    /**
     * Идентификаторы заказов в отгрузке.
     * @DTA\Data(field="orderIds")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $order_ids = null;

    /**
     * Количество заказов, которое Маркет запланировал к отгрузке.
     * @DTA\Data(field="draftCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $draft_count = null;

    /**
     * Количество заказов, которое Маркет подтвердил к отгрузке.
     * @DTA\Data(field="plannedCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $planned_count = null;

    /**
     * Количество заказов, принятых в сортировочном центре или пункте приема.
     * @DTA\Data(field="factCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $fact_count = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShipmentStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShipmentStatusType::class})
     */
    public ?\App\DTO\ShipmentStatusType $status = null;

    /**
     * Описание статуса отгрузки.
     * @DTA\Data(field="statusDescription", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status_description = null;

    /**
     * Время последнего изменения статуса отгрузки.
     * @DTA\Data(field="statusUpdateTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $status_update_time = null;

}
