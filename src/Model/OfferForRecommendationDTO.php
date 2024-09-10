<?php
/**
 * OfferForRecommendationDTO
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
 * OfferForRecommendationDTO Class Doc Comment
 *
 * @description Информация о состоянии цены на товар.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class OfferForRecommendationDTO implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'OfferForRecommendationDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'offer_id' => 'string',
        'price' => '\OpenAPI\Client\Model\BasePriceDTO',
        'cofinance_price' => '\OpenAPI\Client\Model\GetPriceDTO',
        'competitiveness' => '\OpenAPI\Client\Model\PriceCompetitivenessType',
        'shows' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'offer_id' => null,
        'price' => null,
        'cofinance_price' => null,
        'competitiveness' => null,
        'shows' => 'int64'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'offer_id' => false,
        'price' => false,
        'cofinance_price' => false,
        'competitiveness' => false,
        'shows' => false
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
        'offer_id' => 'offerId',
        'price' => 'price',
        'cofinance_price' => 'cofinancePrice',
        'competitiveness' => 'competitiveness',
        'shows' => 'shows'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'offer_id' => 'setOfferId',
        'price' => 'setPrice',
        'cofinance_price' => 'setCofinancePrice',
        'competitiveness' => 'setCompetitiveness',
        'shows' => 'setShows'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'offer_id' => 'getOfferId',
        'price' => 'getPrice',
        'cofinance_price' => 'getCofinancePrice',
        'competitiveness' => 'getCompetitiveness',
        'shows' => 'getShows'
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
        $this->setIfExists('offer_id', $data ?? [], null);
        $this->setIfExists('price', $data ?? [], null);
        $this->setIfExists('cofinance_price', $data ?? [], null);
        $this->setIfExists('competitiveness', $data ?? [], null);
        $this->setIfExists('shows', $data ?? [], null);
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

        if (!is_null($this->container['offer_id']) && (mb_strlen($this->container['offer_id']) > 255)) {
            $invalidProperties[] = "invalid value for 'offer_id', the character length must be smaller than or equal to 255.";
        }

        if (!is_null($this->container['offer_id']) && (mb_strlen($this->container['offer_id']) < 1)) {
            $invalidProperties[] = "invalid value for 'offer_id', the character length must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['offer_id']) && !preg_match("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/", $this->container['offer_id'])) {
            $invalidProperties[] = "invalid value for 'offer_id', must be conform to the pattern /^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/.";
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
     * Gets offer_id
     *
     * @return string|null
     */
    public function getOfferId(): ?string
    {
        return $this->container['offer_id'];
    }

    /**
     * Sets offer_id
     *
     * @param string|null $offer_id Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @return $this
     */
    public function setOfferId(?string $offer_id): static
    {
        if (is_null($offer_id)) {
            throw new InvalidArgumentException('non-nullable offer_id cannot be null');
        }
        if ((mb_strlen($offer_id) > 255)) {
            throw new InvalidArgumentException('invalid length for $offer_id when calling OfferForRecommendationDTO., must be smaller than or equal to 255.');
        }
        if ((mb_strlen($offer_id) < 1)) {
            throw new InvalidArgumentException('invalid length for $offer_id when calling OfferForRecommendationDTO., must be bigger than or equal to 1.');
        }
        if ((!preg_match("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/", ObjectSerializer::toString($offer_id)))) {
            throw new InvalidArgumentException("invalid value for \$offer_id when calling OfferForRecommendationDTO., must conform to the pattern /^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/.");
        }

        $this->container['offer_id'] = $offer_id;

        return $this;
    }

    /**
     * Gets price
     *
     * @return \OpenAPI\Client\Model\BasePriceDTO|null
     */
    public function getPrice(): ?\OpenAPI\Client\Model\BasePriceDTO
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param \OpenAPI\Client\Model\BasePriceDTO|null $price price
     *
     * @return $this
     */
    public function setPrice(?\OpenAPI\Client\Model\BasePriceDTO $price): static
    {
        if (is_null($price)) {
            throw new InvalidArgumentException('non-nullable price cannot be null');
        }
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets cofinance_price
     *
     * @return \OpenAPI\Client\Model\GetPriceDTO|null
     */
    public function getCofinancePrice(): ?\OpenAPI\Client\Model\GetPriceDTO
    {
        return $this->container['cofinance_price'];
    }

    /**
     * Sets cofinance_price
     *
     * @param \OpenAPI\Client\Model\GetPriceDTO|null $cofinance_price cofinance_price
     *
     * @return $this
     */
    public function setCofinancePrice(?\OpenAPI\Client\Model\GetPriceDTO $cofinance_price): static
    {
        if (is_null($cofinance_price)) {
            throw new InvalidArgumentException('non-nullable cofinance_price cannot be null');
        }
        $this->container['cofinance_price'] = $cofinance_price;

        return $this;
    }

    /**
     * Gets competitiveness
     *
     * @return \OpenAPI\Client\Model\PriceCompetitivenessType|null
     */
    public function getCompetitiveness(): ?\OpenAPI\Client\Model\PriceCompetitivenessType
    {
        return $this->container['competitiveness'];
    }

    /**
     * Sets competitiveness
     *
     * @param \OpenAPI\Client\Model\PriceCompetitivenessType|null $competitiveness competitiveness
     *
     * @return $this
     */
    public function setCompetitiveness(?\OpenAPI\Client\Model\PriceCompetitivenessType $competitiveness): static
    {
        if (is_null($competitiveness)) {
            throw new InvalidArgumentException('non-nullable competitiveness cannot be null');
        }
        $this->container['competitiveness'] = $competitiveness;

        return $this;
    }

    /**
     * Gets shows
     *
     * @return int|null
     */
    public function getShows(): ?int
    {
        return $this->container['shows'];
    }

    /**
     * Sets shows
     *
     * @param int|null $shows Количество показов карточки товара за последние 7 дней.
     *
     * @return $this
     */
    public function setShows(?int $shows): static
    {
        if (is_null($shows)) {
            throw new InvalidArgumentException('non-nullable shows cannot be null');
        }
        $this->container['shows'] = $shows;

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

