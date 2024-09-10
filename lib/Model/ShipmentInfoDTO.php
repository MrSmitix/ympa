<?php
/**
 * ShipmentInfoDTO
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * ShipmentInfoDTO Class Doc Comment
 *
 * @category Class
 * @description Список с информацией об отгрузках.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ShipmentInfoDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'ShipmentInfoDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'int',
        'plan_interval_from' => '\DateTime',
        'plan_interval_to' => '\DateTime',
        'shipment_type' => '\OpenAPI\Client\Model\ShipmentType',
        'warehouse' => '\OpenAPI\Client\Model\PartnerShipmentWarehouseDTO',
        'warehouse_to' => '\OpenAPI\Client\Model\PartnerShipmentWarehouseDTO',
        'external_id' => 'string',
        'delivery_service' => '\OpenAPI\Client\Model\DeliveryServiceDTO',
        'pallets_count' => '\OpenAPI\Client\Model\PalletsCountDTO',
        'order_ids' => 'int[]',
        'draft_count' => 'int',
        'planned_count' => 'int',
        'fact_count' => 'int',
        'status' => '\OpenAPI\Client\Model\ShipmentStatusType',
        'status_description' => 'string',
        'status_update_time' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'id' => 'int64',
        'plan_interval_from' => 'date-time',
        'plan_interval_to' => 'date-time',
        'shipment_type' => null,
        'warehouse' => null,
        'warehouse_to' => null,
        'external_id' => null,
        'delivery_service' => null,
        'pallets_count' => null,
        'order_ids' => 'int64',
        'draft_count' => 'int32',
        'planned_count' => 'int32',
        'fact_count' => 'int32',
        'status' => null,
        'status_description' => null,
        'status_update_time' => 'date-time'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'id' => false,
        'plan_interval_from' => false,
        'plan_interval_to' => false,
        'shipment_type' => false,
        'warehouse' => false,
        'warehouse_to' => false,
        'external_id' => false,
        'delivery_service' => false,
        'pallets_count' => false,
        'order_ids' => false,
        'draft_count' => false,
        'planned_count' => false,
        'fact_count' => false,
        'status' => false,
        'status_description' => false,
        'status_update_time' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'plan_interval_from' => 'planIntervalFrom',
        'plan_interval_to' => 'planIntervalTo',
        'shipment_type' => 'shipmentType',
        'warehouse' => 'warehouse',
        'warehouse_to' => 'warehouseTo',
        'external_id' => 'externalId',
        'delivery_service' => 'deliveryService',
        'pallets_count' => 'palletsCount',
        'order_ids' => 'orderIds',
        'draft_count' => 'draftCount',
        'planned_count' => 'plannedCount',
        'fact_count' => 'factCount',
        'status' => 'status',
        'status_description' => 'statusDescription',
        'status_update_time' => 'statusUpdateTime'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'plan_interval_from' => 'setPlanIntervalFrom',
        'plan_interval_to' => 'setPlanIntervalTo',
        'shipment_type' => 'setShipmentType',
        'warehouse' => 'setWarehouse',
        'warehouse_to' => 'setWarehouseTo',
        'external_id' => 'setExternalId',
        'delivery_service' => 'setDeliveryService',
        'pallets_count' => 'setPalletsCount',
        'order_ids' => 'setOrderIds',
        'draft_count' => 'setDraftCount',
        'planned_count' => 'setPlannedCount',
        'fact_count' => 'setFactCount',
        'status' => 'setStatus',
        'status_description' => 'setStatusDescription',
        'status_update_time' => 'setStatusUpdateTime'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'plan_interval_from' => 'getPlanIntervalFrom',
        'plan_interval_to' => 'getPlanIntervalTo',
        'shipment_type' => 'getShipmentType',
        'warehouse' => 'getWarehouse',
        'warehouse_to' => 'getWarehouseTo',
        'external_id' => 'getExternalId',
        'delivery_service' => 'getDeliveryService',
        'pallets_count' => 'getPalletsCount',
        'order_ids' => 'getOrderIds',
        'draft_count' => 'getDraftCount',
        'planned_count' => 'getPlannedCount',
        'fact_count' => 'getFactCount',
        'status' => 'getStatus',
        'status_description' => 'getStatusDescription',
        'status_update_time' => 'getStatusUpdateTime'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('plan_interval_from', $data ?? [], null);
        $this->setIfExists('plan_interval_to', $data ?? [], null);
        $this->setIfExists('shipment_type', $data ?? [], null);
        $this->setIfExists('warehouse', $data ?? [], null);
        $this->setIfExists('warehouse_to', $data ?? [], null);
        $this->setIfExists('external_id', $data ?? [], null);
        $this->setIfExists('delivery_service', $data ?? [], null);
        $this->setIfExists('pallets_count', $data ?? [], null);
        $this->setIfExists('order_ids', $data ?? [], null);
        $this->setIfExists('draft_count', $data ?? [], null);
        $this->setIfExists('planned_count', $data ?? [], null);
        $this->setIfExists('fact_count', $data ?? [], null);
        $this->setIfExists('status', $data ?? [], null);
        $this->setIfExists('status_description', $data ?? [], null);
        $this->setIfExists('status_update_time', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['order_ids'] === null) {
            $invalidProperties[] = "'order_ids' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id Идентификатор отгрузки.
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets plan_interval_from
     *
     * @return \DateTime|null
     */
    public function getPlanIntervalFrom()
    {
        return $this->container['plan_interval_from'];
    }

    /**
     * Sets plan_interval_from
     *
     * @param \DateTime|null $plan_interval_from Начало планового интервала отгрузки.
     *
     * @return self
     */
    public function setPlanIntervalFrom($plan_interval_from)
    {
        if (is_null($plan_interval_from)) {
            throw new \InvalidArgumentException('non-nullable plan_interval_from cannot be null');
        }
        $this->container['plan_interval_from'] = $plan_interval_from;

        return $this;
    }

    /**
     * Gets plan_interval_to
     *
     * @return \DateTime|null
     */
    public function getPlanIntervalTo()
    {
        return $this->container['plan_interval_to'];
    }

    /**
     * Sets plan_interval_to
     *
     * @param \DateTime|null $plan_interval_to Конец планового интервала отгрузки.
     *
     * @return self
     */
    public function setPlanIntervalTo($plan_interval_to)
    {
        if (is_null($plan_interval_to)) {
            throw new \InvalidArgumentException('non-nullable plan_interval_to cannot be null');
        }
        $this->container['plan_interval_to'] = $plan_interval_to;

        return $this;
    }

    /**
     * Gets shipment_type
     *
     * @return \OpenAPI\Client\Model\ShipmentType|null
     */
    public function getShipmentType()
    {
        return $this->container['shipment_type'];
    }

    /**
     * Sets shipment_type
     *
     * @param \OpenAPI\Client\Model\ShipmentType|null $shipment_type shipment_type
     *
     * @return self
     */
    public function setShipmentType($shipment_type)
    {
        if (is_null($shipment_type)) {
            throw new \InvalidArgumentException('non-nullable shipment_type cannot be null');
        }
        $this->container['shipment_type'] = $shipment_type;

        return $this;
    }

    /**
     * Gets warehouse
     *
     * @return \OpenAPI\Client\Model\PartnerShipmentWarehouseDTO|null
     */
    public function getWarehouse()
    {
        return $this->container['warehouse'];
    }

    /**
     * Sets warehouse
     *
     * @param \OpenAPI\Client\Model\PartnerShipmentWarehouseDTO|null $warehouse warehouse
     *
     * @return self
     */
    public function setWarehouse($warehouse)
    {
        if (is_null($warehouse)) {
            throw new \InvalidArgumentException('non-nullable warehouse cannot be null');
        }
        $this->container['warehouse'] = $warehouse;

        return $this;
    }

    /**
     * Gets warehouse_to
     *
     * @return \OpenAPI\Client\Model\PartnerShipmentWarehouseDTO|null
     */
    public function getWarehouseTo()
    {
        return $this->container['warehouse_to'];
    }

    /**
     * Sets warehouse_to
     *
     * @param \OpenAPI\Client\Model\PartnerShipmentWarehouseDTO|null $warehouse_to warehouse_to
     *
     * @return self
     */
    public function setWarehouseTo($warehouse_to)
    {
        if (is_null($warehouse_to)) {
            throw new \InvalidArgumentException('non-nullable warehouse_to cannot be null');
        }
        $this->container['warehouse_to'] = $warehouse_to;

        return $this;
    }

    /**
     * Gets external_id
     *
     * @return string|null
     */
    public function getExternalId()
    {
        return $this->container['external_id'];
    }

    /**
     * Sets external_id
     *
     * @param string|null $external_id Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
     *
     * @return self
     */
    public function setExternalId($external_id)
    {
        if (is_null($external_id)) {
            throw new \InvalidArgumentException('non-nullable external_id cannot be null');
        }
        $this->container['external_id'] = $external_id;

        return $this;
    }

    /**
     * Gets delivery_service
     *
     * @return \OpenAPI\Client\Model\DeliveryServiceDTO|null
     */
    public function getDeliveryService()
    {
        return $this->container['delivery_service'];
    }

    /**
     * Sets delivery_service
     *
     * @param \OpenAPI\Client\Model\DeliveryServiceDTO|null $delivery_service delivery_service
     *
     * @return self
     */
    public function setDeliveryService($delivery_service)
    {
        if (is_null($delivery_service)) {
            throw new \InvalidArgumentException('non-nullable delivery_service cannot be null');
        }
        $this->container['delivery_service'] = $delivery_service;

        return $this;
    }

    /**
     * Gets pallets_count
     *
     * @return \OpenAPI\Client\Model\PalletsCountDTO|null
     */
    public function getPalletsCount()
    {
        return $this->container['pallets_count'];
    }

    /**
     * Sets pallets_count
     *
     * @param \OpenAPI\Client\Model\PalletsCountDTO|null $pallets_count pallets_count
     *
     * @return self
     */
    public function setPalletsCount($pallets_count)
    {
        if (is_null($pallets_count)) {
            throw new \InvalidArgumentException('non-nullable pallets_count cannot be null');
        }
        $this->container['pallets_count'] = $pallets_count;

        return $this;
    }

    /**
     * Gets order_ids
     *
     * @return int[]
     */
    public function getOrderIds()
    {
        return $this->container['order_ids'];
    }

    /**
     * Sets order_ids
     *
     * @param int[] $order_ids Идентификаторы заказов в отгрузке.
     *
     * @return self
     */
    public function setOrderIds($order_ids)
    {
        if (is_null($order_ids)) {
            throw new \InvalidArgumentException('non-nullable order_ids cannot be null');
        }


        $this->container['order_ids'] = $order_ids;

        return $this;
    }

    /**
     * Gets draft_count
     *
     * @return int|null
     */
    public function getDraftCount()
    {
        return $this->container['draft_count'];
    }

    /**
     * Sets draft_count
     *
     * @param int|null $draft_count Количество заказов, которое Маркет запланировал к отгрузке.
     *
     * @return self
     */
    public function setDraftCount($draft_count)
    {
        if (is_null($draft_count)) {
            throw new \InvalidArgumentException('non-nullable draft_count cannot be null');
        }
        $this->container['draft_count'] = $draft_count;

        return $this;
    }

    /**
     * Gets planned_count
     *
     * @return int|null
     */
    public function getPlannedCount()
    {
        return $this->container['planned_count'];
    }

    /**
     * Sets planned_count
     *
     * @param int|null $planned_count Количество заказов, которое Маркет подтвердил к отгрузке.
     *
     * @return self
     */
    public function setPlannedCount($planned_count)
    {
        if (is_null($planned_count)) {
            throw new \InvalidArgumentException('non-nullable planned_count cannot be null');
        }
        $this->container['planned_count'] = $planned_count;

        return $this;
    }

    /**
     * Gets fact_count
     *
     * @return int|null
     */
    public function getFactCount()
    {
        return $this->container['fact_count'];
    }

    /**
     * Sets fact_count
     *
     * @param int|null $fact_count Количество заказов, принятых в сортировочном центре или пункте приема.
     *
     * @return self
     */
    public function setFactCount($fact_count)
    {
        if (is_null($fact_count)) {
            throw new \InvalidArgumentException('non-nullable fact_count cannot be null');
        }
        $this->container['fact_count'] = $fact_count;

        return $this;
    }

    /**
     * Gets status
     *
     * @return \OpenAPI\Client\Model\ShipmentStatusType|null
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param \OpenAPI\Client\Model\ShipmentStatusType|null $status status
     *
     * @return self
     */
    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets status_description
     *
     * @return string|null
     */
    public function getStatusDescription()
    {
        return $this->container['status_description'];
    }

    /**
     * Sets status_description
     *
     * @param string|null $status_description Описание статуса отгрузки.
     *
     * @return self
     */
    public function setStatusDescription($status_description)
    {
        if (is_null($status_description)) {
            throw new \InvalidArgumentException('non-nullable status_description cannot be null');
        }
        $this->container['status_description'] = $status_description;

        return $this;
    }

    /**
     * Gets status_update_time
     *
     * @return \DateTime|null
     */
    public function getStatusUpdateTime()
    {
        return $this->container['status_update_time'];
    }

    /**
     * Sets status_update_time
     *
     * @param \DateTime|null $status_update_time Время последнего изменения статуса отгрузки.
     *
     * @return self
     */
    public function setStatusUpdateTime($status_update_time)
    {
        if (is_null($status_update_time)) {
            throw new \InvalidArgumentException('non-nullable status_update_time cannot be null');
        }
        $this->container['status_update_time'] = $status_update_time;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


