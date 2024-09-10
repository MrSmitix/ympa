<?php
/**
 * PagedReturnsDTO
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
 * Class representing the PagedReturnsDTO model.
 *
 * Возвраты.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class PagedReturnsDTO 
{
        /**
     * @var ForwardScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Type("OpenAPI\Server\Model\ForwardScrollingPagerDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\ForwardScrollingPagerDTO")]
    protected ?ForwardScrollingPagerDTO $paging = null;

    /**
     * Список возвратов.
     *
     * @var ReturnDTO[]|null
     * @SerializedName("returns")
     * @Type("array<OpenAPI\Server\Model\ReturnDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\ReturnDTO"),
    ])]
    protected ?array $returns = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->paging = array_key_exists('paging', $data) ? $data['paging'] : $this->paging;
            $this->returns = array_key_exists('returns', $data) ? $data['returns'] : $this->returns;
        }
    }

    /**
     * Gets paging.
     *
     * @return ForwardScrollingPagerDTO|null
     */
    public function getPaging(): ?ForwardScrollingPagerDTO
    {
        return $this->paging;
    }

    /**
    * Sets paging.
    *
    * @param ForwardScrollingPagerDTO|null $paging
    *
    * @return $this
    */
    public function setPaging(?ForwardScrollingPagerDTO $paging = null): self
    {
        $this->paging = $paging;

        return $this;
    }




    /**
     * Gets returns.
     *
     * @return ReturnDTO[]|null
     */
    public function getReturns(): ?array
    {
        return $this->returns;
    }

    /**
    * Sets returns.
    *
    * @param ReturnDTO[]|null $returns  Список возвратов.
    *
    * @return $this
    */
    public function setReturns(?array $returns): self
    {
        $this->returns = $returns;

        return $this;
    }



}


