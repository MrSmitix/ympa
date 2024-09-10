<?php
/**
 * GetQuarantineOffersResultDTO
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
 * Class representing the GetQuarantineOffersResultDTO model.
 *
 * Список товаров в карантине.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetQuarantineOffersResultDTO 
{
        /**
     * @var ScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Type("OpenAPI\Server\Model\ScrollingPagerDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\ScrollingPagerDTO")]
    protected ?ScrollingPagerDTO $paging = null;

    /**
     * Страница списка товаров в карантине.
     *
     * @var QuarantineOfferDTO[]|null
     * @SerializedName("offers")
     * @Type("array<OpenAPI\Server\Model\QuarantineOfferDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\QuarantineOfferDTO"),
    ])]
    protected ?array $offers = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->paging = array_key_exists('paging', $data) ? $data['paging'] : $this->paging;
            $this->offers = array_key_exists('offers', $data) ? $data['offers'] : $this->offers;
        }
    }

    /**
     * Gets paging.
     *
     * @return ScrollingPagerDTO|null
     */
    public function getPaging(): ?ScrollingPagerDTO
    {
        return $this->paging;
    }

    /**
    * Sets paging.
    *
    * @param ScrollingPagerDTO|null $paging
    *
    * @return $this
    */
    public function setPaging(?ScrollingPagerDTO $paging = null): self
    {
        $this->paging = $paging;

        return $this;
    }




    /**
     * Gets offers.
     *
     * @return QuarantineOfferDTO[]|null
     */
    public function getOffers(): ?array
    {
        return $this->offers;
    }

    /**
    * Sets offers.
    *
    * @param QuarantineOfferDTO[]|null $offers  Страница списка товаров в карантине.
    *
    * @return $this
    */
    public function setOffers(?array $offers): self
    {
        $this->offers = $offers;

        return $this;
    }



}


