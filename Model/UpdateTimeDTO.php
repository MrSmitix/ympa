<?php
/**
 * UpdateTimeDTO
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
 * Class representing the UpdateTimeDTO model.
 *
 * Время последнего обновления.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class UpdateTimeDTO 
{
        /**
     * Время последнего обновления.
     *
     * @var \DateTime|null
     * @SerializedName("updatedAt")
     * @Type("DateTime")
    */
    #[Assert\NotNull]
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $updatedAt = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->updatedAt = array_key_exists('updatedAt', $data) ? $data['updatedAt'] : $this->updatedAt;
        }
    }

    /**
     * Gets updatedAt.
     *
     * @return \DateTime|null
     */
    public function getUpdatedAt(): ?\DateTime
    {
        return $this->updatedAt;
    }

    /**
    * Sets updatedAt.
    *
    * @param \DateTime|null $updatedAt  Время последнего обновления.
    *
    * @return $this
    */
    public function setUpdatedAt(?\DateTime $updatedAt): self
    {
        $this->updatedAt = $updatedAt;

        return $this;
    }



}


