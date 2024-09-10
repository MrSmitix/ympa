<?php
/**
 * GoodsStatsWeightDimensionsDTO
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
 * Class representing the GoodsStatsWeightDimensionsDTO model.
 *
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GoodsStatsWeightDimensionsDTO 
{
        /**
     * Длина товара в сантиметрах.
     *
     * @var float|null
     * @SerializedName("length")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $length = null;

    /**
     * Ширина товара в сантиметрах.
     *
     * @var float|null
     * @SerializedName("width")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $width = null;

    /**
     * Высота товара в сантиметрах.
     *
     * @var float|null
     * @SerializedName("height")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $height = null;

    /**
     * Вес товара в килограммах.
     *
     * @var float|null
     * @SerializedName("weight")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $weight = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->length = array_key_exists('length', $data) ? $data['length'] : $this->length;
            $this->width = array_key_exists('width', $data) ? $data['width'] : $this->width;
            $this->height = array_key_exists('height', $data) ? $data['height'] : $this->height;
            $this->weight = array_key_exists('weight', $data) ? $data['weight'] : $this->weight;
        }
    }

    /**
     * Gets length.
     *
     * @return float|null
     */
    public function getLength(): ?float
    {
        return $this->length;
    }

    /**
    * Sets length.
    *
    * @param float|null $length  Длина товара в сантиметрах.
    *
    * @return $this
    */
    public function setLength(?float $length = null): self
    {
        $this->length = $length;

        return $this;
    }




    /**
     * Gets width.
     *
     * @return float|null
     */
    public function getWidth(): ?float
    {
        return $this->width;
    }

    /**
    * Sets width.
    *
    * @param float|null $width  Ширина товара в сантиметрах.
    *
    * @return $this
    */
    public function setWidth(?float $width = null): self
    {
        $this->width = $width;

        return $this;
    }




    /**
     * Gets height.
     *
     * @return float|null
     */
    public function getHeight(): ?float
    {
        return $this->height;
    }

    /**
    * Sets height.
    *
    * @param float|null $height  Высота товара в сантиметрах.
    *
    * @return $this
    */
    public function setHeight(?float $height = null): self
    {
        $this->height = $height;

        return $this;
    }




    /**
     * Gets weight.
     *
     * @return float|null
     */
    public function getWeight(): ?float
    {
        return $this->weight;
    }

    /**
    * Sets weight.
    *
    * @param float|null $weight  Вес товара в килограммах.
    *
    * @return $this
    */
    public function setWeight(?float $weight = null): self
    {
        $this->weight = $weight;

        return $this;
    }



}


