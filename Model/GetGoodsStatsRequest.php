<?php
/**
 * GetGoodsStatsRequest
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
 * Class representing the GetGoodsStatsRequest model.
 *
 * Запрос отчета по товарам.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetGoodsStatsRequest 
{
        /**
     * Список ваших идентификаторов SKU.
     *
     * @var string[]|null
     * @SerializedName("shopSkus")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    #[Assert\Count(max: 500)]
    #[Assert\Count(min: 1)]
    protected ?array $shopSkus = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->shopSkus = array_key_exists('shopSkus', $data) ? $data['shopSkus'] : $this->shopSkus;
        }
    }

    /**
     * Gets shopSkus.
     *
     * @return string[]|null
     */
    public function getShopSkus(): ?array
    {
        return $this->shopSkus;
    }

    /**
    * Sets shopSkus.
    *
    * @param string[]|null $shopSkus  Список ваших идентификаторов SKU.
    *
    * @return $this
    */
    public function setShopSkus(?array $shopSkus): self
    {
        $this->shopSkus = $shopSkus;

        return $this;
    }



}


