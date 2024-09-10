<?php
/**
 * OffersDTO
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
 * Class representing the OffersDTO model.
 *
 * Найденные предложения магазина.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OffersDTO 
{
        /**
     * Список предложений магазина.
     *
     * @var OfferDTO[]|null
     * @SerializedName("offers")
     * @Type("array<OpenAPI\Server\Model\OfferDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\OfferDTO"),
    ])]
    protected ?array $offers = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->offers = array_key_exists('offers', $data) ? $data['offers'] : $this->offers;
        }
    }

    /**
     * Gets offers.
     *
     * @return OfferDTO[]|null
     */
    public function getOffers(): ?array
    {
        return $this->offers;
    }

    /**
    * Sets offers.
    *
    * @param OfferDTO[]|null $offers  Список предложений магазина.
    *
    * @return $this
    */
    public function setOffers(?array $offers): self
    {
        $this->offers = $offers;

        return $this;
    }



}


