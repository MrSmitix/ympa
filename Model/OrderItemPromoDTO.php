<?php
/**
 * OrderItemPromoDTO
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
 * Class representing the OrderItemPromoDTO model.
 *
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OrderItemPromoDTO 
{
        /**
     * @var OrderPromoType|null
     * @SerializedName("type")
    * @Accessor(getter="getSerializedType", setter="setDeserializedType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?OrderPromoType $type = null;

    /**
     * Размер пользовательской скидки в валюте покупателя.
     *
     * @var float|null
     * @SerializedName("discount")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $discount = null;

    /**
     * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.
     *
     * @var float|null
     * @SerializedName("subsidy")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $subsidy = null;

    /**
     * Идентификатор акции поставщика.
     *
     * @var string|null
     * @SerializedName("shopPromoId")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $shopPromoId = null;

    /**
     * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.
     *
     * @var string|null
     * @SerializedName("marketPromoId")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $marketPromoId = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->discount = array_key_exists('discount', $data) ? $data['discount'] : $this->discount;
            $this->subsidy = array_key_exists('subsidy', $data) ? $data['subsidy'] : $this->subsidy;
            $this->shopPromoId = array_key_exists('shopPromoId', $data) ? $data['shopPromoId'] : $this->shopPromoId;
            $this->marketPromoId = array_key_exists('marketPromoId', $data) ? $data['marketPromoId'] : $this->marketPromoId;
        }
    }

    /**
     * Gets type.
     *
     * @return OrderPromoType|null
     */
    public function getType(): ?OrderPromoType
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param OrderPromoType|null $type
    *
    * @return $this
    */
    public function setType(?OrderPromoType $type): self
    {
        $this->type = $type;

        return $this;
    }

    /**
    * Gets type for serialization.
    *
    * @return string|null
    */
    public function getSerializedType(): string|null
    {
        return $this->type?->value ? (string) $this->type->value : null;
    }

    /**
    * Sets type.
    *
    * @param string|OrderPromoType|null $type
    *
    * @return $this
    */
    public function setDeserializedType(string|OrderPromoType|null $type): self
    {
        if (is_string($type)) {
            $type = OrderPromoType::tryFrom($type);
        }

        $this->type = $type;

        return $this;
    }



    /**
     * Gets discount.
     *
     * @return float|null
     */
    public function getDiscount(): ?float
    {
        return $this->discount;
    }

    /**
    * Sets discount.
    *
    * @param float|null $discount  Размер пользовательской скидки в валюте покупателя.
    *
    * @return $this
    */
    public function setDiscount(?float $discount = null): self
    {
        $this->discount = $discount;

        return $this;
    }




    /**
     * Gets subsidy.
     *
     * @return float|null
     */
    public function getSubsidy(): ?float
    {
        return $this->subsidy;
    }

    /**
    * Sets subsidy.
    *
    * @param float|null $subsidy  Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.
    *
    * @return $this
    */
    public function setSubsidy(?float $subsidy = null): self
    {
        $this->subsidy = $subsidy;

        return $this;
    }




    /**
     * Gets shopPromoId.
     *
     * @return string|null
     */
    public function getShopPromoId(): ?string
    {
        return $this->shopPromoId;
    }

    /**
    * Sets shopPromoId.
    *
    * @param string|null $shopPromoId  Идентификатор акции поставщика.
    *
    * @return $this
    */
    public function setShopPromoId(?string $shopPromoId = null): self
    {
        $this->shopPromoId = $shopPromoId;

        return $this;
    }




    /**
     * Gets marketPromoId.
     *
     * @return string|null
     */
    public function getMarketPromoId(): ?string
    {
        return $this->marketPromoId;
    }

    /**
    * Sets marketPromoId.
    *
    * @param string|null $marketPromoId  Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.
    *
    * @return $this
    */
    public function setMarketPromoId(?string $marketPromoId = null): self
    {
        $this->marketPromoId = $marketPromoId;

        return $this;
    }



}


