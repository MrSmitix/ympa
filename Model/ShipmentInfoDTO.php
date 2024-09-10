<?php
/**
 * ShipmentInfoDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */


namespace OpenAPIServer\Model;

/**
 * Class representing the ShipmentInfoDTO model.
 *
 * Список с информацией об отгрузках.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class ShipmentInfoDTO  implements \JsonSerializable
{
        /**
     * Идентификатор отгрузки.
     *
     * @var int|null
     * @SerializedName("id")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $id;

    /**
     * Начало планового интервала отгрузки.
     *
     * @var \DateTime|null
     * @SerializedName("planIntervalFrom")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public ?\DateTime $planIntervalFrom;

    /**
     * Конец планового интервала отгрузки.
     *
     * @var \DateTime|null
     * @SerializedName("planIntervalTo")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public ?\DateTime $planIntervalTo;

    /**
     * @var ShipmentType|null
     * @SerializedName("shipmentType")
        * @Accessor(getter="getSerializedShipmentType")
        * @Type("string")
     */
    public ?ShipmentType $shipmentType;

    /**
     * @var PartnerShipmentWarehouseDTO|null
     * @SerializedName("warehouse")
     * @Assert\Type("\OpenAPIServer\Model\PartnerShipmentWarehouseDTO")
     * @Type("\OpenAPIServer\Model\PartnerShipmentWarehouseDTO")
     */
    public ?PartnerShipmentWarehouseDTO $warehouse;

    /**
     * @var PartnerShipmentWarehouseDTO|null
     * @SerializedName("warehouseTo")
     * @Assert\Type("\OpenAPIServer\Model\PartnerShipmentWarehouseDTO")
     * @Type("\OpenAPIServer\Model\PartnerShipmentWarehouseDTO")
     */
    public ?PartnerShipmentWarehouseDTO $warehouseTo;

    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
     *
     * @var string|null
     * @SerializedName("externalId")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $externalId;

    /**
     * @var DeliveryServiceDTO|null
     * @SerializedName("deliveryService")
     * @Assert\Type("\OpenAPIServer\Model\DeliveryServiceDTO")
     * @Type("\OpenAPIServer\Model\DeliveryServiceDTO")
     */
    public ?DeliveryServiceDTO $deliveryService;

    /**
     * @var PalletsCountDTO|null
     * @SerializedName("palletsCount")
     * @Assert\Type("\OpenAPIServer\Model\PalletsCountDTO")
     * @Type("\OpenAPIServer\Model\PalletsCountDTO")
     */
    public ?PalletsCountDTO $palletsCount;

    /**
     * Идентификаторы заказов в отгрузке.
     *
     * @var int[]
     * @SerializedName("orderIds")
     * @Assert\NotNull()
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    public array $orderIds;

    /**
     * Количество заказов, которое Маркет запланировал к отгрузке.
     *
     * @var int|null
     * @SerializedName("draftCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $draftCount;

    /**
     * Количество заказов, которое Маркет подтвердил к отгрузке.
     *
     * @var int|null
     * @SerializedName("plannedCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $plannedCount;

    /**
     * Количество заказов, принятых в сортировочном центре или пункте приема.
     *
     * @var int|null
     * @SerializedName("factCount")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $factCount;

    /**
     * @var ShipmentStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?ShipmentStatusType $status;

    /**
     * Описание статуса отгрузки.
     *
     * @var string|null
     * @SerializedName("statusDescription")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $statusDescription;

    /**
     * Время последнего изменения статуса отгрузки.
     *
     * @var \DateTime|null
     * @SerializedName("statusUpdateTime")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public ?\DateTime $statusUpdateTime;

    /**
     * Constructor
     *
     * @param int|null $id
     * @param \DateTime|null $planIntervalFrom
     * @param \DateTime|null $planIntervalTo
     * @param ShipmentType|null $shipmentType
     * @param PartnerShipmentWarehouseDTO|null $warehouse
     * @param PartnerShipmentWarehouseDTO|null $warehouseTo
     * @param string|null $externalId
     * @param DeliveryServiceDTO|null $deliveryService
     * @param PalletsCountDTO|null $palletsCount
     * @param int[] $orderIds
     * @param int|null $draftCount
     * @param int|null $plannedCount
     * @param int|null $factCount
     * @param ShipmentStatusType|null $status
     * @param string|null $statusDescription
     * @param \DateTime|null $statusUpdateTime
     */
    public function __construct(?int $id, ?\DateTime $planIntervalFrom, ?\DateTime $planIntervalTo, ?ShipmentType $shipmentType, ?PartnerShipmentWarehouseDTO $warehouse, ?PartnerShipmentWarehouseDTO $warehouseTo, ?string $externalId, ?DeliveryServiceDTO $deliveryService, ?PalletsCountDTO $palletsCount, array $orderIds, ?int $draftCount, ?int $plannedCount, ?int $factCount, ?ShipmentStatusType $status, ?string $statusDescription, ?\DateTime $statusUpdateTime)
    {
        $this->id = $id;
        $this->planIntervalFrom = $planIntervalFrom;
        $this->planIntervalTo = $planIntervalTo;
        $this->shipmentType = $shipmentType;
        $this->warehouse = $warehouse;
        $this->warehouseTo = $warehouseTo;
        $this->externalId = $externalId;
        $this->deliveryService = $deliveryService;
        $this->palletsCount = $palletsCount;
        $this->orderIds = $orderIds;
        $this->draftCount = $draftCount;
        $this->plannedCount = $plannedCount;
        $this->factCount = $factCount;
        $this->status = $status;
        $this->statusDescription = $statusDescription;
        $this->statusUpdateTime = $statusUpdateTime;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['id'] ?? null, 
            isset($data['planIntervalFrom']) ? new \DateTime($data['planIntervalFrom']) : null, 
            isset($data['planIntervalTo']) ? new \DateTime($data['planIntervalTo']) : null, 
            isset($data['shipmentType']) ? ShipmentType::tryFrom($data['shipmentType']) : null, 
            isset($data['warehouse']) ? PartnerShipmentWarehouseDTO::fromArray($data['warehouse']) : null, 
            isset($data['warehouseTo']) ? PartnerShipmentWarehouseDTO::fromArray($data['warehouseTo']) : null, 
            $data['externalId'] ?? null, 
            isset($data['deliveryService']) ? DeliveryServiceDTO::fromArray($data['deliveryService']) : null, 
            isset($data['palletsCount']) ? PalletsCountDTO::fromArray($data['palletsCount']) : null, 
            $data['orderIds'] ?? null, 
            $data['draftCount'] ?? null, 
            $data['plannedCount'] ?? null, 
            $data['factCount'] ?? null, 
            isset($data['status']) ? ShipmentStatusType::tryFrom($data['status']) : null, 
            $data['statusDescription'] ?? null, 
            isset($data['statusUpdateTime']) ? new \DateTime($data['statusUpdateTime']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'id' => $this->id, 
            'planIntervalFrom' => $this->planIntervalFrom?->format('c'), 
            'planIntervalTo' => $this->planIntervalTo?->format('c'), 
            'shipmentType' => $this->shipmentType, 
            'warehouse' => $this->warehouse, 
            'warehouseTo' => $this->warehouseTo, 
            'externalId' => $this->externalId, 
            'deliveryService' => $this->deliveryService, 
            'palletsCount' => $this->palletsCount, 
            'orderIds' => $this->orderIds, 
            'draftCount' => $this->draftCount, 
            'plannedCount' => $this->plannedCount, 
            'factCount' => $this->factCount, 
            'status' => $this->status, 
            'statusDescription' => $this->statusDescription, 
            'statusUpdateTime' => $this->statusUpdateTime?->format('c'), 
        ];
    }
}


