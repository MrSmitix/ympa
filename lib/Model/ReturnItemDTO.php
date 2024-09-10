<?php
/**
 * ReturnItemDTO
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
 * ReturnItemDTO Class Doc Comment
 *
 * @category Class
 * @description Список товаров в возврате.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ReturnItemDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'ReturnItemDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'market_sku' => 'int',
        'shop_sku' => 'string',
        'count' => 'int',
        'decisions' => '\OpenAPI\Client\Model\ReturnDecisionDTO[]',
        'instances' => '\OpenAPI\Client\Model\ReturnInstanceDTO[]',
        'tracks' => '\OpenAPI\Client\Model\TrackDTO[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'market_sku' => 'int64',
        'shop_sku' => null,
        'count' => 'int64',
        'decisions' => null,
        'instances' => null,
        'tracks' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'market_sku' => false,
        'shop_sku' => false,
        'count' => false,
        'decisions' => true,
        'instances' => true,
        'tracks' => true
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
        'market_sku' => 'marketSku',
        'shop_sku' => 'shopSku',
        'count' => 'count',
        'decisions' => 'decisions',
        'instances' => 'instances',
        'tracks' => 'tracks'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'market_sku' => 'setMarketSku',
        'shop_sku' => 'setShopSku',
        'count' => 'setCount',
        'decisions' => 'setDecisions',
        'instances' => 'setInstances',
        'tracks' => 'setTracks'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'market_sku' => 'getMarketSku',
        'shop_sku' => 'getShopSku',
        'count' => 'getCount',
        'decisions' => 'getDecisions',
        'instances' => 'getInstances',
        'tracks' => 'getTracks'
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
        $this->setIfExists('market_sku', $data ?? [], null);
        $this->setIfExists('shop_sku', $data ?? [], null);
        $this->setIfExists('count', $data ?? [], null);
        $this->setIfExists('decisions', $data ?? [], null);
        $this->setIfExists('instances', $data ?? [], null);
        $this->setIfExists('tracks', $data ?? [], null);
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

        if ($this->container['shop_sku'] === null) {
            $invalidProperties[] = "'shop_sku' can't be null";
        }
        if ((mb_strlen($this->container['shop_sku']) > 255)) {
            $invalidProperties[] = "invalid value for 'shop_sku', the character length must be smaller than or equal to 255.";
        }

        if ((mb_strlen($this->container['shop_sku']) < 1)) {
            $invalidProperties[] = "invalid value for 'shop_sku', the character length must be bigger than or equal to 1.";
        }

        if (!preg_match("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/", $this->container['shop_sku'])) {
            $invalidProperties[] = "invalid value for 'shop_sku', must be conform to the pattern /^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/.";
        }

        if ($this->container['count'] === null) {
            $invalidProperties[] = "'count' can't be null";
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
     * Gets market_sku
     *
     * @return int|null
     */
    public function getMarketSku()
    {
        return $this->container['market_sku'];
    }

    /**
     * Sets market_sku
     *
     * @param int|null $market_sku SKU на Маркете.
     *
     * @return self
     */
    public function setMarketSku($market_sku)
    {
        if (is_null($market_sku)) {
            throw new \InvalidArgumentException('non-nullable market_sku cannot be null');
        }
        $this->container['market_sku'] = $market_sku;

        return $this;
    }

    /**
     * Gets shop_sku
     *
     * @return string
     */
    public function getShopSku()
    {
        return $this->container['shop_sku'];
    }

    /**
     * Sets shop_sku
     *
     * @param string $shop_sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @return self
     */
    public function setShopSku($shop_sku)
    {
        if (is_null($shop_sku)) {
            throw new \InvalidArgumentException('non-nullable shop_sku cannot be null');
        }
        if ((mb_strlen($shop_sku) > 255)) {
            throw new \InvalidArgumentException('invalid length for $shop_sku when calling ReturnItemDTO., must be smaller than or equal to 255.');
        }
        if ((mb_strlen($shop_sku) < 1)) {
            throw new \InvalidArgumentException('invalid length for $shop_sku when calling ReturnItemDTO., must be bigger than or equal to 1.');
        }
        if ((!preg_match("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/", ObjectSerializer::toString($shop_sku)))) {
            throw new \InvalidArgumentException("invalid value for \$shop_sku when calling ReturnItemDTO., must conform to the pattern /^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/.");
        }

        $this->container['shop_sku'] = $shop_sku;

        return $this;
    }

    /**
     * Gets count
     *
     * @return int
     */
    public function getCount()
    {
        return $this->container['count'];
    }

    /**
     * Sets count
     *
     * @param int $count Количество единиц товара.
     *
     * @return self
     */
    public function setCount($count)
    {
        if (is_null($count)) {
            throw new \InvalidArgumentException('non-nullable count cannot be null');
        }
        $this->container['count'] = $count;

        return $this;
    }

    /**
     * Gets decisions
     *
     * @return \OpenAPI\Client\Model\ReturnDecisionDTO[]|null
     */
    public function getDecisions()
    {
        return $this->container['decisions'];
    }

    /**
     * Sets decisions
     *
     * @param \OpenAPI\Client\Model\ReturnDecisionDTO[]|null $decisions Список решений по возврату.
     *
     * @return self
     */
    public function setDecisions($decisions)
    {
        if (is_null($decisions)) {
            array_push($this->openAPINullablesSetToNull, 'decisions');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('decisions', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['decisions'] = $decisions;

        return $this;
    }

    /**
     * Gets instances
     *
     * @return \OpenAPI\Client\Model\ReturnInstanceDTO[]|null
     */
    public function getInstances()
    {
        return $this->container['instances'];
    }

    /**
     * Sets instances
     *
     * @param \OpenAPI\Client\Model\ReturnInstanceDTO[]|null $instances Список логистических позиций возврата.
     *
     * @return self
     */
    public function setInstances($instances)
    {
        if (is_null($instances)) {
            array_push($this->openAPINullablesSetToNull, 'instances');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('instances', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['instances'] = $instances;

        return $this;
    }

    /**
     * Gets tracks
     *
     * @return \OpenAPI\Client\Model\TrackDTO[]|null
     */
    public function getTracks()
    {
        return $this->container['tracks'];
    }

    /**
     * Sets tracks
     *
     * @param \OpenAPI\Client\Model\TrackDTO[]|null $tracks Список трек-кодов для почтовых отправлений.
     *
     * @return self
     */
    public function setTracks($tracks)
    {
        if (is_null($tracks)) {
            array_push($this->openAPINullablesSetToNull, 'tracks');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tracks', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['tracks'] = $tracks;

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


