<?php
/**
 * SetShipmentPalletsCountRequest
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
 * Class representing the SetShipmentPalletsCountRequest model.
 *
 * Запрос на передачу количества упаковок в отгрузке.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class SetShipmentPalletsCountRequest 
{
        /**
     * Количество упаковок в отгрузке.
     *
     * @var int|null
     * @SerializedName("placesCount")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    #[Assert\GreaterThanOrEqual(0)]
    protected ?int $placesCount = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->placesCount = array_key_exists('placesCount', $data) ? $data['placesCount'] : $this->placesCount;
        }
    }

    /**
     * Gets placesCount.
     *
     * @return int|null
     */
    public function getPlacesCount(): ?int
    {
        return $this->placesCount;
    }

    /**
    * Sets placesCount.
    *
    * @param int|null $placesCount  Количество упаковок в отгрузке.
    *
    * @return $this
    */
    public function setPlacesCount(?int $placesCount): self
    {
        $this->placesCount = $placesCount;

        return $this;
    }



}


