<?php
/**
 * GetPromoDTO
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
 * GetPromoDTO Class Doc Comment
 *
 * @description Информация об акции.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class GetPromoDTO implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'GetPromoDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'id' => 'string',
        'name' => 'string',
        'period' => '\OpenAPI\Client\Model\PromoPeriodDTO',
        'participating' => 'bool',
        'assortment_info' => '\OpenAPI\Client\Model\GetPromoAssortmentInfoDTO',
        'mechanics_info' => '\OpenAPI\Client\Model\GetPromoMechanicsInfoDTO',
        'bestseller_info' => '\OpenAPI\Client\Model\GetPromoBestsellerInfoDTO',
        'channels' => '\OpenAPI\Client\Model\ChannelType[]',
        'constraints' => '\OpenAPI\Client\Model\GetPromoConstraintsDTO'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'id' => null,
        'name' => null,
        'period' => null,
        'participating' => null,
        'assortment_info' => null,
        'mechanics_info' => null,
        'bestseller_info' => null,
        'channels' => null,
        'constraints' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'id' => false,
        'name' => false,
        'period' => false,
        'participating' => false,
        'assortment_info' => false,
        'mechanics_info' => false,
        'bestseller_info' => false,
        'channels' => true,
        'constraints' => false
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
        'id' => 'id',
        'name' => 'name',
        'period' => 'period',
        'participating' => 'participating',
        'assortment_info' => 'assortmentInfo',
        'mechanics_info' => 'mechanicsInfo',
        'bestseller_info' => 'bestsellerInfo',
        'channels' => 'channels',
        'constraints' => 'constraints'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'id' => 'setId',
        'name' => 'setName',
        'period' => 'setPeriod',
        'participating' => 'setParticipating',
        'assortment_info' => 'setAssortmentInfo',
        'mechanics_info' => 'setMechanicsInfo',
        'bestseller_info' => 'setBestsellerInfo',
        'channels' => 'setChannels',
        'constraints' => 'setConstraints'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'id' => 'getId',
        'name' => 'getName',
        'period' => 'getPeriod',
        'participating' => 'getParticipating',
        'assortment_info' => 'getAssortmentInfo',
        'mechanics_info' => 'getMechanicsInfo',
        'bestseller_info' => 'getBestsellerInfo',
        'channels' => 'getChannels',
        'constraints' => 'getConstraints'
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
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('period', $data ?? [], null);
        $this->setIfExists('participating', $data ?? [], null);
        $this->setIfExists('assortment_info', $data ?? [], null);
        $this->setIfExists('mechanics_info', $data ?? [], null);
        $this->setIfExists('bestseller_info', $data ?? [], null);
        $this->setIfExists('channels', $data ?? [], null);
        $this->setIfExists('constraints', $data ?? [], null);
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

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['period'] === null) {
            $invalidProperties[] = "'period' can't be null";
        }
        if ($this->container['participating'] === null) {
            $invalidProperties[] = "'participating' can't be null";
        }
        if ($this->container['assortment_info'] === null) {
            $invalidProperties[] = "'assortment_info' can't be null";
        }
        if ($this->container['mechanics_info'] === null) {
            $invalidProperties[] = "'mechanics_info' can't be null";
        }
        if ($this->container['bestseller_info'] === null) {
            $invalidProperties[] = "'bestseller_info' can't be null";
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
     * Gets id
     *
     * @return string
     */
    public function getId(): string
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id Идентификатор акции.
     *
     * @return $this
     */
    public function setId(string $id): static
    {
        if (is_null($id)) {
            throw new InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName(): string
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name Название акции.
     *
     * @return $this
     */
    public function setName(string $name): static
    {
        if (is_null($name)) {
            throw new InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets period
     *
     * @return \OpenAPI\Client\Model\PromoPeriodDTO
     */
    public function getPeriod(): \OpenAPI\Client\Model\PromoPeriodDTO
    {
        return $this->container['period'];
    }

    /**
     * Sets period
     *
     * @param \OpenAPI\Client\Model\PromoPeriodDTO $period period
     *
     * @return $this
     */
    public function setPeriod(\OpenAPI\Client\Model\PromoPeriodDTO $period): static
    {
        if (is_null($period)) {
            throw new InvalidArgumentException('non-nullable period cannot be null');
        }
        $this->container['period'] = $period;

        return $this;
    }

    /**
     * Gets participating
     *
     * @return bool
     */
    public function getParticipating(): bool
    {
        return $this->container['participating'];
    }

    /**
     * Sets participating
     *
     * @param bool $participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
     *
     * @return $this
     */
    public function setParticipating(bool $participating): static
    {
        if (is_null($participating)) {
            throw new InvalidArgumentException('non-nullable participating cannot be null');
        }
        $this->container['participating'] = $participating;

        return $this;
    }

    /**
     * Gets assortment_info
     *
     * @return \OpenAPI\Client\Model\GetPromoAssortmentInfoDTO
     */
    public function getAssortmentInfo(): \OpenAPI\Client\Model\GetPromoAssortmentInfoDTO
    {
        return $this->container['assortment_info'];
    }

    /**
     * Sets assortment_info
     *
     * @param \OpenAPI\Client\Model\GetPromoAssortmentInfoDTO $assortment_info assortment_info
     *
     * @return $this
     */
    public function setAssortmentInfo(\OpenAPI\Client\Model\GetPromoAssortmentInfoDTO $assortment_info): static
    {
        if (is_null($assortment_info)) {
            throw new InvalidArgumentException('non-nullable assortment_info cannot be null');
        }
        $this->container['assortment_info'] = $assortment_info;

        return $this;
    }

    /**
     * Gets mechanics_info
     *
     * @return \OpenAPI\Client\Model\GetPromoMechanicsInfoDTO
     */
    public function getMechanicsInfo(): \OpenAPI\Client\Model\GetPromoMechanicsInfoDTO
    {
        return $this->container['mechanics_info'];
    }

    /**
     * Sets mechanics_info
     *
     * @param \OpenAPI\Client\Model\GetPromoMechanicsInfoDTO $mechanics_info mechanics_info
     *
     * @return $this
     */
    public function setMechanicsInfo(\OpenAPI\Client\Model\GetPromoMechanicsInfoDTO $mechanics_info): static
    {
        if (is_null($mechanics_info)) {
            throw new InvalidArgumentException('non-nullable mechanics_info cannot be null');
        }
        $this->container['mechanics_info'] = $mechanics_info;

        return $this;
    }

    /**
     * Gets bestseller_info
     *
     * @return \OpenAPI\Client\Model\GetPromoBestsellerInfoDTO
     */
    public function getBestsellerInfo(): \OpenAPI\Client\Model\GetPromoBestsellerInfoDTO
    {
        return $this->container['bestseller_info'];
    }

    /**
     * Sets bestseller_info
     *
     * @param \OpenAPI\Client\Model\GetPromoBestsellerInfoDTO $bestseller_info bestseller_info
     *
     * @return $this
     */
    public function setBestsellerInfo(\OpenAPI\Client\Model\GetPromoBestsellerInfoDTO $bestseller_info): static
    {
        if (is_null($bestseller_info)) {
            throw new InvalidArgumentException('non-nullable bestseller_info cannot be null');
        }
        $this->container['bestseller_info'] = $bestseller_info;

        return $this;
    }

    /**
     * Gets channels
     *
     * @return \OpenAPI\Client\Model\ChannelType[]|null
     */
    public function getChannels(): ?array
    {
        return $this->container['channels'];
    }

    /**
     * Sets channels
     *
     * @param \OpenAPI\Client\Model\ChannelType[]|null $channels Список каналов продвижения товаров.
     *
     * @return $this
     */
    public function setChannels(?array $channels): static
    {
        if (is_null($channels)) {
            array_push($this->openAPINullablesSetToNull, 'channels');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('channels', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['channels'] = $channels;

        return $this;
    }

    /**
     * Gets constraints
     *
     * @return \OpenAPI\Client\Model\GetPromoConstraintsDTO|null
     */
    public function getConstraints(): ?\OpenAPI\Client\Model\GetPromoConstraintsDTO
    {
        return $this->container['constraints'];
    }

    /**
     * Sets constraints
     *
     * @param \OpenAPI\Client\Model\GetPromoConstraintsDTO|null $constraints constraints
     *
     * @return $this
     */
    public function setConstraints(?\OpenAPI\Client\Model\GetPromoConstraintsDTO $constraints): static
    {
        if (is_null($constraints)) {
            throw new InvalidArgumentException('non-nullable constraints cannot be null');
        }
        $this->container['constraints'] = $constraints;

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

