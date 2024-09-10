<?php
/**
 * ModelPriceDTO
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
 * Class representing the ModelPriceDTO model.
 *
 * Информация о ценах на модель товара.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ModelPriceDTO 
{
        /**
     * Средняя цена предложения для модели в регионе.
     *
     * @var float|null
     * @SerializedName("avg")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $avg = null;

    /**
     * Максимальная цена предложения для модели в регионе.
     *
     * @var float|null
     * @SerializedName("max")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $max = null;

    /**
     * Минимальная цена предложения для модели в регионе.
     *
     * @var float|null
     * @SerializedName("min")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $min = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->avg = array_key_exists('avg', $data) ? $data['avg'] : $this->avg;
            $this->max = array_key_exists('max', $data) ? $data['max'] : $this->max;
            $this->min = array_key_exists('min', $data) ? $data['min'] : $this->min;
        }
    }

    /**
     * Gets avg.
     *
     * @return float|null
     */
    public function getAvg(): ?float
    {
        return $this->avg;
    }

    /**
    * Sets avg.
    *
    * @param float|null $avg  Средняя цена предложения для модели в регионе.
    *
    * @return $this
    */
    public function setAvg(?float $avg = null): self
    {
        $this->avg = $avg;

        return $this;
    }




    /**
     * Gets max.
     *
     * @return float|null
     */
    public function getMax(): ?float
    {
        return $this->max;
    }

    /**
    * Sets max.
    *
    * @param float|null $max  Максимальная цена предложения для модели в регионе.
    *
    * @return $this
    */
    public function setMax(?float $max = null): self
    {
        $this->max = $max;

        return $this;
    }




    /**
     * Gets min.
     *
     * @return float|null
     */
    public function getMin(): ?float
    {
        return $this->min;
    }

    /**
    * Sets min.
    *
    * @param float|null $min  Минимальная цена предложения для модели в регионе.
    *
    * @return $this
    */
    public function setMin(?float $min = null): self
    {
        $this->min = $min;

        return $this;
    }



}


