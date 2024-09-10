<?php
/**
 * GenerateUnitedOrdersRequest
 *
 * PHP version 8.1
 *
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
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.8.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use ArrayAccess;
use JsonSerializable;
use InvalidArgumentException;
use ReturnTypeWillChange;
use OpenAPI\Client\ObjectSerializer;

/**
 * GenerateUnitedOrdersRequest Class Doc Comment
 *
 * @description Данные, необходимые для генерации отчета.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class GenerateUnitedOrdersRequest implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'GenerateUnitedOrdersRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'business_id' => 'int',
        'date_from' => '\DateTime',
        'date_to' => '\DateTime',
        'campaign_ids' => 'int[]',
        'promo_id' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'business_id' => 'int64',
        'date_from' => 'date',
        'date_to' => 'date',
        'campaign_ids' => 'int64',
        'promo_id' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'business_id' => false,
        'date_from' => false,
        'date_to' => false,
        'campaign_ids' => true,
        'promo_id' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var array<string, bool>
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPITypes(): array
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPIFormats(): array
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array<string, bool>
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return array<string, bool>
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param array<string, bool> $openAPINullablesSetToNull
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
     * @var array<string, string>
     */
    protected static array $attributeMap = [
        'business_id' => 'businessId',
        'date_from' => 'dateFrom',
        'date_to' => 'dateTo',
        'campaign_ids' => 'campaignIds',
        'promo_id' => 'promoId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'business_id' => 'setBusinessId',
        'date_from' => 'setDateFrom',
        'date_to' => 'setDateTo',
        'campaign_ids' => 'setCampaignIds',
        'promo_id' => 'setPromoId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'business_id' => 'getBusinessId',
        'date_from' => 'getDateFrom',
        'date_to' => 'getDateTo',
        'campaign_ids' => 'getCampaignIds',
        'promo_id' => 'getPromoId'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array<string, string>
     */
    public static function attributeMap(): array
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array<string, string>
     */
    public static function setters(): array
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array<string, string>
     */
    public static function getters(): array
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName(): string
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var array
     */
    protected array $container = [];

    /**
     * Constructor
     *
     * @param array $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('business_id', $data ?? [], null);
        $this->setIfExists('date_from', $data ?? [], null);
        $this->setIfExists('date_to', $data ?? [], null);
        $this->setIfExists('campaign_ids', $data ?? [], null);
        $this->setIfExists('promo_id', $data ?? [], null);
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
    private function setIfExists(string $variableName, array $fields, mixed $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return string[] invalid properties with reasons
     */
    public function listInvalidProperties(): array
    {
        $invalidProperties = [];

        if ($this->container['business_id'] === null) {
            $invalidProperties[] = "'business_id' can't be null";
        }
        if ($this->container['date_from'] === null) {
            $invalidProperties[] = "'date_from' can't be null";
        }
        if ($this->container['date_to'] === null) {
            $invalidProperties[] = "'date_to' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid(): bool
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets business_id
     *
     * @return int
     */
    public function getBusinessId(): int
    {
        return $this->container['business_id'];
    }

    /**
     * Sets business_id
     *
     * @param int $business_id Идентификатор бизнеса.
     *
     * @return $this
     */
    public function setBusinessId(int $business_id): static
    {
        if (is_null($business_id)) {
            throw new InvalidArgumentException('non-nullable business_id cannot be null');
        }
        $this->container['business_id'] = $business_id;

        return $this;
    }

    /**
     * Gets date_from
     *
     * @return \DateTime
     */
    public function getDateFrom(): \DateTime
    {
        return $this->container['date_from'];
    }

    /**
     * Sets date_from
     *
     * @param \DateTime $date_from Начало периода, включительно.
     *
     * @return $this
     */
    public function setDateFrom(\DateTime $date_from): static
    {
        if (is_null($date_from)) {
            throw new InvalidArgumentException('non-nullable date_from cannot be null');
        }
        $this->container['date_from'] = $date_from;

        return $this;
    }

    /**
     * Gets date_to
     *
     * @return \DateTime
     */
    public function getDateTo(): \DateTime
    {
        return $this->container['date_to'];
    }

    /**
     * Sets date_to
     *
     * @param \DateTime $date_to Конец периода, включительно. Максимальный период — 1 год.
     *
     * @return $this
     */
    public function setDateTo(\DateTime $date_to): static
    {
        if (is_null($date_to)) {
            throw new InvalidArgumentException('non-nullable date_to cannot be null');
        }
        $this->container['date_to'] = $date_to;

        return $this;
    }

    /**
     * Gets campaign_ids
     *
     * @return int[]|null
     */
    public function getCampaignIds(): ?array
    {
        return $this->container['campaign_ids'];
    }

    /**
     * Sets campaign_ids
     *
     * @param int[]|null $campaign_ids Список магазинов, которые нужны в отчете.
     *
     * @return $this
     */
    public function setCampaignIds(?array $campaign_ids): static
    {
        if (is_null($campaign_ids)) {
            array_push($this->openAPINullablesSetToNull, 'campaign_ids');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('campaign_ids', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['campaign_ids'] = $campaign_ids;

        return $this;
    }

    /**
     * Gets promo_id
     *
     * @return string|null
     */
    public function getPromoId(): ?string
    {
        return $this->container['promo_id'];
    }

    /**
     * Sets promo_id
     *
     * @param string|null $promo_id Идентификатор акции, товары из которой нужны в отчете.
     *
     * @return $this
     */
    public function setPromoId(?string $promo_id): static
    {
        if (is_null($promo_id)) {
            throw new InvalidArgumentException('non-nullable promo_id cannot be null');
        }
        $this->container['promo_id'] = $promo_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists(mixed $offset): bool
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
    #[ReturnTypeWillChange]
    public function offsetGet(mixed $offset): mixed
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
    public function offsetSet(mixed $offset, mixed $value): void
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
    public function offsetUnset(mixed $offset): void
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
    #[ReturnTypeWillChange]
    public function jsonSerialize(): mixed
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString(): string
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
    public function toHeaderValue(): string
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


