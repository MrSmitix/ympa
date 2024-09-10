<?php
/**
 * GoodsFeedbackIdentifiersDTO
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
 * Class representing the GoodsFeedbackIdentifiersDTO model.
 *
 * Идентификаторы, которые связаны с отзывом.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GoodsFeedbackIdentifiersDTO 
{
        /**
     * Идентификатор заказа на Маркете.
     *
     * @var int|null
     * @SerializedName("orderId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $orderId = null;

    /**
     * Идентификатор модели товара.
     *
     * @var int|null
     * @SerializedName("modelId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $modelId = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->orderId = array_key_exists('orderId', $data) ? $data['orderId'] : $this->orderId;
            $this->modelId = array_key_exists('modelId', $data) ? $data['modelId'] : $this->modelId;
        }
    }

    /**
     * Gets orderId.
     *
     * @return int|null
     */
    public function getOrderId(): ?int
    {
        return $this->orderId;
    }

    /**
    * Sets orderId.
    *
    * @param int|null $orderId  Идентификатор заказа на Маркете.
    *
    * @return $this
    */
    public function setOrderId(?int $orderId): self
    {
        $this->orderId = $orderId;

        return $this;
    }




    /**
     * Gets modelId.
     *
     * @return int|null
     */
    public function getModelId(): ?int
    {
        return $this->modelId;
    }

    /**
    * Sets modelId.
    *
    * @param int|null $modelId  Идентификатор модели товара.
    *
    * @return $this
    */
    public function setModelId(?int $modelId): self
    {
        $this->modelId = $modelId;

        return $this;
    }



}


