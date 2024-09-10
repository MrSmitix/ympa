<?php
/**
 * FeedbackOrderDTO
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
 * Class representing the FeedbackOrderDTO model.
 *
 * Информация о заказе, указанная в отзыве.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class FeedbackOrderDTO 
{
        /**
     * Номер заказа, указанный в отзыве.
     *
     * @var string|null
     * @SerializedName("shopOrderId")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $shopOrderId = null;

    /**
     * @var FeedbackDeliveryType|null
     * @SerializedName("delivery")
    * @Accessor(getter="getSerializedDelivery", setter="setDeserializedDelivery")
    * @Type("string")
    */
    protected ?FeedbackDeliveryType $delivery = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->shopOrderId = array_key_exists('shopOrderId', $data) ? $data['shopOrderId'] : $this->shopOrderId;
            $this->delivery = array_key_exists('delivery', $data) ? $data['delivery'] : $this->delivery;
        }
    }

    /**
     * Gets shopOrderId.
     *
     * @return string|null
     */
    public function getShopOrderId(): ?string
    {
        return $this->shopOrderId;
    }

    /**
    * Sets shopOrderId.
    *
    * @param string|null $shopOrderId  Номер заказа, указанный в отзыве.
    *
    * @return $this
    */
    public function setShopOrderId(?string $shopOrderId = null): self
    {
        $this->shopOrderId = $shopOrderId;

        return $this;
    }




    /**
     * Gets delivery.
     *
     * @return FeedbackDeliveryType|null
     */
    public function getDelivery(): ?FeedbackDeliveryType
    {
        return $this->delivery;
    }

    /**
    * Sets delivery.
    *
    * @param FeedbackDeliveryType|null $delivery
    *
    * @return $this
    */
    public function setDelivery(?FeedbackDeliveryType $delivery = null): self
    {
        $this->delivery = $delivery;

        return $this;
    }

    /**
    * Gets delivery for serialization.
    *
    * @return string|null
    */
    public function getSerializedDelivery(): string|null
    {
        return $this->delivery?->value ? (string) $this->delivery->value : null;
    }

    /**
    * Sets delivery.
    *
    * @param string|FeedbackDeliveryType|null $delivery
    *
    * @return $this
    */
    public function setDeserializedDelivery(string|FeedbackDeliveryType|null $delivery = null): self
    {
        if (is_string($delivery)) {
            $delivery = FeedbackDeliveryType::tryFrom($delivery);
        }

        $this->delivery = $delivery;

        return $this;
    }


}


