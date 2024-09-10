<?php
/**
 * OrdersStatsCommissionDTO
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
 * Class representing the OrdersStatsCommissionDTO model.
 *
 * Информация о стоимости услуг.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OrdersStatsCommissionDTO 
{
        /**
     * @var OrdersStatsCommissionType|null
     * @SerializedName("type")
    * @Accessor(getter="getSerializedType", setter="setDeserializedType")
    * @Type("string")
    */
    protected ?OrdersStatsCommissionType $type = null;

    /**
     * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.
     *
     * @var float|null
     * @SerializedName("actual")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $actual = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->actual = array_key_exists('actual', $data) ? $data['actual'] : $this->actual;
        }
    }

    /**
     * Gets type.
     *
     * @return OrdersStatsCommissionType|null
     */
    public function getType(): ?OrdersStatsCommissionType
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param OrdersStatsCommissionType|null $type
    *
    * @return $this
    */
    public function setType(?OrdersStatsCommissionType $type = null): self
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
    * @param string|OrdersStatsCommissionType|null $type
    *
    * @return $this
    */
    public function setDeserializedType(string|OrdersStatsCommissionType|null $type = null): self
    {
        if (is_string($type)) {
            $type = OrdersStatsCommissionType::tryFrom($type);
        }

        $this->type = $type;

        return $this;
    }



    /**
     * Gets actual.
     *
     * @return float|null
     */
    public function getActual(): ?float
    {
        return $this->actual;
    }

    /**
    * Sets actual.
    *
    * @param float|null $actual  Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.
    *
    * @return $this
    */
    public function setActual(?float $actual = null): self
    {
        $this->actual = $actual;

        return $this;
    }



}


