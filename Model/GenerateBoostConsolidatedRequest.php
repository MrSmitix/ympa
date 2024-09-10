<?php
/**
 * GenerateBoostConsolidatedRequest
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
 * Class representing the GenerateBoostConsolidatedRequest model.
 *
 * Данные, необходимые для генерации отчета.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GenerateBoostConsolidatedRequest 
{
        /**
     * Идентификатор бизнеса.
     *
     * @var int|null
     * @SerializedName("businessId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $businessId = null;

    /**
     * Начало периода, включительно.
     *
     * @var \DateTime|null
     * @SerializedName("dateFrom")
     * @Type("DateTime<'Y-m-d'>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $dateFrom = null;

    /**
     * Конец периода, включительно.
     *
     * @var \DateTime|null
     * @SerializedName("dateTo")
     * @Type("DateTime<'Y-m-d'>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $dateTo = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->businessId = array_key_exists('businessId', $data) ? $data['businessId'] : $this->businessId;
            $this->dateFrom = array_key_exists('dateFrom', $data) ? $data['dateFrom'] : $this->dateFrom;
            $this->dateTo = array_key_exists('dateTo', $data) ? $data['dateTo'] : $this->dateTo;
        }
    }

    /**
     * Gets businessId.
     *
     * @return int|null
     */
    public function getBusinessId(): ?int
    {
        return $this->businessId;
    }

    /**
    * Sets businessId.
    *
    * @param int|null $businessId  Идентификатор бизнеса.
    *
    * @return $this
    */
    public function setBusinessId(?int $businessId): self
    {
        $this->businessId = $businessId;

        return $this;
    }




    /**
     * Gets dateFrom.
     *
     * @return \DateTime|null
     */
    public function getDateFrom(): ?\DateTime
    {
        return $this->dateFrom;
    }

    /**
    * Sets dateFrom.
    *
    * @param \DateTime|null $dateFrom  Начало периода, включительно.
    *
    * @return $this
    */
    public function setDateFrom(?\DateTime $dateFrom): self
    {
        $this->dateFrom = $dateFrom;

        return $this;
    }




    /**
     * Gets dateTo.
     *
     * @return \DateTime|null
     */
    public function getDateTo(): ?\DateTime
    {
        return $this->dateTo;
    }

    /**
    * Sets dateTo.
    *
    * @param \DateTime|null $dateTo  Конец периода, включительно.
    *
    * @return $this
    */
    public function setDateTo(?\DateTime $dateTo): self
    {
        $this->dateTo = $dateTo;

        return $this;
    }



}


