<?php
/**
 * WarehouseAddressDTO
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
 * WarehouseAddressDTO Class Doc Comment
 *
 * @description Адрес склада.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class WarehouseAddressDTO implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'WarehouseAddressDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'city' => 'string',
        'street' => 'string',
        'number' => 'string',
        'building' => 'string',
        'block' => 'string',
        'gps' => '\OpenAPI\Client\Model\GpsDTO'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'city' => null,
        'street' => null,
        'number' => null,
        'building' => null,
        'block' => null,
        'gps' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'city' => false,
        'street' => false,
        'number' => false,
        'building' => false,
        'block' => false,
        'gps' => false
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
        'city' => 'city',
        'street' => 'street',
        'number' => 'number',
        'building' => 'building',
        'block' => 'block',
        'gps' => 'gps'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'city' => 'setCity',
        'street' => 'setStreet',
        'number' => 'setNumber',
        'building' => 'setBuilding',
        'block' => 'setBlock',
        'gps' => 'setGps'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'city' => 'getCity',
        'street' => 'getStreet',
        'number' => 'getNumber',
        'building' => 'getBuilding',
        'block' => 'getBlock',
        'gps' => 'getGps'
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
        $this->setIfExists('city', $data ?? [], null);
        $this->setIfExists('street', $data ?? [], null);
        $this->setIfExists('number', $data ?? [], null);
        $this->setIfExists('building', $data ?? [], null);
        $this->setIfExists('block', $data ?? [], null);
        $this->setIfExists('gps', $data ?? [], null);
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

        if ($this->container['city'] === null) {
            $invalidProperties[] = "'city' can't be null";
        }
        if ((mb_strlen($this->container['city']) > 200)) {
            $invalidProperties[] = "invalid value for 'city', the character length must be smaller than or equal to 200.";
        }

        if (!is_null($this->container['street']) && (mb_strlen($this->container['street']) > 512)) {
            $invalidProperties[] = "invalid value for 'street', the character length must be smaller than or equal to 512.";
        }

        if (!is_null($this->container['number']) && (mb_strlen($this->container['number']) > 256)) {
            $invalidProperties[] = "invalid value for 'number', the character length must be smaller than or equal to 256.";
        }

        if (!is_null($this->container['building']) && (mb_strlen($this->container['building']) > 16)) {
            $invalidProperties[] = "invalid value for 'building', the character length must be smaller than or equal to 16.";
        }

        if (!is_null($this->container['block']) && (mb_strlen($this->container['block']) > 16)) {
            $invalidProperties[] = "invalid value for 'block', the character length must be smaller than or equal to 16.";
        }

        if ($this->container['gps'] === null) {
            $invalidProperties[] = "'gps' can't be null";
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
     * Gets city
     *
     * @return string
     */
    public function getCity(): string
    {
        return $this->container['city'];
    }

    /**
     * Sets city
     *
     * @param string $city Город.
     *
     * @return $this
     */
    public function setCity(string $city): static
    {
        if (is_null($city)) {
            throw new InvalidArgumentException('non-nullable city cannot be null');
        }
        if ((mb_strlen($city) > 200)) {
            throw new InvalidArgumentException('invalid length for $city when calling WarehouseAddressDTO., must be smaller than or equal to 200.');
        }

        $this->container['city'] = $city;

        return $this;
    }

    /**
     * Gets street
     *
     * @return string|null
     */
    public function getStreet(): ?string
    {
        return $this->container['street'];
    }

    /**
     * Sets street
     *
     * @param string|null $street Улица.
     *
     * @return $this
     */
    public function setStreet(?string $street): static
    {
        if (is_null($street)) {
            throw new InvalidArgumentException('non-nullable street cannot be null');
        }
        if ((mb_strlen($street) > 512)) {
            throw new InvalidArgumentException('invalid length for $street when calling WarehouseAddressDTO., must be smaller than or equal to 512.');
        }

        $this->container['street'] = $street;

        return $this;
    }

    /**
     * Gets number
     *
     * @return string|null
     */
    public function getNumber(): ?string
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     *
     * @param string|null $number Номер дома.
     *
     * @return $this
     */
    public function setNumber(?string $number): static
    {
        if (is_null($number)) {
            throw new InvalidArgumentException('non-nullable number cannot be null');
        }
        if ((mb_strlen($number) > 256)) {
            throw new InvalidArgumentException('invalid length for $number when calling WarehouseAddressDTO., must be smaller than or equal to 256.');
        }

        $this->container['number'] = $number;

        return $this;
    }

    /**
     * Gets building
     *
     * @return string|null
     */
    public function getBuilding(): ?string
    {
        return $this->container['building'];
    }

    /**
     * Sets building
     *
     * @param string|null $building Номер строения.
     *
     * @return $this
     */
    public function setBuilding(?string $building): static
    {
        if (is_null($building)) {
            throw new InvalidArgumentException('non-nullable building cannot be null');
        }
        if ((mb_strlen($building) > 16)) {
            throw new InvalidArgumentException('invalid length for $building when calling WarehouseAddressDTO., must be smaller than or equal to 16.');
        }

        $this->container['building'] = $building;

        return $this;
    }

    /**
     * Gets block
     *
     * @return string|null
     */
    public function getBlock(): ?string
    {
        return $this->container['block'];
    }

    /**
     * Sets block
     *
     * @param string|null $block Номер корпуса.
     *
     * @return $this
     */
    public function setBlock(?string $block): static
    {
        if (is_null($block)) {
            throw new InvalidArgumentException('non-nullable block cannot be null');
        }
        if ((mb_strlen($block) > 16)) {
            throw new InvalidArgumentException('invalid length for $block when calling WarehouseAddressDTO., must be smaller than or equal to 16.');
        }

        $this->container['block'] = $block;

        return $this;
    }

    /**
     * Gets gps
     *
     * @return \OpenAPI\Client\Model\GpsDTO
     */
    public function getGps(): \OpenAPI\Client\Model\GpsDTO
    {
        return $this->container['gps'];
    }

    /**
     * Sets gps
     *
     * @param \OpenAPI\Client\Model\GpsDTO $gps gps
     *
     * @return $this
     */
    public function setGps(\OpenAPI\Client\Model\GpsDTO $gps): static
    {
        if (is_null($gps)) {
            throw new InvalidArgumentException('non-nullable gps cannot be null');
        }
        $this->container['gps'] = $gps;

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

