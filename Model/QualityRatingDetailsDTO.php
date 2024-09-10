<?php
/**
 * QualityRatingDetailsDTO
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
 * Class representing the QualityRatingDetailsDTO model.
 *
 * Информация о заказах, которые повлияли на индекс качества.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class QualityRatingDetailsDTO 
{
        /**
     * Список заказов, которые повлияли на индекс качества.
     *
     * @var QualityRatingAffectedOrderDTO[]|null
     * @SerializedName("affectedOrders")
     * @Type("array<OpenAPI\Server\Model\QualityRatingAffectedOrderDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\QualityRatingAffectedOrderDTO"),
    ])]
    protected ?array $affectedOrders = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->affectedOrders = array_key_exists('affectedOrders', $data) ? $data['affectedOrders'] : $this->affectedOrders;
        }
    }

    /**
     * Gets affectedOrders.
     *
     * @return QualityRatingAffectedOrderDTO[]|null
     */
    public function getAffectedOrders(): ?array
    {
        return $this->affectedOrders;
    }

    /**
    * Sets affectedOrders.
    *
    * @param QualityRatingAffectedOrderDTO[]|null $affectedOrders  Список заказов, которые повлияли на индекс качества.
    *
    * @return $this
    */
    public function setAffectedOrders(?array $affectedOrders): self
    {
        $this->affectedOrders = $affectedOrders;

        return $this;
    }



}


