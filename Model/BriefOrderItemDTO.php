<?php
/**
 * BriefOrderItemDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
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

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the BriefOrderItemDTO model.
 *
 * Информация о маркированном товаре.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BriefOrderItemDTO 
{
        /**
     * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.
     *
     * @var int|null
     * @SerializedName("id")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $id = null;

    /**
     * @var OrderVatType|null
     * @SerializedName("vat")
    * @Accessor(getter="getSerializedVat", setter="setDeserializedVat")
    * @Type("string")
    */
    protected ?OrderVatType $vat = null;

    /**
     * Количество единиц товара.
     *
     * @var int|null
     * @SerializedName("count")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $count = null;

    /**
     * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.
     *
     * @var float|null
     * @SerializedName("price")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $price = null;

    /**
     * Название товара.
     *
     * @var string|null
     * @SerializedName("offerName")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $offerName = null;

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @var string|null
     * @SerializedName("offerId")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Length(max: 255)]
    #[Assert\Length(min: 1)]
    #[Assert\Regex("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")]
    protected ?string $offerId = null;

    /**
     * Переданные вами коды маркировки.
     *
     * @var OrderItemInstanceDTO[]|null
     * @SerializedName("instances")
     * @Type("array<OpenAPI\Server\Model\OrderItemInstanceDTO>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\OrderItemInstanceDTO"),
    ])]
    protected ?array $instances = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->vat = array_key_exists('vat', $data) ? $data['vat'] : $this->vat;
            $this->count = array_key_exists('count', $data) ? $data['count'] : $this->count;
            $this->price = array_key_exists('price', $data) ? $data['price'] : $this->price;
            $this->offerName = array_key_exists('offerName', $data) ? $data['offerName'] : $this->offerName;
            $this->offerId = array_key_exists('offerId', $data) ? $data['offerId'] : $this->offerId;
            $this->instances = array_key_exists('instances', $data) ? $data['instances'] : $this->instances;
        }
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId(): ?int
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param int|null $id  Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.
    *
    * @return $this
    */
    public function setId(?int $id = null): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets vat.
     *
     * @return OrderVatType|null
     */
    public function getVat(): ?OrderVatType
    {
        return $this->vat;
    }

    /**
    * Sets vat.
    *
    * @param OrderVatType|null $vat
    *
    * @return $this
    */
    public function setVat(?OrderVatType $vat = null): self
    {
        $this->vat = $vat;

        return $this;
    }

    /**
    * Gets vat for serialization.
    *
    * @return string|null
    */
    public function getSerializedVat(): string|null
    {
        return $this->vat?->value ? (string) $this->vat->value : null;
    }

    /**
    * Sets vat.
    *
    * @param string|OrderVatType|null $vat
    *
    * @return $this
    */
    public function setDeserializedVat(string|OrderVatType|null $vat = null): self
    {
        if (is_string($vat)) {
            $vat = OrderVatType::tryFrom($vat);
        }

        $this->vat = $vat;

        return $this;
    }



    /**
     * Gets count.
     *
     * @return int|null
     */
    public function getCount(): ?int
    {
        return $this->count;
    }

    /**
    * Sets count.
    *
    * @param int|null $count  Количество единиц товара.
    *
    * @return $this
    */
    public function setCount(?int $count = null): self
    {
        $this->count = $count;

        return $this;
    }




    /**
     * Gets price.
     *
     * @return float|null
     */
    public function getPrice(): ?float
    {
        return $this->price;
    }

    /**
    * Sets price.
    *
    * @param float|null $price  Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.
    *
    * @return $this
    */
    public function setPrice(?float $price = null): self
    {
        $this->price = $price;

        return $this;
    }




    /**
     * Gets offerName.
     *
     * @return string|null
     */
    public function getOfferName(): ?string
    {
        return $this->offerName;
    }

    /**
    * Sets offerName.
    *
    * @param string|null $offerName  Название товара.
    *
    * @return $this
    */
    public function setOfferName(?string $offerName = null): self
    {
        $this->offerName = $offerName;

        return $this;
    }




    /**
     * Gets offerId.
     *
     * @return string|null
     */
    public function getOfferId(): ?string
    {
        return $this->offerId;
    }

    /**
    * Sets offerId.
    *
    * @param string|null $offerId  Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    *
    * @return $this
    */
    public function setOfferId(?string $offerId = null): self
    {
        $this->offerId = $offerId;

        return $this;
    }




    /**
     * Gets instances.
     *
     * @return OrderItemInstanceDTO[]|null
     */
    public function getInstances(): ?array
    {
        return $this->instances;
    }

    /**
    * Sets instances.
    *
    * @param OrderItemInstanceDTO[]|null $instances  Переданные вами коды маркировки.
    *
    * @return $this
    */
    public function setInstances(?array $instances = null): self
    {
        $this->instances = $instances;

        return $this;
    }



}


