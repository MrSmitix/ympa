<?php
/**
 * GetPromoConstraintsDTO
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
 * Class representing the GetPromoConstraintsDTO model.
 *
 * Ограничения в акции.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetPromoConstraintsDTO 
{
        /**
     * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.
     *
     * @var int[]|null
     * @SerializedName("warehouseIds")
     * @Type("array<int>")
    */
    #[Assert\All([
        new Assert\Type("int"),
    ])]
    protected ?array $warehouseIds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->warehouseIds = array_key_exists('warehouseIds', $data) ? $data['warehouseIds'] : $this->warehouseIds;
        }
    }

    /**
     * Gets warehouseIds.
     *
     * @return int[]|null
     */
    public function getWarehouseIds(): ?array
    {
        return $this->warehouseIds;
    }

    /**
    * Sets warehouseIds.
    *
    * @param int[]|null $warehouseIds  Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.
    *
    * @return $this
    */
    public function setWarehouseIds(?array $warehouseIds = null): self
    {
        $this->warehouseIds = $warehouseIds;

        return $this;
    }



}


